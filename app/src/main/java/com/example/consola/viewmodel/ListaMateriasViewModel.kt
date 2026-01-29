package com.example.consola.viewmodel

import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.util.Log
import android.util.Log.e
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.graphics.toArgb
import androidx.core.graphics.ColorUtils
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.consola.data.AppDatabase
import com.example.consola.data.Carrera
import com.example.consola.data.Materia
import com.example.consola.data.MateriaEntity
import kotlinx.coroutines.launch
import kotlin.String
import android.net.Uri
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter



enum class EstadoPantalla {
    CARGANDO,
    SELECCION_CARRERA,
    PRINCIPAL,
    CONFIGURACION,

    COLABORAR
}
class ListaMateriasViewModel(application: Application) : AndroidViewModel(application) {


    private val db = AppDatabase.getDatabase(application)
    private val dao = db.materiaDao()

    var estadoPantalla by mutableStateOf(EstadoPantalla.CARGANDO)

    private lateinit var logicaCarrera: Carrera


    init {
        viewModelScope.launch {
            val materiasGuardadas = dao.obtenerTodas()

            if (materiasGuardadas.isEmpty()) {
                estadoPantalla = EstadoPantalla.SELECCION_CARRERA
            } else {
                try {
                    val nombreGuardado = obtenerCarreraGuardada()
                    val nombreReal = nombreGuardado ?: Carrera.carrerasDisponibles.keys.first()
                    logicaCarrera = Carrera(nombreReal)
                    nombre = logicaCarrera.nombre
                    _listaUi.clear()
                    _listaUi.addAll(logicaCarrera.materias)
                    actualizarUiDesdeLaBaseDeDatos(materiasGuardadas)
                    promedioUi.value = logicaCarrera.promedio
                    porcentajeUi.value = logicaCarrera.porcentaje
                    logicaCarrera.actualizarEstadoDeCantidadFaltantes()
                    estadoPantalla = EstadoPantalla.PRINCIPAL

                } catch (e: Exception) {
                    Log.e("ViewModel", "Error fatal al restaurar: ${e.message}")
                    guardarPreferenciaCarrera("")
                    estadoPantalla = EstadoPantalla.SELECCION_CARRERA
                }
            }
        }
    }


    fun seleccionarCarrera(nombreCarrera: String) {
        viewModelScope.launch {
            try {
                logicaCarrera = Carrera(nombreCarrera)
                nombre = nombreCarrera
                guardarPreferenciaCarrera(nombreCarrera)
                _listaUi.clear()
                _listaUi.addAll(logicaCarrera.materias)
                guardarTodoInicialmente()
                promedioUi.value = logicaCarrera.promedio
                porcentajeUi.value = logicaCarrera.porcentaje
                estadoPantalla = EstadoPantalla.PRINCIPAL
            } catch (e: Exception) {
                Log.e("ViewModel", "Error al seleccionar: ${e.message}")
            }
        }
    }

    val _listaUi = mutableStateListOf<Materia>()
    val listaUi: List<Materia> get() = _listaUi
    var nombre by mutableStateOf("Cargando...")
        private set


    val listaDeCarreras: List<String> = try {
        Carrera.carrerasDisponibles.keys.toList()
    } catch (e: Exception) {
        emptyList()
    }


    val promedioUi = mutableStateOf(0.0)

    val porcentajeUi = mutableStateOf(0.0)


    fun agregarNota(ID: Int, notaDelMenu: Int) {
        try {
            logicaCarrera.agregarNota(notaDelMenu, ID)
            promedioUi.value = logicaCarrera.promedio
            porcentajeUi.value = logicaCarrera.porcentaje
            //Actualiza la base de datos
            viewModelScope.launch {
                val materiaModificada = listaUi.find { it.id == ID }
                if (materiaModificada != null) {
                    dao.actualizar(
                        MateriaEntity(
                            id = materiaModificada.id,
                            nombre = materiaModificada.nombre,
                            nota = materiaModificada.nota,
                            cursadaAprobada = materiaModificada.cursadaAprobada
                        )
                    )
                }
            }
        } catch (e: Exception) {
            mensajeErrorAprobar = e.message
        }
    }

