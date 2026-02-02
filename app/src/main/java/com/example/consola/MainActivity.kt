package com.example.consola

import android.R.attr.minLines
import android.R.attr.onClick
import androidx.compose.ui.text.style.Hyphens
import androidx.compose.ui.text.style.LineBreak
import android.os.Bundle
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import androidx.compose.material.icons.filled.NightsStay // Represents the moon icon
import android.content.Intent
import android.net.Uri
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consola.viewmodel.ListaMateriasViewModel
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.WindowInsetsSides
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.only
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckBox
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.ColorLens
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.EditAttributes
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ImportExport
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Save
import androidx.compose.material.icons.filled.SdStorage
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.AlertDialogDefaults

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.LocaleList

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.text.TextDefaults
import com.example.consola.data.Materia
import com.example.consola.ui.theme.ConsolaTheme
import com.example.consola.ui.theme.Purple40
import com.example.consola.ui.theme.grisPendiente
import com.example.consola.ui.theme.naranjaCursada
import com.example.consola.ui.theme.verdeAprobado
import com.example.consola.viewmodel.EstadoPantalla
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlin.math.round


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val ViewModel: ListaMateriasViewModel = viewModel()
            ConsolaTheme(
                darkTheme = ViewModel.esTemaOscuro,
                colorDeAcento = ViewModel.colorTema
            )
            {
                val estado = ViewModel.estadoPantalla
                when (estado) {
                    EstadoPantalla.CARGANDO -> {

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.background),
                            contentAlignment = Alignment.Center

                        ) {

                        }
                    }

                    EstadoPantalla.SELECCION_CARRERA -> {
                        PantallaBienvenida(
                            onCarreraSeleccionada = { carreraElegida ->
                                // Cuando el usuario elige, avisamos al ViewModel
                                ViewModel.seleccionarCarrera(carreraElegida)
                            },
                            miViewModel = ViewModel
                        )
                    }

                    EstadoPantalla.PRINCIPAL -> {
                        pantallaPrinicipal(ViewModel)
                    }

                    EstadoPantalla.CONFIGURACION -> pantallaConfiguracion(ViewModel)
                    EstadoPantalla.COLABORAR -> pantallaColaborar(ViewModel)
                }
            }

        }

    }
}


@Composable
fun colorSegunBloqueo(
    materia: Materia,
    condicionACheckear: Boolean,
    colorActivo: Color = MaterialTheme.colorScheme.inverseSurface,
    colorBloqueado: Color = Color.Gray
) = if (condicionACheckear) colorActivo else colorBloqueado

