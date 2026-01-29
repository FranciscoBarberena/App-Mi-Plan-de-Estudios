package com.example.consola.data.mapas

object DataIngenieriaHidraulica : _InformacionDeCarrera {
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
        "Electiva Humanística",                    // 10
        "Estructuras II",                          // 11 (C1103)
        "Materiales I",                            // 12 (C1106)
        "Probabilidades y Estadística",            // 13 (F1315)
        "Hidráulica I",                            // 14 (H1501)
        "Estructuras III",                         // 15 (C1105)
        "Topografía",                              // 16 (G1450)
        "Hidráulica II",                           // 17 (H1502)
        "Materiales II",                           // 18 (C1109)
        "Hidrología I",                            // 19 (H1513)
        "Hidroquímica y Transporte de Contaminantes", // 20 (H1519)
        "Economía para Ingenieros",                // 21 (P1766)
        "Higiene y Seguridad en el Trabajo",       // 22 (Q1851)
        "Introducción a la Programación y Análisis Numérico", // 23 (F1316)
        "Actividades de Formación Complementaria I", // 24 (AFC 1)
        "Geotecnia I",                             // 25 (C1107)
        "Hormigón Armado I",                       // 26 (C1110)
        "Proyecto de Instalaciones Hidromecánicas", // 27 (H1517)
        "Ingeniería Legal",                        // 28 (P1765)
        "Hidrología II",                           // 29 (H1527)
        "Actividades de Formación Complementaria II", // 30 (AFC 2)
        "Hormigón Armado II",                      // 31 (C1113)
        "Geotecnia II",                            // 32 (C1115)
        "Hidráulica Fluvial",                      // 33 (H1516)
        "Plan, Gestión y Aprovechamiento de los Rec. Hídricos", // 34 (H1536)
        "Actividades de Formación Complementaria III", // 35 (AFC 3)
        "Hidráulica Marítima",                     // 36 (H1503)
        "Ingeniería Sanitaria",                    // 37 (H1524)
        "Obras para el Control de Inundaciones",   // 38 (H1534)
        "Evaluación de Proyectos y Organización de Obras", // 39 (P1764)
        "Práctica Profesional Supervisada",        // 40 (H1526)
        "Actividades de Formación Complementaria IV", // 41 (AFC 4)
        "Optativa 1",                              // 42
        "Puertos y Vías Navegables",               // 43 (H1515)
        "Proyectos de Estructuras Hidráulicas",    // 44 (H1535)
        "Proyecto Final",                          // 45 (H1525)
        "Gestión Ambiental de Proyectos Hídricos", // 46 (H1552)
        "Actividades de Formación Complementaria V", // 47 (AFC 5)
        "Optativa 2",                              // 48
        "Inglés"                                   // 49 (M0001)
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
        10 to emptyList(),
        11 to listOf(7),        // Est II -> Est I (Reg)
        12 to listOf(7, 6),     // Mat I -> Est I, Quimica (Reg)
        13 to listOf(4),        // Prob -> Mat B (Reg)
        14 to listOf(5, 8),     // Hidr I -> Fis I, Mat C (Reg)
        15 to listOf(11, 8),    // Est III -> Est II, Mat C (Reg)
        16 to listOf(1, 9, 13), // Topo -> Rep Graf, Fis II, Prob (Reg)
        17 to listOf(14),       // Hidr II -> Hidr I (Reg)
        18 to listOf(12),       // Mat II -> Mat I (Reg)
        19 to listOf(16, 17),   // Hidro I -> Topo, Hidr II (Reg)
        20 to listOf(6, 17),    // Hidroquim -> Quimica, Hidr II (Reg)
        21 to listOf(2),        // Econ -> Intro (Reg)
        22 to listOf(2),        // Higiene -> Intro (Reg)
        23 to listOf(8),        // Intro Prog -> Mat C (Reg)
        24 to emptyList(),
        25 to listOf(11, 12),   // Geo I -> Est II, Mat I (Reg)
        26 to listOf(15, 18),   // HA I -> Est III, Mat II (Reg)
        27 to listOf(8, 17),    // Proy Inst -> Mat C, Hidr II (Reg)
        28 to emptyList(),
        29 to listOf(19),       // Hidro II -> Hidro I (Reg)
        30 to listOf(24),       // AFC 2 -> AFC 1
        31 to listOf(26),       // HA II -> HA I (Reg)
        32 to listOf(15, 25),   // Geo II -> Est III, Geo I (Reg)
        33 to listOf(25, 19),   // Hidr Fluv -> Geo I, Hidro I (Reg)
        34 to listOf(19),       // Plan Rec -> Hidro I (Reg)
        35 to listOf(30),       // AFC 3 -> AFC 2
        36 to listOf(33),       // Hidr Mar -> Hidr Fluv (Reg)
        37 to listOf(18, 27),   // Sanit -> Mat II, Proy Inst (Reg)
        38 to listOf(29),       // Obras Inun -> Hidro II (Reg)
        39 to emptyList(),
        40 to emptyList(),
        41 to listOf(35),       // AFC 4 -> AFC 3
        42 to emptyList(),
        43 to listOf(15, 36),   // Puertos -> Est III, Hidr Mar (Reg)
        44 to listOf(32, 34),   // Proy Est -> Geo II, Plan Rec (Reg)
        45 to emptyList(),
        46 to listOf(20, 34),   // Gest Amb -> Hidroquim, Plan Rec (Reg)
        47 to listOf(41),       // AFC 5 -> AFC 4
        48 to emptyList(),
        49 to emptyList()
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
        10 to emptyList(),
        11 to listOf(2, 5),     // Est II -> Intro, Fis I (Apr)
        12 to listOf(2, 5),     // Mat I -> Intro, Fis I (Apr)
        13 to listOf(3),        // Prob -> Mat A (Apr)
        14 to listOf(3, 4),     // Hidr I -> Mat A, Mat B (Apr)
        15 to listOf(7, 4),     // Est III -> Est I, Mat B (Apr)
        16 to listOf(4, 5),     // Topo -> Mat B, Fis I (Apr)
        17 to listOf(5, 8),     // Hidr II -> Fis I, Mat C (Apr)
        18 to listOf(2, 6),     // Mat II -> Intro, Quimica (Apr)
        19 to listOf(1, 9, 13, 14), // Hidro I -> Rep Graf, Fis II, Prob, Hidr I (Apr)
        20 to listOf(14),       // Hidroquim -> Hidr I (Apr)
        21 to emptyList(),
        22 to emptyList(),
        23 to listOf(4),        // Intro Prog -> Mat B (Apr)
        24 to emptyList(),
        25 to listOf(2, 7, 6),  // Geo I -> Intro, Est I, Quimica (Apr)
        26 to listOf(11, 12, 8), // HA I -> Est II, Mat I, Mat C (Apr)
        27 to listOf(4, 14),    // Proy Inst -> Mat B, Hidr I (Apr)
        28 to emptyList(),
        29 to listOf(16, 17),   // Hidro II -> Topo, Hidr II (Apr)
        30 to emptyList(),
        31 to listOf(15, 18),   // HA II -> Est III, Mat II (Apr)
        32 to listOf(11, 12, 8), // Geo II -> Est II, Mat I, Mat C (Apr)
        33 to listOf(1, 11, 12, 9, 13, 16, 49), // Hidr Fluv -> Rep Graf, Est II, Mat I, Fis II, Prob, Topo, Ingles (Apr)
        34 to listOf(16, 17),   // Plan Rec -> Topo, Hidr II (Apr)
        35 to emptyList(),
        36 to listOf(25, 16, 19, 49), // Hidr Mar -> Geo I, Topo, Hidro I, Ingles (Apr)
        37 to listOf(12, 8, 17, 49), // Sanit -> Mat I, Mat C, Hidr II, Ingles (Apr)
        38 to listOf(19, 49),   // Obras Inun -> Hidro I, Ingles (Apr)
        39 to listOf(49),       // Eval Proy -> Ingles (Apr)
        40 to emptyList(),
        41 to listOf(49),       // AFC 4 -> Ingles (Apr)
        42 to emptyList(),
        43 to listOf(11, 8, 33, 49), // Puertos -> Est II, Mat C, Hidr Fluv, Ingles (Apr)
        44 to listOf(15, 25, 19, 49), // Proy Est -> Est III, Geo I, Hidro I, Ingles (Apr)
        45 to listOf(49),       // Proy Final -> Ingles (Apr)
        46 to listOf(6, 17, 19, 49), // Gest Amb -> Quimica, Hidr II, Hidro I, Ingles (Apr)
        47 to listOf(49),       // AFC 5 -> Ingles (Apr)
        48 to emptyList(),
        49 to listOf(0)         // Ingles -> Mat Ing (Apr)
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
        10 to emptyList(),
        11 to listOf(7),
        12 to listOf(7, 6),
        13 to listOf(4),
        14 to listOf(5, 8),
        15 to listOf(11, 8),
        16 to listOf(1, 9, 13),
        17 to listOf(14),
        18 to listOf(12),
        19 to listOf(16, 17),
        20 to listOf(6, 17),
        21 to listOf(2),
        22 to listOf(2),
        23 to listOf(8),
        24 to emptyList(),
        25 to listOf(11, 12),
        26 to listOf(15, 18),
        27 to listOf(8, 17),
        28 to emptyList(),
        29 to listOf(19),
        30 to listOf(24),
        31 to listOf(26),
        32 to listOf(15, 25),
        33 to listOf(25, 16, 19, 49),
        34 to listOf(19),
        35 to listOf(30),
        36 to listOf(33, 49),
        37 to listOf(18, 27, 49),
        38 to listOf(29, 49),
        39 to listOf(49),
        40 to emptyList(),
        41 to listOf(49, 35),
        42 to emptyList(),
        43 to listOf(15, 36, 49),
        44 to listOf(32, 34, 49),
        45 to listOf(49),
        46 to listOf(20, 34, 49),
        47 to listOf(49, 41),
        48 to emptyList(),
        49 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        24 to 10, // AFC 1
        28 to 15, // Legal
        39 to 20, // Evaluacion Proy
        40 to 30, // PPS
        45 to 30  // Proyecto Final
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}