    fun aprobarCursada(ID: Int) {
        try {
            logicaCarrera.hacerClickEnCursada(ID)
            viewModelScope.launch {
                // Actualiza la base de datos
                val materiaModificada = listaUi.find { it.id == ID }
                if (materiaModificada != null) {
                    dao.actualizar(
                        MateriaEntity(
                            id = materiaModificada.id,
                            nombre = materiaModificada.nombre,
                            nota = materiaModificada.nota,
                            cursadaAprobada = materiaModificada.cursadaAprobada
                        )
                    )
                }
            }
        } catch (e: Exception) {
            mensajeErrorCursada = e.message
        }
    }

    var mensajeErrorCursada by mutableStateOf<String?>(null)
        private set

    var mensajeErrorAprobar by mutableStateOf<String?>(null)
        private set

    fun limpiarMensajeErrorCursada() {
        mensajeErrorCursada = null
    }

    fun limpiarMensajeErrorAprobar() {
        mensajeErrorAprobar = null
    }

    private suspend fun guardarTodoInicialmente() {
        val listaParaGuardar = listaUi.map { materiaUi ->
            MateriaEntity(
                id = materiaUi.id,
                nombre = materiaUi.nombre,
                nota = materiaUi.nota,
                cursadaAprobada = materiaUi.cursadaAprobada
            )
        }
        dao.insertarTodas(listaParaGuardar)
    }

    private fun actualizarUiDesdeLaBaseDeDatos(datosGuardados: List<MateriaEntity>) {
        val datosOrdenados = datosGuardados.sortedBy { it.id }
        listaUi.forEach { materiaUi ->
            val datoGuardado = datosOrdenados.find { it.id == materiaUi.id }
            if (datoGuardado != null) {
                materiaUi.restaurarEstado(datoGuardado.nota, datoGuardado.cursadaAprobada)
            }

        }
        logicaCarrera.actualizarEstadoDeCantidadFaltantes()
        promedioUi.value = logicaCarrera.promedio
        porcentajeUi.value = logicaCarrera.porcentaje
    }


    //TEMA OSCURO
    var esTemaOscuro by mutableStateOf(obtenerPreferenciaTema())
        private set

    fun cambiarTema(esOscuro: Boolean) {
        esTemaOscuro = esOscuro
        guardarPreferenciaTema(esOscuro)
    }

    private fun guardarPreferenciaTema(esOscuro: Boolean) {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        with(sharedPref.edit()) {
            putBoolean("TEMA_OSCURO", esOscuro)
            apply()
        }
    }

    //COLOR DE ACENTO

    private fun Color.getHue(): Float {
        val hsb = FloatArray(3)
        ColorUtils.colorToHSL(this.toArgb(), hsb)
        return hsb[0]
    }

    private val coloresDisponibles = listOf(
        Color(0xFF5C6BC0),
        Color(0xFFCC5554),
        Color(0xFFD75480),
        Color(0xFFAB47BC),
        Color(0xFF7E57C2),
        Color(0xFF32B1C2),
        Color(0xFF42A5F5),
        Color(0xFF29B6F6),
        Color(0xFF26A69A),
        Color(0xFF66BB6A),
        Color(0xFF9CCC65),
        Color(0xFFE19D47),
        Color(0xFFFF7043),
        Color(0xFFd9b99b), //Beige
    )

    val coloresDisponiblesOrdenados = coloresDisponibles.sortedBy { it.getHue() }


    var colorTema by mutableStateOf(obtenerColorGuardado())
        private set

    fun cambiarColorTema(nuevoColor: Color) {
        colorTema = nuevoColor
        guardarColor(nuevoColor)
    }

    var colorTemaSegunEstado by mutableStateOf(obtenerColorTemaSegunEstado())
        private set

    fun cambiarColorTemaSegunEstado() {
        colorTemaSegunEstado = !colorTemaSegunEstado
        guardarColorTemaSegunEstado(colorTemaSegunEstado)
    }

    private fun obtenerColorTemaSegunEstado(): Boolean {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        val estadoActual = sharedPref.getInt("COLOR_TEMA_ESTADO", 1)

        return if (estadoActual == 1) {
            true
        } else
            false // falso por defecto
    }


