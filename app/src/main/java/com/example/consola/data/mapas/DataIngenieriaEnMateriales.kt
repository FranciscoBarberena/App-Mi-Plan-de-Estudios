package com.example.consola.data.mapas

object DataIngenieriaEnMateriales : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Matemática A",                            // 1 (F1301)
        "Taller de Materiales",                    // 2 (M1601)
        "Gráfica para Ingeniería",                 // 3 (M1602)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Química para Ingeniería",                 // 6 (U1901)
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Química Inorgánica",                      // 9 (U1903)
        "Estructuras",                             // 10 (C1152)
        "Probabilidades y Estadística",            // 11 (F1315)
        "Termodinámica de Los Materiales",         // 12 (M1607)
        "Introducción a la Programación y Análisis Numérico", // 13 (F1316)
        "Electiva Humanística",                    // 14
        "Mecánica y Mecanismos",                   // 15 (A1098)
        "Física III",                              // 16 (F1308)
        "Fundamentos del Comportamiento de los Materiales I", // 17 (M1610)
        "Fisicoquímica de Materiales",             // 18 (M1611)
        "Gestión de Calidad",                      // 19 (M1651)
        "Fundamentos del Comportamiento de los Materiales II", // 20 (M1617)
        "Instalaciones Electromecánicas",          // 21 (M1615)
        "Ingeniería de las Operaciones Físicas",   // 22 (M1655)
        "Economía Para Ingenieros y Org. Industrial", // 23 (P1752)
        "Actividades de Formación Complementaria I", // 24 (AFC 1)
        "Ensayos no Destructivos",                 // 25 (A1006)
        "Siderurgia y Metalurgia No Ferrosa",      // 26 (M1620)
        "Estructura y Propiedades de las Aleaciones", // 27 (M1624)
        "Materiales Poliméricos",                  // 28 (M1625)
        "Caracterización de Materiales",           // 29 (M1652)
        "Ingeniería Legal y Ejercicio Profesional", // 30 (P1759)
        "Actividades de Formación Complementaria II", // 31 (AFC 2)
        "Materiales Cerámicos",                    // 32 (M1623)
        "Tecnología De Unión De Materiales",       // 33 (M1626)
        "Actividades de Formación Complementaria III", // 34 (AFC 3)
        "Optativa 1",                              // 35
        "Conformado Plástico de Metales y Pulvimetalurgia", // 36 (M1634)
        "Metalurgia de la Soldadura",              // 37 (M1650)
        "Nanomateriales",                          // 38 (M1680)
        "Tecnología del Mecanizado",               // 39 (M1685)
        "Fundamento del Comportamiento de los Materiales III", // 40 (M1644)
        "Actividades de Formación Complementaria IV", // 41 (AFC 4)
        "Optativa 2",                              // 42
        "Fractomecánica",                          // 43 (C1154)
        "Tecnología de la Fundición",              // 44 (M1630)
        "Práctica Profesional Supervisada",        // 45 (M1653)
        "Proyecto Integrador de Materiales",       // 46 (M1654)
        "Biomateriales",                           // 47 (M1678)
        "Actividades de Formación Complementaria V", // 48 (AFC 5)
        "Optativa 3",                              // 49
        "Inglés"                                   // 50 (M0001)
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),         // Mat B -> Mat A (Reg)
        5 to listOf(1),         // Fis I -> Mat A (Reg)
        6 to emptyList(),
        7 to listOf(4),         // Mat C -> Mat B (Reg)
        8 to listOf(4, 5),      // Fis II -> Mat B, Fis I (Reg)
        9 to listOf(6),         // Quim Inorg -> Quim Ing (Reg)
        10 to listOf(5),        // Estructuras -> Fis I (Reg)
        11 to listOf(4),        // Prob -> Mat B (Reg)
        12 to listOf(6),        // Termo -> Quim Ing (Reg)
        13 to listOf(7),        // Intro Prog -> Mat C (Reg)
        14 to emptyList(),
        15 to listOf(10, 7),    // Mec y Mec -> Estructuras, Mat C (Reg)
        16 to listOf(7, 8, 6),  // Fis III -> Mat C, Fis II, Quim Ing (Reg)
        17 to listOf(2, 6),     // Fund I -> Taller, Quim Ing (Reg)
        18 to listOf(7, 12),    // Fisicoquim -> Mat C, Termo (Reg)
        19 to listOf(11),       // Gestion Cal -> Prob (Reg)
        20 to listOf(16, 17),   // Fund II -> Fis III, Fund I (Reg)
        21 to listOf(8),        // Inst Elec -> Fis II (Reg)
        22 to listOf(13, 12),   // Ing Op Fis -> Intro Prog, Termo (Reg)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(8, 20),    // Ensayos ND -> Fis II, Fund II (Reg)
        26 to listOf(18, 22),   // Siderurgia -> Fisicoquim, Ing Op Fis (Reg)
        27 to listOf(20),       // Est Aleac -> Fund II (Reg)
        28 to listOf(12, 20),   // Polimeros -> Termo, Fund II (Reg)
        29 to listOf(20, 9),    // Caracteriz -> Fund II, Quim Inorg (Reg)
        30 to emptyList(),
        31 to listOf(24),       // AFC 2 -> AFC 1
        32 to listOf(20),       // Ceramicos -> Fund II (Reg)
        33 to listOf(3, 20),    // Tec Union -> Grafica, Fund II (Reg)
        34 to listOf(31),       // AFC 3 -> AFC 2
        35 to emptyList(),
        36 to listOf(27),       // Conf Plast -> Est Aleac (Reg)
        37 to listOf(33),       // Met Sold -> Tec Union (Reg)
        38 to listOf(29),       // Nano -> Caracteriz (Reg)
        39 to listOf(20),       // Tec Mecaniz -> Fund II (Reg)
        40 to listOf(27),       // Fund III -> Est Aleac (Reg)
        41 to listOf(34),       // AFC 4 -> AFC 3
        42 to emptyList(),
        43 to listOf(10, 20),   // Fracto -> Estructuras, Fund II (Reg)
        44 to listOf(26, 27),   // Tec Fund -> Siderurgia, Est Aleac (Reg)
        45 to emptyList(),
        46 to emptyList(),
        47 to listOf(32, 28, 40), // Bio -> Ceramicos, Polimeros, Fund III (Reg)
        48 to listOf(41),       // AFC 5 -> AFC 4
        49 to emptyList(),
        50 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to listOf(0),         // Mat A -> Mat Ing (Apr)
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(0),         // Mat B -> Mat Ing (Apr)
        5 to listOf(0),         // Fis I -> Mat Ing (Apr)
        6 to emptyList(),
        7 to listOf(1),         // Mat C -> Mat A (Apr)
        8 to listOf(1),         // Fis II -> Mat A (Apr)
        9 to emptyList(),
        10 to listOf(1),        // Estructuras -> Mat A (Apr)
        11 to listOf(1),        // Prob -> Mat A (Apr)
        12 to emptyList(),
        13 to listOf(4),        // Intro Prog -> Mat B (Apr)
        14 to emptyList(),
        15 to listOf(4, 5),     // Mec y Mec -> Mat B, Fis I (Apr)
        16 to listOf(4, 5),     // Fis III -> Mat B, Fis I (Apr)
        17 to emptyList(),
        18 to listOf(4, 6),     // Fisicoquim -> Mat B, Quim Ing (Apr)
        19 to listOf(4),        // Gestion Cal -> Mat B (Apr)
        20 to listOf(7, 8, 2, 6), // Fund II -> Mat C, Fis II, Taller, Quim Ing (Apr)
        21 to listOf(4, 5),     // Inst Elec -> Mat B, Fis I (Apr)
        22 to listOf(7, 6),     // Ing Op Fis -> Mat C, Quim Ing (Apr)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(4, 5, 16, 17), // Ensayos ND -> Mat B, Fis I, Fis III, Fund I (Apr)
        26 to listOf(7, 13, 12), // Siderurgia -> Mat C, Intro Prog, Termo (Apr)
        27 to listOf(16, 17),   // Est Aleac -> Fis III, Fund I (Apr)
        28 to listOf(16, 17, 6), // Polimeros -> Fis III, Fund I, Quim Ing (Apr)
        29 to listOf(16, 17, 6), // Caracteriz -> Fis III, Fund I, Quim Ing (Apr)
        30 to emptyList(),
        31 to emptyList(),
        32 to listOf(16, 17),   // Ceramicos -> Fis III, Fund I (Apr)
        33 to listOf(16, 17),   // Tec Union -> Fis III, Fund I (Apr)
        34 to emptyList(),
        35 to emptyList(),
        36 to listOf(50, 20),   // Conf Plast -> Ingles, Fund II (Apr)
        37 to listOf(50, 3, 20), // Met Sold -> Ingles, Grafica, Fund II (Apr)
        38 to listOf(50, 20, 9), // Nano -> Ingles, Fund II, Quim Inorg (Apr)
        39 to listOf(16, 50, 17), // Tec Mecaniz -> Fis III, Ingles, Fund I (Apr)
        40 to listOf(50, 20),   // Fund III -> Ingles, Fund II (Apr)
        41 to listOf(50),       // AFC 4 -> Ingles (Apr)
        42 to emptyList(),
        43 to listOf(5, 16, 17), // Fracto -> Fis I, Fis III, Fund I (Apr)
        44 to listOf(50, 18, 20, 22), // Tec Fund -> Ingles, Fisicoquim, Fund II, Ing Op Fis (Apr)
        45 to emptyList(),
        46 to emptyList(),
        47 to listOf(50, 12, 20, 27), // Bio -> Ingles, Termo, Fund II, Est Aleac (Apr)
        48 to listOf(50),       // AFC 5 -> Ingles (Apr)
        49 to emptyList(),
        50 to emptyList()
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to listOf(0),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),
        5 to listOf(1),
        6 to emptyList(),
        7 to listOf(4),
        8 to listOf(4, 5),
        9 to listOf(6),
        10 to listOf(5),
        11 to listOf(4),
        12 to listOf(6),
        13 to listOf(7),
        14 to emptyList(),
        15 to listOf(10, 7),
        16 to listOf(7, 8, 6),
        17 to listOf(2, 6),
        18 to listOf(7, 12),
        19 to listOf(11),
        20 to listOf(16, 17),
        21 to listOf(8),
        22 to listOf(13, 12),
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(8, 20),
        26 to listOf(18, 22),
        27 to listOf(20),
        28 to listOf(12, 20),
        29 to listOf(20, 9),
        30 to emptyList(),
        31 to listOf(24),
        32 to listOf(20),
        33 to listOf(3, 20),
        34 to listOf(31),
        35 to emptyList(),
        36 to listOf(50, 27),
        37 to listOf(50, 33),
        38 to listOf(50, 29),
        39 to listOf(50, 20),
        40 to listOf(50, 27),
        41 to listOf(50, 34),
        42 to emptyList(),
        43 to listOf(10, 20),
        44 to listOf(50, 26, 27),
        45 to emptyList(),
        46 to emptyList(),
        47 to listOf(50, 32, 28, 40),
        48 to listOf(50, 41),
        49 to emptyList(),
        50 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        23 to 15, // Economía
        24 to 10, // AFC 1
        30 to 20, // Legal
        45 to 30, // PPS
        46 to 32  // Proyecto Integrador
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}