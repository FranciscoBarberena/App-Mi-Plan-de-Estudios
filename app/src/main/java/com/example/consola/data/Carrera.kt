package com.example.consola.data

import com.example.consola.data.mapas.DataAbogacia
import com.example.consola.data.mapas.DataArquitectura
import com.example.consola.data.mapas.DataDisenoComunicacionVisual
import com.example.consola.data.mapas.DataDisenoIndustrial
import com.example.consola.data.mapas.DataIngenieriaAeroespacial
import com.example.consola.data.mapas.DataIngenieriaCivil
import com.example.consola.data.mapas.DataIngenieriaElectromecanica
import com.example.consola.data.mapas.DataIngenieriaElectronica
import com.example.consola.data.mapas.DataIngenieriaEnAgrimensura
import com.example.consola.data.mapas.DataIngenieriaEnComputacion
import com.example.consola.data.mapas.DataIngenieriaEnEnergiaElectrica
import com.example.consola.data.mapas.DataIngenieriaEnMateriales
import com.example.consola.data.mapas.DataIngenieriaEnTelecomunicaciones
import com.example.consola.data.mapas.DataIngenieriaHidraulica
import com.example.consola.data.mapas.DataIngenieriaIndustrial
import com.example.consola.data.mapas.DataIngenieriaMecanica
import com.example.consola.data.mapas.DataIngenieriaQuimica
import com.example.consola.data.mapas.DataLicenciaturaEnArtesPlasticas
import com.example.consola.data.mapas.DataLicenciaturaEnInformatica
import com.example.consola.data.mapas.DataLicenciaturaEnPsicologia
import com.example.consola.data.mapas.DataLicenciaturaEnSistemas
import com.example.consola.data.mapas.DataMedicina
import com.example.consola.data.mapas.DataProfesoradoEnArtesPlasticas
import com.example.consola.data.mapas.DataProfesoradoEnDisenoComunicacionVisual
import com.example.consola.data.mapas.DataProfesoradoEnDisenoIndustrial
import com.example.consola.data.mapas.DataProfesoradoEnPsicologia
import com.example.consola.data.mapas._InformacionDeCarrera
import java.math.RoundingMode

class Carrera(var nombre: String) {


    private val _materias = mutableListOf<Materia>()

    val materias: List<Materia>
        get() = _materias


    companion object {
        val carrerasDisponibles = mapOf(
            "Arquitectura" to DataArquitectura,
            "Licenciatura en Sistemas" to DataLicenciaturaEnSistemas,
            "Ingeniería Electromecánica" to DataIngenieriaElectromecanica,
            "Ingeniería Aeroespacial" to DataIngenieriaAeroespacial,
            "Ingeniería en Agrimensura" to DataIngenieriaEnAgrimensura,
            "Ingeniería Civil" to DataIngenieriaCivil,
            "Ingeniería Electrónica" to DataIngenieriaElectronica,
            "Ingeniería en Energía Eléctrica" to DataIngenieriaEnEnergiaElectrica,
            "Ingeniería en Materiales" to DataIngenieriaEnMateriales,
            "Ingeniería en Telecomunicaciones" to DataIngenieriaEnTelecomunicaciones,
            "Ingeniería Hidraúlica" to DataIngenieriaHidraulica,
            "Ingeniería Industrial" to DataIngenieriaIndustrial,
            "Ingeniería Mecánica" to DataIngenieriaMecanica,
            "Ingeniería Química" to DataIngenieriaQuimica,
            "Ingeniería en Computación" to DataIngenieriaEnComputacion,
            "Licenciatura en Informática" to DataLicenciaturaEnInformatica,
            "Licenciatura en Artes Plásticas" to DataLicenciaturaEnArtesPlasticas,
            "Profesorado en Artes Plásticas" to DataProfesoradoEnArtesPlasticas,
            "Licenciatura en Psicología" to DataLicenciaturaEnPsicologia,
            "Diseño Industrial" to DataDisenoIndustrial,
            "Profesorado en Diseño Industrial" to DataProfesoradoEnDisenoIndustrial,
            "Diseño en Comunicación Visual" to DataDisenoComunicacionVisual,
            "Profesorado en Diseño en Comunicación Visual" to DataProfesoradoEnDisenoComunicacionVisual,
            "Abogacía" to DataAbogacia,
            "Profesorado en Psicología" to DataProfesoradoEnPsicologia,
            "Medicina" to DataMedicina
        ).toSortedMap()
    }

    private val carreraActual: _InformacionDeCarrera = carrerasDisponibles[nombre]
        ?: throw IllegalArgumentException("Carrera no soportada")


    private val cantidadDeMaterias: Int = carreraActual.nombresDeMaterias.size


