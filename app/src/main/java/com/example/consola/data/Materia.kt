package com.example.consola.data

import android.service.autofill.Validators.and
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

data class Materia(val id: Int, val nombre: String) {

    override fun toString(): String {
        return nombre
    }

    var nota by mutableStateOf(0)
        private set

    val estaAprobada: Boolean
        get() = (nota >= 4) && (puedoRendirFinal)


    private var hizoClickElUsiario by mutableStateOf(false)
    val cursadaAprobada: Boolean
        get() = ((hizoClickElUsiario || estaAprobada)&&(puedoCursar))


    fun hacerClickEnCursada() {
        if (puedoCursar) {
            if (!estaAprobada) {
                this.hizoClickElUsiario = !(this.hizoClickElUsiario)
            } else {
                throw Exception("Ya aprobaste $nombre con $nota. La cursada queda aprobada.")
            }
        } else {
            if (listaDeCursadasQueFaltanAprobarParaCursar.isNotEmpty() || listaDeFinalesQueFaltanAprobarParaCursar.isNotEmpty()) {
                val sb = StringBuilder("No se puede cursar $nombre.\n")

                if (listaDeCursadasQueFaltanAprobarParaCursar.isNotEmpty()) {
                    sb.append("Faltan cursadas:\n${this.listaDeCursadasQueFaltanAprobarParaCursar}\n")
                }
                if (listaDeFinalesQueFaltanAprobarParaCursar.isNotEmpty()) {
                    sb.append("Faltan finales:\n${this.listaDeFinalesQueFaltanAprobarParaCursar}")
                }
                throw Exception(sb.toString().trim())
            }

            if (!cumpleCantidadParaCursar) {
                if (cantidadFaltanteDeFinalesParaCursar > 0)
                    throw Exception("No se puede cursar $nombre. Faltan aprobar $cantidadFaltanteDeFinalesParaCursar materias en la carrera.")
                else if (cantidadFaltanteDeCursadasParaCursar > 0)
                    throw Exception("No se puede cursar $nombre. Faltan aprobar $cantidadFaltanteDeCursadasParaCursar materias en la carrera.")
            }

            throw Exception("No se puede cursar $nombre por requisitos no cumplidos.")
        }
    }

    fun agregarNota(notaNueva: Int) {
        if (notaNueva >= 4) {
            if (puedoRendirFinal) {
                this.nota = notaNueva
            } else {

                if (listaDeCursadasQueFaltanAprobarParaFinal.isNotEmpty() || listaDeFinalesQueFaltanAprobarParaFinal.isNotEmpty()) {
                    val sb = StringBuilder("No se puede rendir final de $nombre.\n")

                    if (listaDeCursadasQueFaltanAprobarParaFinal.isNotEmpty()) {
                        sb.append("Faltan cursadas:\n${this.listaDeCursadasQueFaltanAprobarParaFinal}\n")
                    }
                    if (listaDeFinalesQueFaltanAprobarParaFinal.isNotEmpty()) {
                        sb.append("Faltan finales:\n${this.listaDeFinalesQueFaltanAprobarParaFinal}")
                    }
                    throw Exception(sb.toString().trim())
                }


                if (!cumpleCantidadParaFinal) {

                    if (cantidadFaltanteDeFinalesParaFinal > 0)
                        throw Exception("No se rendir final de $nombre. Faltan aprobar $cantidadFaltanteDeFinalesParaFinal materias en la carrera.")
                    else if (cantidadFaltanteDeCursadasParaFinal > 0)
                        throw Exception("No se puede rendir final de $nombre. Faltan cursar $cantidadFaltanteDeCursadasParaFinal materias en la carrera.")                }
            }
        } else if (notaNueva == 0) {
            this.nota = notaNueva
        }
    }

    private val finalesRequeridosParaCursar = mutableListOf<Materia>()

    fun agregarFinalRequeridoParaCursar(materiaRequerida: Materia) {
        finalesRequeridosParaCursar.add(materiaRequerida)
    }

