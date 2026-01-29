package com.example.consola.data.mapas

object DataIngenieriaElectromecanica : _InformacionDeCarrera {
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
        "Electrotecnia y Electrónica",             // 21 (E1282)
        "Fundamentos de Transferencia de Calor y Masa", // 22 (M1614)
        "Higiene, Seguridad y Desarrollo Sustentable", // 23 (M1681)
        "Actividades de Formación Complementaria I", // 24 (AFC 1)
        "Máquinas Eléctricas",                     // 25 (E1286)
        "Mediciones e Instrumental",               // 26 (M1619)
        "Tecnología para la Fabricación II",       // 27 (M1621)
        "Máquinas Rotativas",                      // 28 (M1628)
        "Economía Para Ingenieros y Org. Industrial", // 29 (P1752)
        "Actividades de Formación Complementaria II", // 30 (AFC 2)
        "Sistemas Hidráulicos y Neumáticos",       // 31 (A1053)
        "Dispositivos e Instalaciones Eléctricas I", // 32 (E1236)
        "Dinámica De Sistemas",                    // 33 (M1613)
        "Máquinas Alternativas",                   // 34 (M1618)
        "Instalaciones Industriales Frigoríficas y de Vapor", // 35 (M1622)
        "Actividades de Formación Complementaria III", // 36 (AFC 3)
        "Dispositivos e Instalaciones Eléctricas II", // 37 (E1240)
        "Instalaciones de Transmisión y Distribución", // 38 (E1285)
        "Proyecto Integral de Plantas",            // 39 (M1632)
        "Energías Alternativas",                   // 40 (M1643)
        "Ingeniería Legal y Ejercicio Profesional", // 41 (P1759)
        "Actividades de Formación Complementaria IV", // 42 (AFC 4)
        "Mantenimiento de Plantas Industriales",   // 43 (M1633)
        "Automatización I",                        // 44 (M1636)
        "Práctica Profesional Supervisada",        // 45 (M1662)
        "Actividades de Formación Complementaria V", // 46 (AFC 5)
        "Inglés",                                    // 47 (M0001)
        "Optativa 1",
        "Optativa 2"
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),        // Mat B -> Mat A (Reg)
        5 to listOf(1),        // Fis I -> Mat A (Reg)
        6 to emptyList(),
        7 to listOf(4),        // Mat C -> Mat B (Reg)
        8 to listOf(4, 5),     // Fis II -> Mat B, Fis I (Reg)
        9 to listOf(6),        // Materiales -> Quimica (Reg)
        10 to emptyList(),
        11 to listOf(7),       // Mat D -> Mat C (Reg)
        12 to listOf(4),       // Prob y Est -> Mat B (Reg)
        13 to listOf(4, 5, 6), // Termo -> Mat B, Fis I, Quimica (Reg)
        14 to listOf(9),       // Tec Fab I -> Materiales (Reg)
        15 to listOf(5, 7),    // Mec Rac -> Fis I, Mat C (Reg)
        16 to listOf(5, 7),    // Mec Fluidos -> Fis I, Mat C (Reg)
        17 to listOf(4, 5),    // Est I -> Mat B, Fis I (Reg)
        18 to listOf(7),       // Intro Prog -> Mat C (Reg)
        19 to listOf(15, 17, 9), // Mecanismos -> Mec Rac, Est I, Materiales (Reg)
        20 to listOf(17, 9),   // Est II -> Est I, Materiales (Reg)
        21 to listOf(7, 8),    // Electrotecnia -> Mat C, Fis II (Reg)
        22 to listOf(13),      // Transf Calor -> Termo (Reg)
        23 to listOf(6),       // Higiene -> Quimica (Reg)
        24 to emptyList(),
        25 to listOf(21),      // Maq Elec -> Electrotecnia (Reg)
        26 to listOf(16, 12, 13), // Mediciones -> Mec Fluidos, Prob, Termo (Reg)
        27 to listOf(14),      // Tec Fab II -> Tec Fab I (Reg)
        28 to listOf(16, 22),  // Maq Rot -> Mec Fluidos, Transf Calor (Reg)
        29 to emptyList(),
        30 to listOf(24),      // AFC 2 -> AFC 1
        31 to listOf(16),      // Sist Hidr -> Mec Fluidos (Reg)
        32 to listOf(25),      // Disp I -> Maq Elec (Reg)
        33 to listOf(16, 18, 13), // Dinamica -> Mec Fluidos, Intro Prog, Termo (Reg)
        34 to listOf(16, 22),  // Maq Alt -> Mec Fluidos, Transf Calor (Reg)
        35 to listOf(28),      // Inst Frig -> Maq Rot (Reg)
        36 to listOf(30),      // AFC 3 -> AFC 2
        37 to listOf(32),      // Disp II -> Disp I (Reg)
        38 to listOf(32),      // Transmision -> Disp I (Reg)
        39 to listOf(27, 32),  // Proy Plantas -> Tec Fab II, Disp I (Reg)
        40 to listOf(22, 32),  // Energ Alt -> Transf Calor, Disp I (Reg)
        41 to emptyList(),
        42 to listOf(36),      // AFC 4 -> AFC 3
        43 to listOf(25, 29),  // Mantenimiento -> Maq Elec, Economia (Reg)
        44 to listOf(31, 25, 33), // Automatizacion -> Sist Hidr, Maq Elec, Dinamica (Reg)
        45 to emptyList(),
        46 to listOf(42),      // AFC 5 -> AFC 4
        47 to emptyList(),
        48 to emptyList(),
        49 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to listOf(0),        // Mat A -> Mat Ing (Apr)
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(0),        // Mat B -> Mat Ing (Apr)
        5 to listOf(0),        // Fis I -> Mat Ing (Apr)
        6 to emptyList(),
        7 to listOf(1),        // Mat C -> Mat A (Apr)
        8 to listOf(1),        // Fis II -> Mat A (Apr)
        9 to emptyList(),
        10 to emptyList(),
        11 to listOf(4),       // Mat D -> Mat B (Apr)
        12 to listOf(1),       // Prob y Est -> Mat A (Apr)
        13 to listOf(1),       // Termo -> Mat A (Apr)
        14 to listOf(6),       // Tec Fab I -> Quimica (Apr)
        15 to listOf(1, 4),    // Mec Rac -> Mat A, Mat B (Apr)
        16 to listOf(1, 4),    // Mec Fluidos -> Mat A, Mat B (Apr)
        17 to listOf(1),       // Est I -> Mat A (Apr)
        18 to listOf(4),       // Intro Prog -> Mat B (Apr)
        19 to listOf(4, 5, 7, 6), // Mecanismos -> Mat B, Fis I, Mat C, Quimica (Apr)
        20 to listOf(4, 5, 6), // Est II -> Mat B, Fis I, Quimica (Apr)
        21 to listOf(4, 5),    // Electrotecnia -> Mat B, Fis I (Apr)
        22 to listOf(4, 5, 6), // Transf Calor -> Mat B, Fis I, Quimica (Apr)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(7, 8),    // Maq Elec -> Mat C, Fis II (Apr)
        26 to listOf(4, 5, 7, 6), // Mediciones -> Mat B, Fis I, Mat C, Quimica (Apr)
        27 to listOf(9),       // Tec Fab II -> Materiales (Apr)
        28 to listOf(5, 7, 13), // Maq Rot -> Fis I, Mat C, Termo (Apr)
        29 to emptyList(),
        30 to emptyList(),
        31 to listOf(5, 7),    // Sist Hidr -> Fis I, Mat C (Apr)
        32 to listOf(21),      // Disp I -> Electrotecnia (Apr)
        33 to listOf(4, 5, 7, 6), // Dinamica -> Mat B, Fis I, Mat C, Quimica (Apr)
        34 to listOf(5, 7, 13), // Maq Alt -> Fis I, Mat C, Termo (Apr)
        35 to listOf(16, 22),  // Inst Frig -> Mec Fluidos, Transf Calor (Apr)
        36 to emptyList(),
        37 to listOf(25, 47),  // Disp II -> Maq Elec, Ingles (Apr)
        38 to listOf(25, 47),  // Transmision -> Maq Elec, Ingles (Apr)
        39 to listOf(25, 14, 47), // Proy Plantas -> Maq Elec, Tec Fab I, Ingles (Apr)
        40 to listOf(25, 13, 47), // Energ Alt -> Maq Elec, Termo, Ingles (Apr)
        41 to listOf(47),      // Legal -> Ingles (Apr)
        42 to listOf(47),      // AFC 4 -> Ingles (Apr)
        43 to listOf(21, 47),  // Mantenimiento -> Electrotecnia, Ingles (Apr)
        44 to listOf(16, 21, 18, 13, 47), // Automatizacion -> Mec Fluidos, Electrotecnia, Intro Prog, Termo, Ingles (Apr)
        45 to listOf(47),      // PPS -> Ingles (Apr)
        46 to listOf(47),      // AFC 5 -> Ingles (Apr)
        47 to emptyList(),
        48 to emptyList(),
        49 to emptyList()
    )

    // Requisito: Final Aprobado para Aprobar Final (Mantengo los datos del PDF anterior)
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
        20 to listOf(17, 9),
        21 to listOf(7, 8),
        22 to listOf(13),
        23 to listOf(6),
        24 to emptyList(),
        25 to listOf(21),
        26 to listOf(16, 12, 13),
        27 to listOf(14),
        28 to listOf(16, 22),
        29 to emptyList(),
        30 to listOf(24),
        31 to listOf(16),
        32 to listOf(25),
        33 to listOf(16, 18, 13),
        34 to listOf(16, 22),
        35 to listOf(28),
        36 to listOf(30),
        37 to listOf(32, 47),
        38 to listOf(32, 47),
        39 to listOf(32, 27, 47),
        40 to listOf(32, 22, 47),
        41 to listOf(47),
        42 to listOf(36, 47),
        43 to listOf(25, 29, 47),
        44 to listOf(31, 25, 33, 47),
        45 to listOf(47),
        46 to listOf(42, 47),
        47 to emptyList(),
        48 to emptyList(),
        49 to emptyList()
    )
    override val reglasDeCorrelatividadesCursadaConFinal = null
    override val cantidadDeAprobadasParaCursar = mapOf(
        24 to 10,
        29 to 15,
        41 to 30,
        45 to 34
    )
    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()


}