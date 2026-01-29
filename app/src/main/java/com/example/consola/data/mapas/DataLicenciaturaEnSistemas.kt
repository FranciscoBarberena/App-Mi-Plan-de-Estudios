package com.example.consola.data.mapas

object DataLicenciaturaEnSistemas: _InformacionDeCarrera {
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
        "Matemática 3",
        "Ingeniería de Software 2",
        "Conceptos y Paradigmas de Lenguajes de Programación",
        "Orientación a Objetos 2",
        "Redes y Comunicaciones",
        "Programación Concurrente",
        "Proyecto de Software",
        "Bases de Datos 1",
        "Fundamentos de la Teoría de la Computación",
        "Sistemas Operativos",
        "Bases de Datos 2",
        "Ingeniería de Software 3",
        "Sistemas y Organizaciones",
        "Matemática 4",
        "Desarrollo de Software en Sistemas Distribuidos",
        "Optativa 1",
        "Aspectos Sociales y Profesionales de Informática",
        "Aspectos Éticos, Sociales y Profesionales Avanzados de Informática ",
        "Optativa 2",
        "Tesina de Licenciatura en Sistemas"
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
        15 to listOf(4, 6), // Introducción a los Sistemas Operativos
        16 to emptyList(), // Taller de lecto-comprensión y Traducción en Inglés
        17 to listOf(8), // Matemática 3
        18 to listOf(13, 16), // Ingeniería de Software 2
        19 to listOf(10, 11, 16), // Conceptos y Paradigmas de Lenguajes de Programación
        20 to listOf(14, 16), // Orientación a Objetos 2
        21 to listOf(8, 15, 16), // Redes y Comunicaciones
        22 to listOf(11, 15), // Programación Concurrente
        23 to listOf(11, 12, 13, 14, 16), // Proyecto de Software
        24 to listOf(12, 16), // Bases de Datos 1
        25 to listOf(17, 19), // Fundamentos de la Teoría de la Computación
        26 to listOf(21), // Sistemas Operativos
        27 to listOf(24), // Bases de Datos 2
        28 to listOf(13, 17), // Ingeniería de Software 3
        29 to listOf(12, 13, 16), // Sistemas y Organizaciones
        30 to listOf(17), // Matemática 4
        31 to listOf(21, 22, 24), // Desarrollo de Software en Sistemas Distribuidos
        32 to emptyList(), // Optativa 1
        33 to listOf(23), // Aspectos Sociales y Profesionales de Informática
        34 to listOf(23), // Aspectos Éticos, Sociales y Profesionales Avanzados de Informática
        35 to emptyList(), // Optativa 2
        36 to (0..16).toList()// Tesina de Licenciatura en Sistemas
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null
    override val cantidadDeAprobadasParaCursar = mapOf(
        36 to 19
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()

    override val reglasDeCorrelatividadesFinalConCursada = null
    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesCursadaConCursada


}