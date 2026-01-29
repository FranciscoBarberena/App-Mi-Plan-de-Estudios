package com.example.consola.data.mapas

import kotlin.collections.listOf

object DataProfesoradoEnPsicologia : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Psicología I",                                          // 0
        "Antropología Cultural y Social",                        // 1
        "Lógica",                                                // 2
        "Introducción a la Filosofía",                           // 3
        "Biología Humana",                                       // 4
        "Psicología II",                                         // 5
        "Teoría Psicoanalítica",                                 // 6
        "Sociología General",                                    // 7
        "Psicología Genética",                                   // 8
        "Teoría de la Educación",//9
        "Estadística Aplicada a la Psicología",                  // 10
        "Lingüística General",                                   // 11
        "Neuroanatomía y Neurofisiología",                       // 12
        "Epistemología y Metodología de la Investigación Psicológica",    // 13
        "Fundamentos, Técnicas e Instrumentos de la Exploración Psicológica I",   // 14
        "Corrientes Actuales en Psicología",                     // 15
        "Diseño y Planeamiento del Curriculum", //16
        "Psicología Evolutiva I",                                // 17
        "Psicología Evolutiva II",                               // 18
        "Psicología Social",                                     // 19
        "Psicopatología I",                                      // 20
        "Psicología Institucional",                              // 21
        "Seminario de Psicología Experimental",//22
        "Psicopatología II",                                     // 23
        "Fundamentos, Técnicas e Instrumentos de la Exploración Psicológica II",  // 24
        "Capacitación en Idioma I",//25
        "Capacitación en Idioma II",//26
        "Psicología Educacional", //27
        "Planificación Didáctica y Prácticas de la Enseñanza en Psicología" //28


    )

    // Requisito: Regularizada (Cursada aprobada) para Cursar la materia Key
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),          // Psico II -> Psico I
        6 to listOf(0),          // Teo Psico -> Psico I
        7 to emptyList(),        // Sociología -> (Solo pide final de Antropología para rendir)
        8 to listOf(0),          // Psico Genética -> Psico I
        9 to emptyList(),
        10 to emptyList(),
        11 to listOf(2),         // Lingüística -> Lógica
        12 to listOf(4),         // Neuro -> Biología Humana
        13 to listOf(2, 5, 6),   // Epistemología -> Lógica, Psico II, Teo Psico
        14 to listOf(2, 5, 10, 6),// Fundamentos I -> Lógica, Psico II, Estad., Teo Psico
        15 to listOf(5, 11),     // Corrientes -> Psico II, Lingüística
        16 to listOf(8,9,17),
        17 to listOf(8, 6),      // Evolutiva I -> Genética, Teo Psico
        18 to listOf(15),        // Evolutiva II -> Evolutiva I
        19 to listOf(2, 5, 7, 6),// Social -> Lógica, Psico II, Socio, Teo Psico
        20 to listOf(12, 16),    // Psicopato I -> Neuro, Evol II
        21 to listOf(13, 17),    // Institucional -> Epistemología, Social
        22 to listOf(13, 14),    // Sem Exp -> Epistemología, Fundamentos I
        23 to listOf(11, 15, 16),// Psicopato II -> Neuro, Evol I, Evol II
        24 to listOf(12, 13),    // Fundamentos II -> Epistemología, Fundamentos I)
        25 to emptyList(),
        26 to emptyList(),
        27 to listOf(24,20,21),
        28 to  listOf(16,20,21,23)

    )

    // Requisito: Final Aprobado para Cursar la materia
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to emptyList(),
        7 to emptyList(),
        8 to emptyList(),
        9 to emptyList(),
        10 to emptyList(),
        11 to emptyList(),
        12 to emptyList(),
        13 to listOf(0),         // Epistemología -> Final Psico I
        14 to listOf(0),         // Fundamentos I -> Final Psico I
        15 to listOf(0, 2),      // Corrientes -> Final Psico I, Lógica
        16 to listOf(0,6),
        17 to listOf(0),         // Evolutiva I -> Final Psico I
        18 to listOf(0),         // Evolutiva II -> Final Psico I
        19 to listOf(0, 1),      // Social -> Final Psico I, Antropología
        20 to listOf(4, 8, 6),   // Psicopato I -> Biología, Genética, Teo Psico
        21 to listOf(2, 5, 7, 10),// Institucional -> Lógica, Psico II, Socio, Estad.
        22 to listOf(2, 5, 11, 6),// Sem Exp -> Lógica, Psico II, Estad., Teo Psico
        23 to listOf(4, 8, 6),   // Psicopato II -> Biología, Genética, Teo Psico
        24 to listOf(2, 5, 9, 6),// Fundamentos II -> Lógica, Psico II, Estad., Teo Psico
        25 to emptyList(),
        26 to emptyList(),
        27 to listOf(12,18,14,19),
        28 to listOf(12,18,9,14,15)

    )

    // Requisito: Final Aprobado para Aprobar (Rendir) el Final de la materia Key
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),          // Psico II -> Final Psico I
        6 to listOf(0),          // Teo Psico -> Final Psico I
        7 to listOf(1),          // Sociología -> Final Antropología
        8 to listOf(0),          // Psico Genética -> Final Psico I
        9 to emptyList(),
        10 to emptyList(),
        11 to listOf(2),         // Lingüística -> Final Lógica
        12 to listOf(4),         // Neuro -> Final Biología
        13 to listOf(2, 5, 6),   // Epistemología -> Final Lógica, Psico II, Teo Psico
        14 to listOf(10, 13),     // Fundamentos I -> Final Estad., Epistemología
        15 to listOf(5, 11),     // Corrientes -> Final Psico II, Lingüística
        16 to listOf(9,18),
        17 to listOf(8, 6),      // Evolutiva I -> Final Genética, Teo Psico
        18 to listOf(17),        // Evolutiva II -> Final Evolutiva I
        19 to listOf(7, 13),     // Social -> Final Socio, Epistemología
        20 to listOf(12, 18),    // Psicopato I -> Final Neuro, Evol II
        21 to listOf(13, 19),    // Institucional -> Final Epistemología, Social
        22 to listOf(13, 14),    // Sem Exp -> Final Epistemología, Fundamentos I
        23 to listOf(18),        // Psicopato II -> Final Psicopato I
        24 to listOf(12, 13),    // Fundamentos II -> Final Epistemología, Fundamentos I
        25 to emptyList(),
        26 to emptyList(),
        27 to listOf(24,21,20),
        28 to listOf(16,21,20,23)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        25 to 12,
        26 to 12
    )

    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()


    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}