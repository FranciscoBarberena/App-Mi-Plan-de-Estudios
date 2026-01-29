package com.example.consola.data.mapas

import kotlin.collections.plus

object DataIngenieriaCivil : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Representación Gráfica",                  // 1 (C1102)
        "Introducción a la Ingeniería Civil e Hidráulica", // 2 (C1001)
        "Matemática A",                            // 3 (F1301)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Química",                                 // 6 (C1104)
        "Estructuras I",                           // 7 (C1101)
        "Matemática C",                            // 8 (F1304)
        "Física II",                               // 9 (F1305)
        "Estructuras II",                          // 10 (C1103)
        "Materiales I",                            // 11 (C1106)
        "Probabilidades y Estadística",            // 12 (F1315)
        "Hidráulica General I",                    // 13 (H1550)
        "Estructuras III",                         // 14 (C1105)
        "Hidráulica General II",                   // 15 (H1551)
        "Materiales II",                           // 16 (C1109)
        "Introducción a la Programación y Análisis Numérico", // 17 (F1316)
        "Estructuras IV",                          // 18 (C1108)
        "Topografía",                              // 19 (G1450)
        "Hidrología",                              // 20 (H1504)
        "Gestión Ambiental",                       // 21 (H1508)
        "Economía para Ingenieros",                // 22 (P1766)
        "Actividades de Formación Complementaria I", // 23 (AFC 1)
        "Geotecnia I",                             // 24 (C1107)
        "Hormigón Armado I",                       // 25 (C1110)
        "Construcciones Metálicas y de Madera",    // 26 (C1111)
        "Transportes",                             // 27 (C1112)
        "Planeamiento Regional y Urbano",          // 28 (C1118)
        "Actividades de Formación Complementaria II", // 29 (AFC 2)
        "Hormigón Armado II",                      // 30 (C1113)
        "Edificios I",                             // 31 (C1114)
        "Geotecnia II",                            // 32 (C1115)
        "Obras Hidráulicas",                       // 33 (H1505)
        "Ingeniería Legal",                        // 34 (P1765)
        "Actividades de Formación Complementaria III", // 35 (AFC 3)
        "Edificios II",                            // 36 (C1116)
        "Caminos I",                               // 37 (C1117)
        "Ingeniería Sanitaria",                    // 38 (H1524)
        "Higiene y Seguridad en el Trabajo",       // 39 (M1681)
        "Evaluación de Proyectos y Organización de Obras", // 40 (P1764)
        "Actividades de Formación Complementaria IV", // 41 (AFC 4)
        "Proyecto Final",                          // 42 (C1119)
        "Práctica Profesional Supervisada",        // 43 (C1120)
        "Complementos de Estructuras",             // 44 (C1003)
        "Complementos de Transportes",             // 45 (C1004)
        "Competencias Actitudinales, Sociales y Políticas", // 46 (C1005)
        "Actividades de Formación Complementaria V", // 47 (AFC 5)
        "Inglés",                                  // 48 (M0001)
        "Optativa 1",                              // 49
        "Optativa 2"                               // 50
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(3),         // Mat B -> Mat A (Reg)
        5 to listOf(3),         // Fis I -> Mat A (Reg)
        6 to emptyList(),
        7 to listOf(2, 5),      // Est I -> Intro, Fis I (Reg)
        8 to listOf(4),         // Mat C -> Mat B (Reg)
        9 to listOf(4, 5),      // Fis II -> Mat B, Fis I (Reg)
        10 to listOf(7),        // Est II -> Est I (Reg)
        11 to listOf(7, 6),     // Mat I -> Est I, Quimica (Reg)
        12 to listOf(4),        // Prob -> Mat B (Reg)
        13 to listOf(5, 8),     // Hidr I -> Fis I, Mat C (Reg)
        14 to listOf(10, 8),    // Est III -> Est II, Mat C (Reg)
        15 to listOf(13),       // Hidr II -> Hidr I (Reg)
        16 to listOf(11),       // Mat II -> Mat I (Reg)
        17 to listOf(8),        // Intro Prog -> Mat C (Reg)
        18 to listOf(14, 17),   // Est IV -> Est III, Intro Prog (Reg)
        19 to listOf(1, 9, 12), // Topo -> Rep Graf, Fis II, Prob (Reg)
        20 to listOf(12),       // Hidro -> Prob (Reg)
        21 to emptyList(),
        22 to emptyList(),
        23 to emptyList(),
        24 to listOf(10, 11),   // Geo I -> Est II, Mat I (Reg)
        25 to listOf(14, 16),   // HA I -> Est III, Mat II (Reg)
        26 to listOf(14, 11),   // Met y Mad -> Est III, Mat I (Reg)
        27 to listOf(12, 22),   // Transp -> Prob, Econ (Reg)
        28 to emptyList(),
        29 to listOf(23),       // AFC 2 -> AFC 1
        30 to listOf(18, 25),   // HA II -> Est IV, HA I (Reg)
        31 to listOf(1, 14),    // Edif I -> Rep Graf, Est III (Reg)
        32 to listOf(14, 24),   // Geo II -> Est III, Geo I (Reg)
        33 to listOf(24),       // Obras Hidr -> Geo I (Reg)
        34 to emptyList(),
        35 to listOf(29),       // AFC 3 -> AFC 2
        36 to listOf(30, 31, 19), // Edif II -> HA II, Edif I, Topo (Reg)
        37 to listOf(24, 19),   // Caminos I -> Geo I, Topo (Reg)
        38 to listOf(16, 33),   // Sanit -> Mat II, Obras Hidr (Reg)
        39 to emptyList(),
        40 to listOf(31, 34, 22), // Eval Proy -> Edif I, Legal, Econ (Reg)
        41 to listOf(35),       // AFC 4 -> AFC 3
        42 to emptyList(),      // Proy Fin (Req 7mo aprobado en FinalConCursada)
        43 to emptyList(),      // PPS (Req 7mo aprobado en FinalConCursada)
        44 to listOf(26, 30),   // Comp Est -> Met Mad, HA II (Reg)
        45 to listOf(27, 37),   // Comp Trans -> Transp, Caminos I (Reg)
        46 to emptyList(),      // Comp Act (Req 7mo aprobado en FinalConCursada)
        47 to listOf(41),       // AFC 5 -> AFC 4
        48 to emptyList(),
        49 to emptyList(),
        50 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(0),         // Mat A -> Mat Ing (Apr)
        4 to listOf(0),         // Mat B -> Mat Ing (Apr)
        5 to listOf(0),         // Fis I -> Mat Ing (Apr)
        6 to emptyList(),
        7 to listOf(3),         // Est I -> Mat A (Apr)
        8 to listOf(3),         // Mat C -> Mat A (Apr)
        9 to listOf(3),         // Fis II -> Mat A (Apr)
        10 to listOf(2, 5),     // Est II -> Intro, Fis I (Apr)
        11 to listOf(2, 5),     // Mat I -> Intro, Fis I (Apr)
        12 to listOf(3),        // Prob -> Mat A (Apr)
        13 to listOf(3, 4),     // Hidr I -> Mat A, Mat B (Apr)
        14 to listOf(7, 4),     // Est III -> Est I, Mat B (Apr)
        15 to listOf(5, 8),     // Hidr II -> Fis I, Mat C (Apr)
        16 to listOf(7, 6),     // Mat II -> Est I, Quimica (Apr)
        17 to listOf(4),        // Intro Prog -> Mat B (Apr)
        18 to listOf(10, 8),    // Est IV -> Est II, Mat C (Apr)
        19 to listOf(4, 5),     // Topo -> Mat B, Fis I (Apr)
        20 to listOf(4),        // Hidro -> Mat B (Apr)
        21 to emptyList(),
        22 to emptyList(),
        23 to emptyList(),
        24 to listOf(7, 6),     // Geo I -> Est I, Quimica (Apr)
        25 to listOf(10, 11, 8), // HA I -> Est II, Mat I, Mat C (Apr)
        26 to listOf(7, 10, 6, 8), // Met Mad -> Est I, Est II, Quimica, Mat C (Apr)
        27 to listOf(4),        // Transp -> Mat B (Apr)
        28 to emptyList(),
        29 to emptyList(),
        30 to listOf(14, 16, 17), // HA II -> Est III, Mat II, Intro Prog (Apr)
        31 to listOf(10, 8),    // Edif I -> Est II, Mat C (Apr)
        32 to listOf(10, 11, 8), // Geo II -> Est II, Mat I, Mat C (Apr)
        33 to listOf(10, 11),   // Obras Hidr -> Est II, Mat I (Apr)
        34 to emptyList(),
        35 to emptyList(),
        36 to listOf(1, 14, 18, 25, 9, 12, 48), // Edif II -> Rep Graf, Est III, Est IV, HA I, Fis II, Prob, Ingles (Apr)
        37 to listOf(1, 10, 11, 9, 12, 48), // Caminos I -> Rep Graf, Est II, Mat I, Fis II, Prob, Ingles (Apr)
        38 to listOf(11, 24, 48), // Sanit -> Mat I, Geo I, Ingles (Apr)
        39 to listOf(48),       // Higiene -> Ingles (Apr)
        40 to listOf(1, 14, 48), // Eval Proy -> Rep Graf, Edif I, Ingles (Apr)
        41 to listOf(48),       // AFC 4 -> Ingles (Apr)
        // Proyecto Final: Ingles + 7mo Semestre Aprobado (Indices 24 al 29)
        42 to (listOf(48) + (24..29).toList()),
        // PPS: Ingles + 7mo Semestre Aprobado (Indices 24 al 29)
        43 to (listOf(48) + (24..29).toList()),
        44 to listOf(14, 11, 18, 25, 48), // Comp Est -> Est III, Mat I, Est IV, HA I, Ingles (Apr)
        45 to listOf(11, 24, 12, 19, 48, 22), // Comp Trans -> Mat I, Geo I, Prob, Topo, Ingles, Econ (Apr)
        // Comp Actitudinales: Ingles + 7mo Semestre Aprobado (Indices 24 al 29)
        46 to (listOf(48) + (24..29).toList()),
        47 to listOf(48),       // AFC 5 -> Ingles (Apr)
        48 to listOf(0),        // Ingles -> Mat Ing (Apr)
        49 to emptyList(),
        50 to emptyList()
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(0),
        4 to listOf(3),
        5 to listOf(3),
        6 to emptyList(),
        7 to listOf(2, 5),
        8 to listOf(4),
        9 to listOf(4, 5),
        10 to listOf(7),
        11 to listOf(7, 6),
        12 to listOf(4),
        13 to listOf(5, 8),
        14 to listOf(10, 8),
        15 to listOf(13),
        16 to listOf(11),
        17 to listOf(8),
        18 to listOf(14, 17),
        19 to listOf(1, 9, 12),
        20 to listOf(12),
        21 to emptyList(),
        22 to emptyList(),
        23 to emptyList(),
        24 to listOf(10, 11),
        25 to listOf(14, 16),
        26 to listOf(14, 11),
        27 to listOf(12, 22),
        28 to emptyList(),
        29 to listOf(23),
        30 to listOf(18, 25),
        31 to listOf(1, 14),
        32 to listOf(14, 24),
        33 to listOf(24),
        34 to emptyList(),
        35 to listOf(29),
        36 to listOf(30, 31, 19, 48),
        37 to listOf(24, 19, 48),
        38 to listOf(16, 33, 48),
        39 to listOf(48),
        40 to listOf(31, 48, 34, 22),
        41 to listOf(48, 35),
        // Para final también piden tener el 7mo semestre (aunque ya se pidió para cursar, se mantiene la coherencia)
        42 to (listOf(48) +  (24..29).toList()),
        43 to (listOf(48) +  (24..29).toList()),
        44 to listOf(26, 30, 48),
        45 to listOf(27, 37, 48),
        46 to (listOf(48) + (24..29).toList()),
        47 to listOf(48, 41),
        48 to listOf(0),
        49 to emptyList(),
        50 to emptyList()
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        21 to 12, // Gestion Ambiental
        22 to 12, // Economia
        23 to 10, // AFC 1
        28 to 15, // Planeamiento
        34 to 20, // Legal
        39 to 20  // Higiene (tiene + 20 aparte de inglés)
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}