    init {
        for (i in 0 until cantidadDeMaterias) {
            _materias.add(Materia(i, carreraActual.nombresDeMaterias[i]))
        }
        //Aplicar correlatividades
        aplicarReglasCorrelatividades(carreraActual.reglasDeCorrelatividadesFinalConCursada) { hija, padre ->
            hija.agregarFinalRequeridoParaCursar(padre)
        }

        aplicarReglasCorrelatividades(carreraActual.reglasDeCorrelatividadesCursadaConCursada) { hija, padre ->
            hija.agregarCursadaRequeridaParaCursar(padre)
        }

        aplicarReglasCorrelatividades(carreraActual.reglasDeCorrelatividadesCursadaConFinal) { hija, padre ->
            hija.agregarCursadaRequeridaParaFinal(padre)
        }

        aplicarReglasCorrelatividades(carreraActual.reglasDeCorrelatividadesFinalConFinal) { hija, padre ->
            hija.agregarFinalRequeridoParaFinal(padre)
        }
        //Aplicar requisitos de cantidad de aprobadas
        aplicarReglasCantidadDeAprobadas(carreraActual.cantidadDeAprobadasParaCursar) { materia, cantidad ->
            materia.definirCantidadDeAprobadasParaCursar(cantidad)
        }
        aplicarReglasCantidadDeAprobadas(carreraActual.cantidadDeAprobadasParaFinal) { materia, cantidad ->
            materia.definirCantidadDeAprobadasParaFinal(cantidad)
        }
        aplicarReglasCantidadDeAprobadas(carreraActual.cantidadDeCursadasParaCursar) { materia, cantidad ->
            materia.definirCantidadDeCursadasParaCursar(cantidad)
        }
        aplicarReglasCantidadDeAprobadas(carreraActual.cantidadDeCursadasParaFinal) { materia, cantidad ->
            materia.definirCantidadDeCursadasParaFinal(cantidad)
        }

    }

    val cantidadDeMateriasAprobadas: Int
        get() = materias.count { it.estaAprobada }

    val cantidadDeCursadasAprobadas: Int
        get() = materias.count { it.cursadaAprobada }

    val promedio: Double
        get() {
            val materiasConNota = materias.filter { it.estaAprobada }
            if (materiasConNota.isEmpty()) {
                return 0.0
            } else return (materiasConNota.sumOf { it.nota } / materiasConNota.size.toDouble()).toBigDecimal()
                .setScale(2, RoundingMode.HALF_UP).toDouble()
        }

    val porcentaje: Double
        get() = if (materias.isEmpty()) {
            0.0
        } else ((materias.count { it.estaAprobada }
            .toDouble() / materias.size) * 100).toBigDecimal()
            .setScale(2, RoundingMode.HALF_UP).toDouble()

    fun aplicarReglasCorrelatividades(
        mapaReglas: Map<Int, List<Int>>?,
        accion: (Materia, Materia) -> Unit
    ) {
        mapaReglas?.forEach { (idHijo, listaIdsPadres) ->
            val materiaHija = materias.getOrNull(idHijo)
            if (materiaHija != null) {
                for (idPadre in listaIdsPadres) {
                    val materiaPadre = materias.getOrNull(idPadre)
                    if (materiaPadre != null) {
                        accion(materiaHija, materiaPadre)
                    }
                }
            }
        }
    }

    fun aplicarReglasCantidadDeAprobadas(
        mapaReglas: Map<Int, Int>,
        accion: (Materia, Int) -> Unit
    ) {
        mapaReglas.forEach { idMateria, cantidad ->
            val materia = materias.getOrNull(idMateria)
            if (materia != null) {
                accion(materia, cantidad)
                if (cantidad != 0) {
                    materia.cumpleCantidadParaCursar = cantidadDeMateriasAprobadas >= cantidad
                    materia.cumpleCantidadParaFinal = cantidadDeMateriasAprobadas >= cantidad
                    materia.cantidadFaltanteDeFinalesParaCursar =
                        cantidad - cantidadDeMateriasAprobadas
                    materia.cantidadFaltanteDeFinalesParaFinal =
                        cantidad - cantidadDeMateriasAprobadas
                }
            }
        }
    }

    fun hacerClickEnCursada(ID: Int) = materias[ID].hacerClickEnCursada()


    fun agregarNota(nota: Int, ID: Int) {
        materias[ID].agregarNota(nota)
        actualizarEstadoDeCantidadFaltantes()

    }

    fun actualizarEstadoDeCantidadFaltantes() {
        materias.forEach { materia ->
            materia.cumpleCantidadParaCursar =
                (cantidadDeMateriasAprobadas >= materia.cantidadDeAprobadasRequeridasParaCursar) && (cantidadDeCursadasAprobadas >= materia.cantidadDeCursadasParaCursar)
            materia.cumpleCantidadParaFinal =
                (cantidadDeMateriasAprobadas >= materia.cantidadDeMateriasAprobadasParaFinal) && (cantidadDeCursadasAprobadas >= materia.cantidadDeCursadasParaFinal)
            materia.cantidadFaltanteDeFinalesParaCursar =
                (materia.cantidadDeAprobadasRequeridasParaCursar - cantidadDeMateriasAprobadas).coerceAtLeast(0)
            materia.cantidadFaltanteDeFinalesParaFinal =
                (materia.cantidadDeMateriasAprobadasParaFinal - cantidadDeMateriasAprobadas).coerceAtLeast(0)
            materia.cantidadFaltanteDeCursadasParaCursar =
                (materia.cantidadDeCursadasParaCursar - cantidadDeCursadasAprobadas).coerceAtLeast(0)
            materia.cantidadFaltanteDeCursadasParaFinal =
                (materia.cantidadDeCursadasParaFinal - cantidadDeCursadasAprobadas).coerceAtLeast(0)
        }
    }




}