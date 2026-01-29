package com.example.consola.data.mapas

object DataIngenieriaMecanica : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Matemática A",                            // 1 (F1301)
        "Gráfica para Ingeniería",                 // 2 (M1602)
        "Introducción a la Ingeniería Mecánica y Electromecánica", // 3 (M1608)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Química para Ingeniería",                 // 6 (U1901)
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Materiales",                              // 9 (M1603)
        "Electiva Humanística",                    // 10
        "Matemática D",                            // 11 (F1306)
        "Probabilidades y Estadística",            // 12 (F1315)
        "Termodinámica",                           // 13 (M1604)
        "Tecnología para la Fabricación I",        // 14 (M1605)
        "Mecánica Racional",                       // 15 (A1009)
        "Mecánica de los Fluidos",                 // 16 (A1052)
        "Estructuras I",                           // 17 (C1151)
        "Introducción a la Programación y Análisis Numérico", // 18 (F1316)
        "Mecanismos y Elementos de Máquinas",      // 19 (A1050)
        "Estructuras II",                          // 20 (C1153)
        "Electrotecnia, Máquinas Eléctricas y Electrónica", // 21 (E1283)
        "Fundamentos de Transferencia de Calor y Masa", // 22 (M1614)
        "Higiene, Seguridad y Desarrollo Sustentable", // 23 (M1681)
        "Actividades de Formación Complementaria I", // 24 (AFC 1)
        "Estructuras III",                         // 25 (A1008)
        "Tecnología para la Fabricación II",       // 26 (M1621)
        "Instalaciones Electromecánicas",          // 27 (M1615)
        "Mediciones e Instrumental",               // 28 (M1619)
        "Máquinas Rotativas",                      // 29 (M1628)
        "Actividades de Formación Complementaria II", // 30 (AFC 2)
        "Sistemas Hidráulicos y Neumáticos",       // 31 (A1053)
        "Dinámica De Sistemas",                    // 32 (M1613)
        "Máquinas Alternativas",                   // 33 (M1618)
        "Instalaciones Industriales Frigoríficas y de Vapor", // 34 (M1622)
        "Proyecto de Máquinas",                    // 35 (M1627)
        "Actividades de Formación Complementaria III", // 36 (AFC 3)
        "Tecnología De Unión De Materiales",       // 37 (M1626)
        "Diseño Mecánico de Cañerías",             // 38 (M1645)
        "Economía Para Ingenieros y Org. Industrial", // 39 (P1752)
        "Proyecto Integral de Plantas",            // 40 (M1632)
        "Actividades de Formación Complementaria IV", // 41 (AFC 4)
        "Optativa 1",                              // 42
        "Mantenimiento de Plantas Industriales",   // 43 (M1633)
        "Automatización I",                        // 44 (M1636)
        "Práctica Profesional Supervisada",        // 45 (M1648)
        "Ingeniería Legal y Ejercicio Profesional", // 46 (P1759)
        "Automotores y Máquinas Agrícolas",        // 47 (M1640)
        "Actividades de Formación Complementaria V", // 48 (AFC 5)
        "Optativa 2",                              // 49
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
        9 to listOf(6),         // Materiales -> Quimica (Reg)
        10 to emptyList(),
        11 to listOf(7),        // Mat D -> Mat C (Reg)
        12 to listOf(4),        // Prob -> Mat B (Reg)
        13 to listOf(4, 5, 6),  // Termo -> Mat B, Fis I, Quimica (Reg)
        14 to listOf(9),        // Tec Fab I -> Materiales (Reg)
        15 to listOf(5, 7),     // Mec Rac -> Fis I, Mat C (Reg)
        16 to listOf(5, 7),     // Mec Fluidos -> Fis I, Mat C (Reg)
        17 to listOf(4, 5),     // Est I -> Mat B, Fis I (Reg)
        18 to listOf(7),        // Intro Prog -> Mat C (Reg)
        19 to listOf(15, 17, 9), // Mecanismos -> Mec Rac, Est I, Materiales (Reg)
        20 to listOf(17, 9),    // Est II -> Est I, Materiales (Reg)
        21 to listOf(7, 8),     // Electro -> Mat C, Fis II (Reg)
        22 to listOf(13),       // Transf Calor -> Termo (Reg)
        23 to listOf(6),        // Higiene -> Quimica (Reg)
        24 to emptyList(),
        25 to listOf(20, 18),   // Est III -> Est II, Intro Prog (Reg)
        26 to listOf(14),       // Tec Fab II -> Tec Fab I (Reg)
        27 to listOf(21, 23),   // Inst Elec -> Electro, Higiene (Reg)
        28 to listOf(16, 12, 13), // Mediciones -> Mec Fluidos, Prob, Termo (Reg)
        29 to listOf(16, 22),   // Maq Rot -> Mec Fluidos, Transf Calor (Reg)
        30 to listOf(24),       // AFC 2 -> AFC 1
        31 to listOf(28),       // Sist Hidr -> Mediciones (Reg)
        32 to listOf(16, 11, 13), // Dinamica -> Mec Fluidos, Mat D, Termo (Reg)
        33 to listOf(16, 22),   // Maq Alt -> Mec Fluidos, Transf Calor (Reg)
        34 to listOf(29),       // Inst Frig -> Maq Rot (Reg)
        35 to listOf(18, 26),   // Proy Maq -> Intro Prog, Tec Fab II (Reg)
        36 to listOf(30),       // AFC 3 -> AFC 2
        37 to listOf(2, 9),     // Tec Union -> Grafica, Materiales (Reg)
        38 to listOf(16, 27),   // Cañerias -> Mec Fluidos, Inst Elec (Reg)
        39 to emptyList(),
        40 to listOf(27, 26),   // Proy Plantas -> Inst Elec, Tec Fab II (Reg)
        41 to listOf(36),       // AFC 4 -> AFC 3
        42 to emptyList(),
        43 to listOf(21),       // Mantenimiento -> Electro (Reg)
        44 to listOf(32),       // Automatizacion -> Dinamica (Reg)
        45 to emptyList(),
        46 to emptyList(),
        47 to listOf(19, 33),   // Automotores -> Mecanismos, Maq Alt (Reg)
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
        10 to emptyList(),
        11 to listOf(4),        // Mat D -> Mat B (Apr)
        12 to listOf(1),        // Prob -> Mat A (Apr)
        13 to listOf(1),        // Termo -> Mat A (Apr)
        14 to listOf(6),        // Tec Fab I -> Quimica (Apr)
        15 to listOf(1, 4),     // Mec Rac -> Mat A, Mat B (Apr)
        16 to listOf(1, 4),     // Mec Fluidos -> Mat A, Mat B (Apr)
        17 to listOf(1),        // Est I -> Mat A (Apr)
        18 to listOf(4),        // Intro Prog -> Mat B (Apr)
        19 to listOf(4, 5, 7, 6), // Mecanismos -> Mat B, Fis I, Mat C, Quimica (Apr)
        20 to listOf(4, 5, 6),  // Est II -> Mat B, Fis I, Quimica (Apr)
        21 to listOf(4, 5),     // Electro -> Mat B, Fis I (Apr)
        22 to listOf(4, 5, 6),  // Transf Calor -> Mat B, Fis I, Quimica (Apr)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(17, 4, 7, 9), // Est III -> Est I, Mat B, Mat C, Materiales (Apr)
        26 to listOf(9),        // Tec Fab II -> Materiales (Apr)
        27 to listOf(7, 8, 6),  // Inst Elec -> Mat C, Fis II, Quimica (Apr)
        28 to listOf(4, 5, 7, 6), // Mediciones -> Mat B, Fis I, Mat C, Quimica (Apr)
        29 to listOf(5, 7, 13), // Maq Rot -> Fis I, Mat C, Termo (Apr)
        30 to emptyList(),
        31 to listOf(16, 12, 13), // Sist Hidr -> Mec Fluidos, Prob, Termo (Apr)
        32 to listOf(4, 5, 7, 6), // Dinamica -> Mat B, Fis I, Mat C, Quimica (Apr)
        33 to listOf(5, 7, 13), // Maq Alt -> Fis I, Mat C, Termo (Apr)
        34 to listOf(16, 22),   // Inst Frig -> Mec Fluidos, Transf Calor (Apr)
        35 to listOf(7, 14),    // Proy Maq -> Mat C, Tec Fab I (Apr)
        36 to emptyList(),
        37 to listOf(50, 6),    // Tec Union -> Ingles, Quimica (Apr)
        38 to listOf(21, 5, 7, 50, 23), // Cañerias -> Electro, Fis I, Mat C, Ingles, Higiene (Apr)
        39 to listOf(50),       // Economia -> Ingles (Apr)
        40 to listOf(21, 50, 14, 23), // Proy Plantas -> Electro, Ingles, Tec Fab I, Higiene (Apr)
        41 to listOf(50),       // AFC 4 -> Ingles (Apr)
        42 to emptyList(),
        43 to listOf(7, 8, 50), // Mantenimiento -> Mat C, Fis II, Ingles (Apr)
        44 to listOf(16, 11, 50, 13), // Automatizacion -> Mec Fluidos, Mat D, Ingles, Termo (Apr)
        45 to listOf(50),       // PPS -> Ingles (Apr)
        46 to listOf(50),       // Legal -> Ingles (Apr)
        47 to listOf(15, 16, 17, 50, 9, 22), // Automotores -> Mec Rac, Mec Fluidos, Est I, Ingles, Materiales, Transf Calor (Apr)
        48 to listOf(50),       // AFC 5 -> Ingles (Apr)
        49 to emptyList(),
        50 to listOf(0)         // Ingles -> Mat Ing (Apr)
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
        10 to emptyList(),
        11 to listOf(7),
        12 to listOf(4),
        13 to listOf(4, 5, 6),
        14 to listOf(9),
        15 to listOf(5, 7),
        16 to listOf(5, 7),
        17 to listOf(4, 5),
        18 to listOf(7),
        19 to listOf(15, 17, 9),
        20 to listOf(17, 4, 9),
        21 to listOf(7, 8),
        22 to listOf(13),
        23 to listOf(6),
        24 to emptyList(),
        25 to listOf(20, 18),
        26 to listOf(14),
        27 to listOf(21, 23),
        28 to listOf(16, 12, 13),
        29 to listOf(16, 22),
        30 to listOf(24),
        31 to listOf(28),
        32 to listOf(16, 11, 13),
        33 to listOf(16, 22),
        34 to listOf(29),
        35 to listOf(18, 26),
        36 to listOf(30),
        37 to listOf(50, 2, 9),
        38 to listOf(16, 50, 27),
        39 to listOf(50),
        40 to listOf(50, 27, 26),
        41 to listOf(50, 36),
        42 to emptyList(),
        43 to listOf(21, 50),
        44 to listOf(50, 32),
        45 to listOf(50),
        46 to listOf(50),
        47 to listOf(19, 50, 33),
        48 to listOf(50, 41),
        49 to emptyList(),
        50 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        24 to 10, // AFC 1
        39 to 15, // Economía
        45 to 33, // PPS
        46 to 20  // Legal
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}