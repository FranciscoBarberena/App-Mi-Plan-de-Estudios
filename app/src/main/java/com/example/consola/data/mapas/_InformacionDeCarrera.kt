package com.example.consola.data.mapas

interface _InformacionDeCarrera {
    val nombresDeMaterias: Array<String>
    val reglasDeCorrelatividadesCursadaConCursada: Map<Int, List<Int>>?
    val reglasDeCorrelatividadesFinalConCursada: Map<Int, List<Int>>?
    val reglasDeCorrelatividadesFinalConFinal: Map<Int, List<Int>>?
    val reglasDeCorrelatividadesCursadaConFinal: Map<Int, List<Int>>?

    val cantidadDeAprobadasParaCursar: Map<Int, Int>
    val cantidadDeAprobadasParaFinal: Map<Int, Int>

    val cantidadDeCursadasParaCursar: Map<Int, Int>
    val cantidadDeCursadasParaFinal: Map<Int, Int>
}