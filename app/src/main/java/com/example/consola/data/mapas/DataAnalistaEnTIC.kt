package com.example.consola.data.mapas

object DataAnalistaEnTIC: _InformacionDeCarrera {
    override val nombresDeMaterias: Array<String> = arrayOf(
        "Expresión de Problemas y Algoritmos",
        "Conceptos de Organización de Computadoras",
        "Matemática 0",
        "Conceptos de Algoritmos, Datos y Programas",
        "Organización de Computadoras",
        "Matemática 1",
        "Taller de Programación",
        "Arquitectura de Computadoras",
        "Matemática 2",
        "Fundamentos de Organización de Datos",
        "Algoritmos y Estructuras de Datos",
        "Seminario de Lenguajes",
        "Diseño de Bases de Datos",
        "Ingeniería de Software 1",
        "Orientación a Objetos 1",
        "Introducción a los Sistemas Operativos",
        "Taller de lecto-comprensión y Traducción en Inglés",
        "Ingeniería de Software 2",
        "Orientación a Objetos 2",
        "Programación Concurrente ATIC",
        "Redes y Comunicaciones ATIC",
        "Optativa 1",
        "Optativa 2",
        "Práctica Profesional Supervisada ATIC",

    )
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(), // EPA
        1 to emptyList(), //COC
        2 to emptyList(), // Matemática 0
        3 to listOf(0), // CADP
        4 to listOf(1), // Organización de Computadoras
        5 to listOf(2), // Matemática 1
        6 to listOf(3), // Taller de Programación
        7 to listOf(4), // Arquitectura de Computadoras
        8 to listOf(5), // Matemática 2
        9 to listOf(6), // Fundamentos de Organización de Datos
        10 to listOf(6, 8), // Algoritmos y Estructuras de Datos
        11 to listOf(6), // Seminario de Lenguajes
        12 to listOf(9), // Diseño de Bases de Datos
        13 to listOf(6), // Ingeniería de Software 1
        14 to listOf(6), // Orientación a Objetos 1
        15 to listOf(6,7), // Introducción a los Sistemas Operativos
        16 to emptyList(), // Taller de lecto-comprensión y Traducción en Inglés
        17 to listOf(13, 16), // Ingeniería de Software 2
        18 to listOf(14, 16), // Orientación a Objetos 2
        19 to listOf(11, 15),//Programación concurrente ATIC
        20 to listOf(8,16,15), //  Redes y Comunicaciones ATIC
        21 to listOf(16), //Optativa 1
        22 to listOf(16), //Optativa 2
        23 to listOf(10,12,14,15,17) // Práctica Profesional Supervisada ATIC
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null
    override val cantidadDeAprobadasParaCursar = emptyMap<Int,Int>()

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()

    override val reglasDeCorrelatividadesFinalConCursada = null
    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesCursadaConCursada


}