    private fun guardarColorTemaSegunEstado(toggled: Boolean) {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        with(sharedPref.edit()) {
            putInt("COLOR_TEMA_ESTADO", if (toggled) 1 else 0)
            apply()
        }
    }

    private fun guardarColor(color: Color) {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        with(sharedPref.edit()) {
            putInt("COLOR_TEMA", color.toArgb())
            apply()
        }
    }

    private fun obtenerColorGuardado(): Color {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        val colorEntero = sharedPref.getInt("COLOR_TEMA", -1)

        return if (colorEntero != -1) {
            Color(colorEntero)
        } else {
            if (esTemaOscuro) coloresDisponibles[4] else coloresDisponibles[8] // Primarios por defecto
        }
    }

    private fun obtenerPreferenciaTema(): Boolean {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        // Busca la preferencia guardada
        if (sharedPref.contains("TEMA_OSCURO")) {
            return sharedPref.getBoolean("TEMA_OSCURO", false)
        }
        // 2. Si no hay preferencia, se fija el tema del sistema operaitvo
        else {
            val currentNightMode =
                getApplication<Application>().resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
            return currentNightMode == Configuration.UI_MODE_NIGHT_YES
        }
    }

    private fun guardarPreferenciaCarrera(nombreCarrera: String) {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        with(sharedPref.edit()) {
            putString("CARRERA_ELEGIDA", nombreCarrera)
            apply()
        }
    }

    private fun obtenerCarreraGuardada(): String? {
        val sharedPref = getApplication<Application>().getSharedPreferences(
            "MisPreferencias",
            Context.MODE_PRIVATE
        )
        return sharedPref.getString("CARRERA_ELEGIDA", null)
    }

    //Exportar e importar

    data class DatosBackup(
        val carrera: String,
        val materias: List<MateriaEntity>
    )

    fun exportarDatos(uri: Uri, context: Context): Boolean {
        return try {
            val listaParaExportar = listaUi.map { materia ->
                MateriaEntity(
                    id = materia.id,
                    nombre = materia.nombre,
                    nota = materia.nota,
                    cursadaAprobada = materia.cursadaAprobada
                )
            }
            val datosParaGuardar = DatosBackup(nombre, listaParaExportar)
            val gson = Gson()
            val jsonString = gson.toJson(datosParaGuardar)

            context.contentResolver.openOutputStream(uri)?.use { outputStream ->
                OutputStreamWriter(outputStream).use { writer ->
                    writer.write(jsonString)
                }
            }
            true
        } catch (e: Exception) {
            e.printStackTrace()
            false
        }
    }

    fun importarDatos(uri: Uri, context: Context): Boolean {
        return try {
            val inputStream = context.contentResolver.openInputStream(uri)
            val reader = BufferedReader(InputStreamReader(inputStream))
            val jsonString = reader.use { it.readText() }

            val gson = Gson()
            val datosImportados: DatosBackup = gson.fromJson(jsonString, DatosBackup::class.java)
            if (datosImportados.carrera.isNotEmpty() && datosImportados.materias.isNotEmpty()) {

                viewModelScope.launch {
                    try {
                        logicaCarrera =
                            Carrera(datosImportados.carrera)
                        nombre = datosImportados.carrera

                        guardarPreferenciaCarrera(datosImportados.carrera)

                        _listaUi.clear()
                        _listaUi.addAll(logicaCarrera.materias)

                    } catch (e: Exception) {
                        Log.e("Importar", "Carrera desconocida: ${datosImportados.carrera}")
                        return@launch
                    }
                    dao.borrarTodo()
                    dao.insertarTodas(datosImportados.materias)
                    actualizarUiDesdeLaBaseDeDatos(datosImportados.materias)
                    promedioUi.value = logicaCarrera.promedio
                    porcentajeUi.value = logicaCarrera.porcentaje
                    estadoPantalla = EstadoPantalla.PRINCIPAL
                }
                true
            } else {
                false
            }
        } catch (e: Exception) {
            Log.e("Importar", "Error al importar: ${e.message}")
            e.printStackTrace()
            false
        }
    }
}