    private val cursadasRequeridasParaCursar = mutableListOf<Materia>()
    fun agregarCursadaRequeridaParaCursar(cursadaRequerida: Materia) {
        cursadasRequeridasParaCursar.add(cursadaRequerida)
    }

    private val cursadasRequeridasParaFinal = mutableListOf<Materia>()
    fun agregarCursadaRequeridaParaFinal(cursadaRequerida: Materia) {
        cursadasRequeridasParaFinal.add(cursadaRequerida)
    }

    private val finalesRequeridosParaFinal = mutableListOf<Materia>()
    fun agregarFinalRequeridoParaFinal(finalRequerido: Materia) {
        finalesRequeridosParaFinal.add(finalRequerido)
    }

    val estadoDeMateria: String
        get() {
            if (estaAprobada)
                return "Aprobada"
            else if (cursadaAprobada)
                return "Cursada"
            else if (puedoCursar)
                return "Pendiente"
            else
                return "Bloqueada"
        }
    val puedoCursar: Boolean
        get() {
            return finalesRequeridosParaCursar.all { it.estaAprobada } && cursadasRequeridasParaCursar.all { it.cursadaAprobada } && cumpleCantidadParaCursar
        }
    val puedoRendirFinal: Boolean
        get() {
            return finalesRequeridosParaFinal.all { it.estaAprobada } && cursadasRequeridasParaFinal.all { it.cursadaAprobada } && cumpleCantidadParaFinal
        }

    var cumpleCantidadParaCursar by mutableStateOf(true)
        internal set
    var cumpleCantidadParaFinal by mutableStateOf(true)
        internal set

    var cantidadFaltanteDeFinalesParaCursar by mutableStateOf(0)
        internal set
    var cantidadFaltanteDeFinalesParaFinal by mutableStateOf(0)
        internal set
    var cantidadFaltanteDeCursadasParaCursar by mutableStateOf(0)
        internal set
    var cantidadFaltanteDeCursadasParaFinal by mutableStateOf(0)
        internal set
    var cantidadDeAprobadasRequeridasParaCursar = 0
        private set
    var cantidadDeMateriasAprobadasParaFinal = 0
        private set

    var cantidadDeCursadasParaCursar = 0
        private set
    var cantidadDeCursadasParaFinal = 0
        private set


    fun definirCantidadDeAprobadasParaCursar(cantidad: Int) {
        cantidadDeAprobadasRequeridasParaCursar = cantidad
    }


    fun definirCantidadDeAprobadasParaFinal(cantidad: Int) {
        cantidadDeMateriasAprobadasParaFinal = cantidad
    }
    fun definirCantidadDeCursadasParaCursar(cantidad: Int) {
        cantidadDeCursadasParaCursar = cantidad
    }


    fun definirCantidadDeCursadasParaFinal(cantidad: Int) {
        cantidadDeCursadasParaFinal = cantidad
    }


    fun restaurarEstado(nota: Int, cursada: Boolean){
        this.nota = nota
        if (cursada && !estaAprobada) {
            this.hizoClickElUsiario = true
        }
    }

    val listaDeFinalesQueFaltanAprobarParaCursar: String
        get() = finalesRequeridosParaCursar.filter { !it.estaAprobada }.map { it.nombre }
            .joinToString(separator = "\n")

    val listaDeCursadasQueFaltanAprobarParaCursar: String
        get() = cursadasRequeridasParaCursar.filter { !it.cursadaAprobada }.map { it.nombre }
            .joinToString(separator = "\n")

    val listaDeFinalesQueFaltanAprobarParaFinal: String
        get() = finalesRequeridosParaFinal.filter { !it.estaAprobada }.map { it.nombre }
            .joinToString(separator = "\n")


    val listaDeCursadasQueFaltanAprobarParaFinal: String
        get() = cursadasRequeridasParaFinal.filter { !it.cursadaAprobada }.map { it.nombre }
            .joinToString(separator = "\n")
}