fun colorSegunEstado(materia: Materia, estado: String): Color {
    if (estado == "Aprobada")
        return verdeAprobado
    else if (estado == "Cursada")
        return naranjaCursada
    else if (estado == "Pendiente")
        return grisPendiente
    else return Color.Gray
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pantallaPrinicipal(miViewModel: ListaMateriasViewModel = viewModel()) {
    val lista = miViewModel.listaUi
    val snackbarHostState = remember { SnackbarHostState() }
    var mostrarDialogoSalida by remember { mutableStateOf(false) }
    val lateralMenuState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val itemsMenuLateral =
        listOf("Plan de estudios", "Opciones", "Colaborá con la app", "Cambiar de carrera")
    val selectedItem = remember { mutableStateOf(0) }
    val context = LocalContext.current // Necesario para el Toast y exportar
    val launcherExportar = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.CreateDocument("application/json"),
        onResult = { uri ->
            if (uri != null) {
                val exito = miViewModel.exportarDatos(uri, context)
                if (exito) {
                    Toast.makeText(
                        context,
                        "Copia guardada. Ahora podés cambiar de carrera seguro.",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(context, "Error al guardar", Toast.LENGTH_SHORT).show()
                }
            }
        }
    )
    if (mostrarDialogoSalida) {
        AlertDialog(
            onDismissRequest = {
                mostrarDialogoSalida = false
            }, //Si el usuario toca afuera del popup, se cierra
            title = {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "¿Estás seguro que querés cambiar de carrera?",
                        color = MaterialTheme.colorScheme.inverseSurface,
                        modifier = Modifier.weight(1f)
                    )
                    IconButton(
                        onClick = {
                            mostrarDialogoSalida = false


                        },

                        ) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Cerrar",
                            tint = MaterialTheme.colorScheme.inverseSurface
                        )
                    }
                }

            },
            text = {
                Text(
                    text = "Perderás todo el registro de la carrera actual. Podés guardar tus datos antes",
                    color = Color.Gray
                )
            },
            containerColor = MaterialTheme.colorScheme.background,
            confirmButton = { // Botón de confirmación
                TextButton(onClick = {
                    mostrarDialogoSalida = false
                    // Acción real de salir:
                    scope.launch { lateralMenuState.close() }
                    miViewModel.estadoPantalla = EstadoPantalla.SELECCION_CARRERA
                }) {
                    Text("Cambiar de carrera", color = Color(0xFFE57373)) // Rojo suave
                }
            },
            dismissButton = { //Botón de exportar
                TextButton(onClick = {
                    val formatoFecha = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                    val fechaActual = formatoFecha.format(Date())
                    launcherExportar.launch("backup_materias_$fechaActual.json")
                }) {
                    Text("Guardar datos", color = MaterialTheme.colorScheme.inverseSurface)
                }
            }
        )
    }
    setUpSnackBar(miViewModel, snackbarHostState)
    BackHandler(enabled = lateralMenuState.isOpen) {
        scope.launch { lateralMenuState.close() }
    } //el boton de retroceder cierra el lateral menu
    ModalNavigationDrawer(
        drawerState = lateralMenuState,
        drawerContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth(0.75f)
                    .fillMaxHeight()
                    .background(color = MaterialTheme.colorScheme.onSurface)
                    .padding(horizontal = 16.dp, vertical = 48.dp)
            )
            {
                itemsMenuLateral.forEachIndexed { index, item ->
                    NavigationDrawerItem(
                        label = {
                            Text(
                                text = item,
                                color = when (index) {
                                    2 -> Color(0xFF66BB6A)
                                    3 -> Color(0xFFE57373)
                                    else -> {
                                        MaterialTheme.colorScheme.inverseSurface
                                    }
                                }
                            )
                        },
                        colors = NavigationDrawerItemDefaults.colors(
                            selectedContainerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.2f), //El copy lo hace más transparente
                        ),
                        selected = selectedItem.value == index,
                        onClick = {
                            when (index) {
                                0 -> {
                                    miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL
                                    scope.launch { lateralMenuState.close() }
                                }

                                1 -> scope.launch {
                                    miViewModel.estadoPantalla = EstadoPantalla.CONFIGURACION
                                }

                                3 -> {
                                    mostrarDialogoSalida = true

                                }

                                2 -> scope.launch {
                                    miViewModel.estadoPantalla = EstadoPantalla.COLABORAR
                                }

                            }
                            if (index != 3)
                                selectedItem.value = index

                        },
                        icon = @Composable {
                            Icon(
                                imageVector = when (index) {
                                    0 -> Icons.Default.Home
                                    1 -> Icons.Default.Settings
                                    3 -> Icons.Default.Warning
                                    else -> Icons.Default.Coffee
                                },
                                contentDescription = item,
                                tint = when (index) {
                                    2 -> Color(0xFF66BB6A)
                                    3 -> Color(0xFFE57373)
                                    else -> {
                                        MaterialTheme.colorScheme.inverseSurface
                                    }

                                }
                            )
                        })
                    Spacer(modifier = Modifier.padding(4.dp))


                }
            }


        }
    ) {
        Scaffold(
            snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
            topBar = { barraSuperior(miViewModel, scope, lateralMenuState) },
            bottomBar = { barraInferior(miViewModel) },
            containerColor = MaterialTheme.colorScheme.background,

            )

        { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {

                LazyColumn(
                    modifier = Modifier

                        .padding(top = 5.dp)
                ) {

                    items(
                        lista,
                        key = { materia -> materia.id })
                    { materia ->

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(
                                    top = 8.dp,
                                    end = 15.dp,
                                    bottom = 8.dp,
                                    start = 15.dp,
                                )
                                .weight(1f),
                            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
                            border = if (miViewModel.colorTemaSegunEstado) BorderStroke(
                                2.dp,
                                colorSegunEstado(materia, materia.estadoDeMateria)
                            ) else BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                            shape = RoundedCornerShape(16.dp),
                            colors = CardDefaults.cardColors(

                                containerColor = MaterialTheme.colorScheme.onBackground
                            )
                        )
                        {

                            Row(
                                modifier = Modifier.padding(all = 16.dp),
                                verticalAlignment = CenterVertically
                            ) {
                                Column(
                                    modifier = Modifier
                                        .padding(start = 8.dp)
                                        .weight(1f)
                                ) {

                                    Text(
                                        text = materia.nombre,
                                        color = colorSegunBloqueo(materia, materia.puedoCursar),
                                        textAlign = TextAlign.Start,
                                        overflow = TextOverflow.Ellipsis,
                                        style = MaterialTheme.typography.titleMedium.copy(
                                            hyphens = Hyphens.Auto, // Guion cuando se queda sin espacio
                                            lineBreak = LineBreak.Paragraph, // Mejora el algoritmo de salto de línea
                                            localeList = LocaleList("es-AR") //Idioma arg para separar en sílabas bien
                                        ),
                                        maxLines = 4,


                                    )
                                    Text(
                                        text = "(${materia.estadoDeMateria})",
                                        style = MaterialTheme.typography.titleMedium,
                                        color = colorSegunEstado(materia, materia.estadoDeMateria),
                                        textAlign = TextAlign.Start,
                                        overflow = TextOverflow.Ellipsis
                                    )
                                }

                                Box(
                                    modifier = Modifier.width(70.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    casillaCheckbox(materia, miViewModel)
                                }

                                Box(
                                    modifier = Modifier.width(165.dp),
                                    contentAlignment = Alignment.CenterEnd
                                ) {

                                    menuDesplegable(materia, miViewModel)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun pantallaConfiguracion(miViewModel: ListaMateriasViewModel) {
    val listaDeOpcionesEnConfiguracion =
        listOf(
            "Tema oscuro", "Color de acento",
            "Color del borde de las materias según su estado (pendiente, cursada, aprobada)",
            "Guardar mis datos", "Importar datos"
        )
    val mostrarDialogoColor = remember { mutableStateOf(false) }
    BackHandler {
        miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL
    }
    val context = LocalContext.current

    // Para exportar
    val launcherExportar = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.CreateDocument("application/json"),
        onResult = { uri ->
            // Si uri no es null, el usuario eligió dónde guardar
            if (uri != null) {
                val exito = miViewModel.exportarDatos(uri, context)
                if (exito) {
                    Toast.makeText(
                        context,
                        "Copia de seguridad guardada con éxito",
                        Toast.LENGTH_LONG
                    ).show()
                } else {
                    Toast.makeText(context, "Error al guardar el archivo", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    )
    val launcherImportar = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.OpenDocument(),
        onResult = { uri ->
            if (uri != null) {
                // Confirmación simple o ejecución directa
                val exito = miViewModel.importarDatos(uri, context)
                if (exito) {
                    Toast.makeText(context, "Datos restaurados correctamente", Toast.LENGTH_LONG)
                        .show()
                    miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL
                } else {
                    Toast.makeText(
                        context,
                        "El archivo está dañado o no es compatible",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }
    )
    if (mostrarDialogoColor.value) {
        DialogoSelectorDeColor(
            coloresDisponibles = miViewModel.coloresDisponiblesOrdenados,
            colorActual = miViewModel.colorTema,
            onColorSeleccionado = { nuevoColor ->
                miViewModel.cambiarColorTema(nuevoColor)
                mostrarDialogoColor.value = false // Cierra al elegir
            },
            onDismiss = { mostrarDialogoColor.value = false }, // Cierra al cancelar/tocar fuera
            onClickSwitched = { miViewModel.cambiarColorTemaSegunEstado() },
            checked = miViewModel.colorTemaSegunEstado
        )
    }
    Scaffold(
        topBar = { barraSuperiorConfiguracion(miViewModel) },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(10.dp)
                .fillMaxWidth()
        ) {
            var cardModifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
            listaDeOpcionesEnConfiguracion.forEach { opcion ->
                when (opcion) {
                    listaDeOpcionesEnConfiguracion[3] -> { // Opción de Exportar
                        cardModifier = cardModifier.clickable {
                            val formatoFecha = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
                            val fechaActual = formatoFecha.format(Date())
                            launcherExportar.launch("backup_materias_$fechaActual.json")
                        }
                    }

                    listaDeOpcionesEnConfiguracion[4] -> { // Opción de Importar
                        cardModifier = cardModifier.clickable {
                            launcherImportar.launch(arrayOf("application/json"))
                        }
                    }
                }
                Card(
                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onBackground),
                    modifier = cardModifier
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 10.dp)
                    ) {
                        when (opcion) {
                            listaDeOpcionesEnConfiguracion[0] -> Icon(
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                    .align(alignment = CenterVertically),
                                imageVector = Icons.Default.NightsStay,
                                contentDescription = "Modo oscuro",
                                tint = MaterialTheme.colorScheme.inverseSurface
                            )

                            listaDeOpcionesEnConfiguracion[1] -> Icon(
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                    .align(alignment = CenterVertically),
                                imageVector = Icons.Default.ColorLens,
                                contentDescription = "Color de acento",
                                tint = MaterialTheme.colorScheme.inverseSurface
                            )

                            listaDeOpcionesEnConfiguracion[2] -> Icon(
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                    .align(alignment = CenterVertically),
                                imageVector = Icons.Default.EditAttributes,
                                contentDescription = "Color de materias según su estado",
                                tint = MaterialTheme.colorScheme.inverseSurface
                            )

                            listaDeOpcionesEnConfiguracion[3] -> Icon(
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                    .align(alignment = CenterVertically),
                                imageVector = Icons.Default.Save,
                                contentDescription = "Hacer backup",
                                tint = MaterialTheme.colorScheme.inverseSurface
                            )

                            listaDeOpcionesEnConfiguracion[4] -> Icon(
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                    .align(alignment = CenterVertically),
                                imageVector = Icons.Default.ImportExport,
                                contentDescription = "Importar",
                                tint = MaterialTheme.colorScheme.inverseSurface
                            )


                        }
                        Text(
                            text = opcion, color = MaterialTheme.colorScheme.inverseSurface,
                            modifier = Modifier
                                .padding(start = 5.dp, top = 5.dp, bottom = 5.dp, end = 5.dp)
                                .align(alignment = CenterVertically)
                                .weight(1f),


                            )
                        Spacer(modifier = Modifier.width(20.dp))
                        val padding = 20.dp
                        when (opcion) {
                            listaDeOpcionesEnConfiguracion[0] ->
                                Switch(
                                    checked = miViewModel.esTemaOscuro,
                                    onCheckedChange = { miViewModel.cambiarTema(!miViewModel.esTemaOscuro) },
                                    modifier = Modifier
                                        .padding(end = padding)
                                )

                            listaDeOpcionesEnConfiguracion[1] -> BotonColor(
                                miViewModel.colorTema,
                                onClick = { mostrarDialogoColor.value = true }, padding
                            )

                            listaDeOpcionesEnConfiguracion[2] ->
                                Switch(
                                    checked = miViewModel.colorTemaSegunEstado,
                                    onCheckedChange = { miViewModel.cambiarColorTemaSegunEstado() },
                                    modifier = Modifier
                                        .padding(end = padding)

                                )

                        }
                    }


                }
            }

        }
    }
}


@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun barraSuperiorColaborar(miViewModel: ListaMateriasViewModel) {
    TopAppBar(
        title = {
            Text(
                text = "Colaborar",
                fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                fontWeight = FontWeight.Bold
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.onSurface,
            titleContentColor = MaterialTheme.colorScheme.inverseSurface
        ),

        navigationIcon = {
            IconButton(onClick = { miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL }) {

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Volver",
                    tint = MaterialTheme.colorScheme.inverseSurface
                )
            }
        },
    )
}

@Composable
fun pantallaColaborar(miViewModel: ListaMateriasViewModel) {
    val context = LocalContext.current
    val url = "https://cafecito.app/franciscobarberena"
    val emailDesarrollador = BuildConfig.EMAIL_DEV
    BackHandler {
        miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL
    }
    Scaffold(
        topBar = { barraSuperiorColaborar(miViewModel) },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(20.dp)
                .verticalScroll(rememberScrollState()),

            //separacion entre tarjetas
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Card(
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onBackground),

                border = BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)


                ) {
                    Text(
                        text = "Si te sirvió la app, podés colaborar con un cafecito ($1000) para mantenerla" +
                                " gratis y libre de anuncios. Gracias!",
                        color = MaterialTheme.colorScheme.inverseSurface,
                        textAlign = TextAlign.Center,
                        fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(bottom = 10.dp, start = 10.dp, end = 10.dp)

                    )

                    Button(onClick = {
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        context.startActivity(intent)
                    }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Row() {
                            Text(
                                "Donar un cafecito ",
                                fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            )
                            Icon(Icons.Default.Coffee, contentDescription = "Ir a cafecito")

                        }


                    }
                }
            }

            Card(
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onBackground),

                border = BorderStroke(2.dp, MaterialTheme.colorScheme.primary),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            ) {
                Column(
                    modifier = Modifier
                        .padding(20.dp)


                ) {
                    Text(
                        text = "Ante cualquier sugerencia o comenatrio sobre la app, contactar al desarrollador:",
                        color = MaterialTheme.colorScheme.inverseSurface,
                        textAlign = TextAlign.Center,
                        fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(
                            bottom = 10.dp,
                            start = 10.dp,
                            end = 10.dp,

                            )

                    )
                    Button(onClick = {
                        val intent = Intent(Intent.ACTION_SENDTO).apply {
                            data = Uri.parse("mailto:")
                            putExtra(Intent.EXTRA_EMAIL, arrayOf(emailDesarrollador))
                            putExtra(Intent.EXTRA_SUBJECT, "Sobre la app Mi Plan de Estudios")
                        }
                        try {
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            Toast.makeText(
                                context,
                                "No hay app de correo instalada",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }, modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Row() {
                            Text(
                                "Enviar correo ",
                                fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                textAlign = TextAlign.Center,
                            )
                            Icon(Icons.Default.Email, contentDescription = "Enviar correo")
                        }

                    }

                }
            }
        }
    }
}


@Composable
fun ItemColorGrid(
    color: Color,
    seleccionado: Boolean,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .aspectRatio(1f) // Mantiene el aspecto circular
            .clip(CircleShape)
            .background(color)
            .clickable { onClick() }
            .border(2.dp, Color.Gray, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        // Solo muestra el check si es el color seleccionado
        if (seleccionado) {
            Icon(
                imageVector = Icons.Default.Check,
                contentDescription = "Seleccionado",
                tint = Color.White,
                modifier = Modifier.size(24.dp)
            )
        }
    }
}

@Composable
fun DialogoSelectorDeColor(
    coloresDisponibles: List<Color>,
    colorActual: Color,
    onColorSeleccionado: (Color) -> Unit,
    onDismiss: () -> Unit,
    onClickSwitched: () -> Unit,
    checked: Boolean
) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = {
            Text(
                text = "Selecciona un color",
                color = MaterialTheme.colorScheme.inverseSurface
            )
        },
        text = {
            Column() {
                LazyVerticalGrid(
                    columns = GridCells.Adaptive(minSize = 60.dp),
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    contentPadding = PaddingValues(vertical = 8.dp)
                ) {
                    items(coloresDisponibles) { color ->
                        ItemColorGrid(
                            color = color,
                            seleccionado = color == colorActual,
                            onClick = { onColorSeleccionado(color) }
                        )
                    }
                }

            }
        },
        tonalElevation = 24.dp,
        confirmButton = {
            TextButton(onClick = onDismiss) {
                Text("Cerrar", color = Color(0xFFEF5350))
            }
        }


    )
}

@Composable
fun BotonColor(color: Color, onClick: () -> Unit, padding: Dp = 0.dp) {
    Button(
        shape = CircleShape,
        border = BorderStroke(color = Color.Gray, width = 2.dp),
        colors = ButtonDefaults.buttonColors(containerColor = color),
        onClick = onClick,
        elevation = ButtonDefaults.buttonElevation(5.dp),
        modifier = Modifier
            .padding(end = padding)
            .size(50.dp)

    ) {

    }
}

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun barraSuperiorConfiguracion(miViewModel: ListaMateriasViewModel) {
    TopAppBar(
        title = {
            Text(
                text = "Opciones",
                fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                fontWeight = FontWeight.Bold
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.onSurface,
            titleContentColor = MaterialTheme.colorScheme.inverseSurface
        ),

        navigationIcon = {
            IconButton(onClick = {
                miViewModel.estadoPantalla = EstadoPantalla.PRINCIPAL
            }) {

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Volver",
                    tint = MaterialTheme.colorScheme.inverseSurface
                )
            }
        },
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun barraSuperior(
    miViewModel: ListaMateriasViewModel,
    scope: CoroutineScope,
    drawerState: DrawerState
) {
    Column(
        modifier = Modifier
            .background(
                MaterialTheme.colorScheme.background
            )
            .padding(vertical = 0.dp)
            .fillMaxWidth()

    ) {

        TopAppBar(
            title = {
                Text(
                    text = miViewModel.nombre,
                    fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                    fontWeight = FontWeight.Bold
                )
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = MaterialTheme.colorScheme.onSurface,
                titleContentColor = MaterialTheme.colorScheme.inverseSurface
            ),
            navigationIcon = {
                IconButton(onClick = {
                    scope.launch { drawerState.open() }
                }) {

                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menú",
                        tint = MaterialTheme.colorScheme.inverseSurface
                    )
                }
            },
        )
        filaEncabezado()
    }

}

@Composable
fun filaEncabezado() {
    Surface(
        color = MaterialTheme.colorScheme.onSurface,
        modifier = Modifier.fillMaxWidth(),
        shadowElevation = 4.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .windowInsetsPadding(WindowInsets.safeDrawing.only(WindowInsetsSides.Horizontal))
                .padding(vertical = 12.dp, horizontal = 32.dp),
            verticalAlignment = CenterVertically,
        ) {
            Text(
                text = "Materia",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray,
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Start
            )
            Text(
                text = "Cursada",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(70.dp)
            )
            Text(
                text = "Nota",
                style = MaterialTheme.typography.titleMedium,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(165.dp)
            )
        }
    }
}

@Composable
fun barraInferior(miViewModel: ListaMateriasViewModel) {
    BottomAppBar(
        containerColor = MaterialTheme.colorScheme.onSurface,
        contentColor = MaterialTheme.colorScheme.inverseSurface,
        content = {
            Column(modifier = Modifier.padding(vertical = 10.dp)) {
                LinearProgressIndicator(
                    progress = { (miViewModel.porcentajeUi.value / 100).toFloat() },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp, start = 5.dp, end = 5.dp)
                        .height(10.dp),
                    strokeCap = StrokeCap.Round,
                    gapSize = 0.dp,
                    trackColor = MaterialTheme.colorScheme.surface,
                    color = MaterialTheme.colorScheme.primary
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 15.dp,
                            start = 10.dp,
                            end = 10.dp
                        ), // Separación de la barra
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = CenterVertically
                ) {
                    Text(
                        text = "Promedio: ${miViewModel.promedioUi.value.toString()}",
                        fontSize = 16.sp,
                        fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                    )
                    Text(
                        text = "Porcentaje: ${miViewModel.porcentajeUi.value.toString()}%",
                        fontSize = 16.sp,
                        fontStyle = MaterialTheme.typography.titleLarge.fontStyle,
                    )
                }
            }
        }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun menuDesplegable(materia: Materia, miViewModel: ListaMateriasViewModel) {
    val listaDeNotasPosibles = listOf("-") + (4..10).map { it.toString() }
    var isExpanded by remember { mutableStateOf(false) }

    ExposedDropdownMenuBox(
        expanded = isExpanded,
        onExpandedChange = {
            if (materia.puedoRendirFinal)
                isExpanded = !isExpanded
            else
                miViewModel.agregarNota(materia.id, 4)
        },
        modifier = Modifier
            .padding(1.dp)
            .width(165.dp)

    ) {
        val textoEnPantalla =
            if (((materia.nota == 0) && (materia.puedoRendirFinal)) || (!materia.puedoRendirFinal && !materia.puedoCursar)) "-"
            else if (!materia.puedoRendirFinal) "BLOQUEADA"
            else materia.nota.toString()
        TextField(
            value = textoEnPantalla,
            colors = ExposedDropdownMenuDefaults.textFieldColors(
                focusedLabelColor = colorSegunBloqueo(
                    materia,
                    materia.puedoRendirFinal,
                    colorActivo = MaterialTheme.colorScheme.inverseSurface
                ),
                unfocusedLabelColor = colorSegunBloqueo(materia, materia.puedoRendirFinal),
                focusedTextColor = colorSegunBloqueo(materia, materia.puedoRendirFinal),
                unfocusedTextColor = colorSegunBloqueo(materia, materia.puedoRendirFinal),
                focusedContainerColor = MaterialTheme.colorScheme.onSurface,
                unfocusedContainerColor = MaterialTheme.colorScheme.onSurface,
                focusedIndicatorColor = if (miViewModel.colorTemaSegunEstado)
                    colorSegunEstado(materia, materia.estadoDeMateria)
                else MaterialTheme.colorScheme.primary,


                ),
            onValueChange = { },
            singleLine = true,
            modifier = Modifier.menuAnchor(),
            label = { Text(text = "Nota") },
            readOnly = true,
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(
                    expanded = isExpanded
                )
            },

            )

        ExposedDropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            containerColor = MaterialTheme.colorScheme.background
        ) {
            listaDeNotasPosibles.forEach { nota ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = nota,
                            color = MaterialTheme.colorScheme.inverseSurface
                        )
                    },
                    onClick = {
                        val notaAEnviar = if (nota == "-") 0 else nota.toInt()
                        miViewModel.agregarNota(materia.id, notaAEnviar)
                        isExpanded = false
                    },
                    contentPadding = ExposedDropdownMenuDefaults.ItemContentPadding
                )

            }
        }

    }
}


