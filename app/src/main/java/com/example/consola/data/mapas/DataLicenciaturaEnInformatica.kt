package com.example.consola.data.mapas

object DataLicenciaturaEnInformatica : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Expresión de Problemas y Algoritmos",     // 0 (CNE)
        "Conceptos de Organización de Computadoras", // 1 (CNC)
        "Matemática 0",                            // 2 (CNM)
        "Conceptos de Algoritmos, Datos y Programas", // 3 (SI106)
        "Organización de Computadoras",            // 4 (SI104)
        "Matemática 1",                            // 5 (SI101)
        "Taller de Programación",                  // 6 (SI107)
        "Arquitectura de Computadoras",            // 7 (SI105)
        "Matemática 2",                            // 8 (SI102)
        "Fundamentos de Organización de Datos",    // 9 (SI209)
        "Algoritmos y Estructuras de Datos",       // 10 (SI203)
        "Seminario de Lenguajes",                  // 11 (SI207)
        "Diseño de Bases de Datos",                // 12 (SI210)
        "Ingeniería de Software 1",                // 13 (SI202)
        "Orientación a Objetos 1",                 // 14 (SI206)
        "Introducción a los Sistemas Operativos",  // 15 (SI204)
        "Taller de lecto-comprensión y Traducción en Inglés", // 16 (SI208)
        "Matemática 3",                            // 17 (SI308)
        "Ingeniería de Software 2",                // 18 (SI302)
        "Conceptos y Paradigmas de Lenguajes de Programación", // 19 (SI306)
        "Orientación a Objetos 2",                 // 20 (SI307)
        "Redes y Comunicaciones",                  // 21 (SI304)
        "Programación Concurrente",                // 22 (SI301)
        "Proyecto de Software",                    // 23 (SI305)
        "Computabilidad y Complejidad",            // 24 (0I309)
        "Teoría de la Computación y Verificación de Programas", // 25 (0I401)
        "Sistemas Operativos",                     // 26 (SI403)
        "Sistemas Paralelos",                      // 27 (0I404)
        "Optativa 1",                              // 28
        "Lógica e Inteligencia Artificial",        // 29 (0I406)
        "Matemática 4",                            // 30 (SI409)
        "Laboratorio de Software",                 // 31 (0I402)
        "Programación Distribuida y Tiempo Real",  // 32 (0I405)
        "Diseño de Experiencia de Usuario",        // 33 (0I502)
        "Aspectos Sociales y Profesionales de Informática", // 34 (SI504)
        "Aspectos Éticos, Sociales y Profesionales Avanzados", // 35 (SI505)
        "Tesina de Licenciatura en Informática"    // 36 (0I503)
    )

    // Basado en Plan 2021 de la Facultad de Informática UNLP
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(0),         // SI106 -> CNE
        4 to listOf(1),         // SI104 -> CNC
        5 to listOf(2),         // SI101 -> CNM
        6 to listOf(3),         // SI107 -> SI106
        7 to listOf(4),         // SI105 -> SI104
        8 to listOf(5),         // SI102 -> SI101
        9 to listOf(6),         // SI209 -> SI107
        10 to listOf(8, 6),     // SI203 -> SI102, SI107
        11 to listOf(6),        // SI207 -> SI107
        12 to listOf(9),        // SI210 -> SI209
        13 to listOf(6),        // SI202 -> SI107
        14 to listOf(6),        // SI206 -> SI107
        15 to listOf(6, 7),     // SI204 -> SI107, SI105
        16 to emptyList(),      // SI208 (Inglés) - Requisito para 3er año
        17 to listOf(8),        // SI308 -> SI102
        18 to listOf(13, 16),   // SI302 -> SI202, Inglés
        19 to listOf(10, 11, 16), // SI306 -> SI203, SI207, Inglés
        20 to listOf(14, 16),   // SI307 -> SI206, Inglés
        21 to listOf(8, 15, 16), // SI304 -> SI102, SI204, Inglés
        22 to listOf(15, 11, 16), // SI301 -> SI204, SI207, Inglés
        23 to listOf(12, 13, 10, 14, 11, 16), // SI305 -> SI210, SI202, SI203, SI206, SI207, Inglés
        24 to listOf(10, 17, 16), // 0I309 -> SI203, SI308, Inglés
        25 to listOf(17, 19),   // 0I401 -> SI308, SI306
        26 to listOf(21),       // SI403 -> SI304
        27 to listOf(22),       // 0I404 -> SI301
        28 to emptyList(),      // Optativa
        29 to listOf(8, 19),    // 0I406 -> SI102, SI306
        30 to listOf(17),       // SI409 -> SI308
        31 to listOf(23),       // 0I402 -> SI305
        32 to listOf(19, 21),   // 0I405 -> SI306, SI304
        33 to listOf(18, 31),   // 0I502 -> SI302, 0I402
        34 to listOf(23),       // SI504 -> SI305
        35 to listOf(23),       // SI505 -> SI305
        // Tesina: Finales de 1º y 2º año (0 a 16) + 2 finales más
        36 to (0..16).toList()
    )

    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesCursadaConCursada

    override val reglasDeCorrelatividadesFinalConCursada = null
    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaFinal = mapOf(
        // Tesina: Requiere 1º y 2º año completos (17 materias) + 2 finales más = 19 materias aprobadas
        36 to 19
    )
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
}