@Composable
fun casillaCheckbox(materia: Materia, miViewModel: ListaMateriasViewModel) {
    Checkbox(
        modifier = Modifier.padding(),
        checked = materia.cursadaAprobada,
        onCheckedChange = {
            miViewModel.aprobarCursada(
                materia.id
            )
        },
        colors = colors(
            checkedColor = if (materia.estaAprobada) Color(0xFF388E3C) else Color(0xFFF57F17),
            uncheckedColor = colorSegunBloqueo(materia, materia.puedoCursar)
        ),
        enabled = true,

        )
}

@Composable
fun setUpSnackBar(
    miViewModel: ListaMateriasViewModel,
    snackbarHostState: SnackbarHostState
) {
    val mensajeError = miViewModel.mensajeErrorCursada
    val mensajeErrorFinal = miViewModel.mensajeErrorAprobar
    LaunchedEffect(mensajeError) {
        if (mensajeError != null) {
            snackbarHostState.showSnackbar(
                message = mensajeError,
                duration = SnackbarDuration.Short,
                withDismissAction = true
            )
            miViewModel.limpiarMensajeErrorCursada()
        }
    }
    LaunchedEffect(mensajeErrorFinal) {
        if (mensajeErrorFinal != null) {
            snackbarHostState.showSnackbar(
                message = mensajeErrorFinal,
                duration = SnackbarDuration.Short,
                withDismissAction = true
            )
            miViewModel.limpiarMensajeErrorAprobar()
        }
    }
}


@Composable
fun PantallaBienvenida(
    miViewModel: ListaMateriasViewModel,
    onCarreraSeleccionada: (String) -> Unit
) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(

                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.inverseSurface,
                modifier = Modifier
                    .size(80.dp)

            )

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "¡Bienvenido!",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.inverseSurface,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Para empezar, elegí tu carrera:",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray,
                modifier = Modifier.padding(top = 8.dp, bottom = 32.dp)
            )
            listaDeCarreras(miViewModel, onCarreraSeleccionada)
        }


    }
}

@Composable
fun listaDeCarreras(
    miViewModel: ListaMateriasViewModel,
    onCarreraSeleccionada: (String) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 24.dp, horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        miViewModel.listaDeCarreras.forEach { carrera ->
            item {
                BotonCarrera(carrera) {
                    onCarreraSeleccionada(carrera)
                }
                Spacer(Modifier.height(16.dp))
            }
        }


    }
}

@Composable
fun BotonCarrera(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp), //Es la altura mínima
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        ),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp)
    ) {
        Text(
            text = text,
            fontSize = 18.sp,
            color = MaterialTheme.colorScheme.onPrimary,
            textAlign = TextAlign.Center
        )
    }
}



