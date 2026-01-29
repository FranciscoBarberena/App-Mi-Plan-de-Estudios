package com.example.consola.data.mapas

object DataIngenieriaAeroespacial : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Introducción a la Ingeniería Aeroespacial", // 1 (A1101)
        "Matemática A",                            // 2 (F1301)
        "Gráfica para Ingeniería",                 // 3 (M1602)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Química para Ingeniería",                 // 6 (U1901)
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Probabilidades y Estadística",            // 9 (F1315)
        "Estructuras I",                           // 10 (C1151)
        "Matemática D",                            // 11 (F1306)
        "Materiales",                              // 12 (M1603)
        "Introducción a la Programación y Análisis Numérico", // 13 (F1316)
        "Materiales Aeroespaciales",               // 14 (A1102)
        "Ensayos no Destructivos",                 // 15 (A1006)
        "Mecánica Racional",                       // 16 (A1009)
        "Estructuras II",                          // 17 (C1153)
        "Termodinámica",                           // 18 (M1604)
        "Estructuras III",                         // 19 (A1008)
        "Electrotecnia y Sistemas Eléctricos de Aeronaves", // 20 (A1010)
        "Mecánica de los Fluidos I",               // 21 (A1011)
        "Mecanismos y Sistemas de Aeronaves",      // 22 (A1016)
        "Actividades de Formación Complementaria I", // 23 (AFC 1)
        "Sistemas Dinámicos",                      // 24 (A1012)
        "Estructuras IV",                          // 25 (A1013)
        "Mecánica de los Fluidos II",              // 26 (A1015)
        "Economía Para Ingenieros y Org. Industrial", // 27 (P1752)
        "Actividades de Formación Complementaria II", // 28 (AFC 2)
        "Electiva Humanística",                    // 29
        "Estructuras V",                           // 30 (A1014)
        "Motores a Reacción",                      // 31 (A1017)
        "Aerodinámica y Mecánica de Vuelo I",      // 32 (A1018)
        "Procesos De Fabricación",                 // 33 (A1019)
        "Ingeniería Legal y Ejercicio Profesional", // 34 (P1759)
        "Actividades de Formación Complementaria III", // 35 (AFC 3)
        "Motores Alternativos",                    // 36 (A1020)
        "Aerodinámica y Mecánica de Vuelo II",     // 37 (A1021)
        "Mediciones e Instrumentos de Aeronaves",  // 38 (A1022)
        "Aeropuertos y Operaciones de Vuelo",      // 39 (A1028)
        "Actividades de Formación Complementaria IV", // 40 (AFC 4)
        "Control y Guiado",                        // 41 (A1023)
        "Talleres y Mantenimiento Aeronáutico",    // 42 (A1024)
        "Sistemas y Equipos de Aeronaves",         // 43 (A1026)
        "Práctica Profesional Supervisada",        // 44 (A1034)
        "Actividades de Formación Complementaria V", // 45 (AFC 5)
        "Inglés",                                   // 46 (M0001)
        "Optativa"
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(2),         // Mat B -> Mat A (Reg)
        5 to listOf(2),         // Fis I -> Mat A (Reg)
        6 to emptyList(),
        7 to listOf(4),         // Mat C -> Mat B (Reg)
        8 to listOf(4, 5),      // Fis II -> Mat B, Fis I (Reg)
        9 to listOf(4),         // Prob -> Mat B (Reg)
        10 to listOf(5),        // Est I -> Fis I (Reg)
        11 to listOf(7),        // Mat D -> Mat C (Reg)
        12 to listOf(6),        // Materiales -> Quimica (Reg)
        13 to listOf(7),        // Intro Prog -> Mat C (Reg)
        14 to listOf(12),       // Mat Aero -> Materiales (Reg)
        15 to listOf(8, 12),    // Ensayos -> Fis II, Materiales (Reg)
        16 to listOf(5, 7),     // Mec Rac -> Fis I, Mat C (Reg)
        17 to listOf(10, 4, 12),// Est II -> Est I, Mat B, Materiales (Reg)
        18 to listOf(4, 5, 6),  // Termo -> Mat B, Fis I, Quimica (Reg)
        19 to listOf(17, 13),   // Est III -> Est II, Intro Prog (Reg)
        20 to listOf(7, 8),     // Electrotecnia -> Mat C, Fis II (Reg)
        21 to listOf(11, 13, 18), // Mec Fluidos I -> Mat D, Intro Prog, Termo (Reg)
        22 to listOf(16, 17),   // Mecanismos -> Mec Rac, Est II (Reg)
        23 to emptyList(),
        24 to listOf(19, 16, 8, 11, 9, 13), // Dinamica -> Est III, Mec Rac, Fis II, Mat D, Prob, Intro Prog (Reg)
        25 to listOf(19, 14),   // Est IV -> Est III, Mat Aero (Reg)
        26 to listOf(21, 9),    // Mec Fluidos II -> Mec Fluidos I, Prob (Reg)
        27 to emptyList(),
        28 to listOf(23),       // AFC 2 -> AFC 1
        29 to emptyList(),
        30 to listOf(25),       // Est V -> Est IV (Reg)
        31 to listOf(26),       // Motores Reac -> Mec Fluidos II (Reg)
        32 to listOf(16, 26),   // Aero I -> Mec Rac, Mec Fluidos II (Reg)
        33 to listOf(14),       // Fab -> Mat Aero (Reg)
        34 to emptyList(),
        35 to listOf(28),       // AFC 3 -> AFC 2
        36 to listOf(24, 22, 18), // Motores Alt -> Dinamica, Mecanismos, Termo (Reg)
        37 to listOf(24, 32),   // Aero II -> Dinamica, Aero I (Reg)
        38 to listOf(20, 22, 31), // Mediciones -> Electrotecnia, Mecanismos, Motores Reac (Reg)
        39 to listOf(31, 32),   // Aeropuertos -> Motores Reac, Aero I (Reg)
        40 to listOf(35),       // AFC 4 -> AFC 3
        41 to listOf(37, 38),   // Control -> Aero II, Mediciones (Reg)
        42 to emptyList(),
        43 to listOf(38),       // Sist Equipos -> Mediciones (Reg)
        44 to emptyList(),
        45 to listOf(40),       // AFC 5 -> AFC 4
        46 to emptyList(),
        47 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),         // Mat A -> Mat Ing (Apr)
        3 to emptyList(),
        4 to listOf(0),         // Mat B -> Mat Ing (Apr)
        5 to emptyList(),
        6 to emptyList(),
        7 to listOf(2),         // Mat C -> Mat A (Apr)
        8 to listOf(2),         // Fis II -> Mat A (Apr)
        9 to listOf(2),         // Prob -> Mat A (Apr)
        10 to listOf(2),        // Est I -> Mat A (Apr)
        11 to listOf(4),        // Mat D -> Mat B (Apr)
        12 to listOf(0),        // Materiales -> Mat Ing (Apr)
        13 to listOf(4),        // Intro Prog -> Mat B (Apr)
        14 to listOf(6),        // Mat Aero -> Quimica (Apr)
        15 to listOf(4, 5, 6),  // Ensayos -> Mat B, Fis I, Quimica (Apr)
        16 to listOf(2, 4),     // Mec Rac -> Mat A, Mat B (Apr)
        17 to listOf(2, 5, 6),  // Est II -> Mat A, Fis I, Quimica (Apr)
        18 to listOf(2),        // Termo -> Mat A (Apr)
        19 to listOf(10, 4, 7, 12), // Est III -> Est I, Mat B, Mat C, Materiales (Apr)
        20 to listOf(4, 5),     // Electrotecnia -> Mat B, Fis I (Apr)
        21 to listOf(4, 5, 7, 6), // Mec Fluidos I -> Mat B, Fis I, Mat C, Quimica (Apr)
        22 to listOf(10, 4, 5, 7, 12, 6), // Mecanismos -> Est I, Mat B, Fis I, Mat C, Materiales, Quimica (Apr)
        23 to emptyList(),
        24 to listOf(17, 4, 5, 7), // Dinamica -> Est II, Mat B, Fis I, Mat C (Apr)
        25 to listOf(17, 13, 12), // Est IV -> Est II, Intro Prog, Materiales (Apr)
        26 to listOf(4, 11, 13, 18), // Mec Fluidos II -> Mat B, Mat D, Intro Prog, Termo (Apr)
        27 to emptyList(),
        28 to emptyList(),
        29 to emptyList(),
        30 to listOf(19, 14),   // Est V -> Est III, Mat Aero (Apr)
        31 to listOf(21, 9),    // Motores Reac -> Mec Fluidos I, Prob (Apr)
        32 to listOf(21, 5, 7, 9), // Aero I -> Mec Fluidos I, Fis I, Mat C, Prob (Apr)
        33 to listOf(12),       // Fab -> Materiales (Apr)
        34 to emptyList(),
        35 to emptyList(),
        36 to listOf(19, 16, 17, 4, 5, 8, 9, 46, 12, 6), // Motores Alt -> Est III, Mec Rac, Est II, Mat B, Fis I, Fis II, Prob, Ingles, Materiales, Quimica (Apr)
        37 to listOf(19, 16, 26, 8, 9, 46), // Aero II -> Est III, Mec Rac, Mec Fluidos II, Fis II, Prob, Ingles (Apr)
        38 to listOf(16, 26, 17, 7, 8, 46, 12), // Mediciones -> Mec Rac, Mec Fluidos II, Est II, Mat C, Fis II, Ingles, Materiales (Apr)
        39 to listOf(16, 26, 46), // Aeropuertos -> Mec Rac, Mec Fluidos II, Ingles (Apr)
        40 to listOf(46),       // AFC 4 -> Ingles (Apr)
        41 to listOf(19, 16, 20, 24, 22, 31, 32, 8, 9, 46), // Control -> Est III, Mec Rac, Electrotecnia, Dinamica, Mecanismos, Motores Reac, Aero I, Fis II, Prob, Ingles (Apr)
        42 to listOf(46),       // Talleres -> Ingles (Apr)
        43 to listOf(20, 22, 31, 46), // Sist Equipos -> Electrotecnia, Mecanismos, Motores Reac, Ingles (Apr)
        44 to listOf(46),       // PPS -> Ingles (Apr)
        45 to listOf(46),       // AFC 5 -> Ingles (Apr)
        46 to emptyList(),
        47 to emptyList()
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),
        3 to emptyList(),
        4 to listOf(2),
        5 to listOf(2),
        6 to emptyList(),
        7 to listOf(4),
        8 to listOf(4, 5),
        9 to listOf(4),
        10 to listOf(5),
        11 to listOf(7),
        12 to listOf(0, 6),
        13 to listOf(7),
        14 to listOf(12),
        15 to listOf(8, 12),
        16 to listOf(5, 7),
        17 to listOf(10, 4, 12),
        18 to listOf(4, 5, 6),
        19 to listOf(17, 13),
        20 to listOf(7, 8),
        21 to listOf(11, 13, 18),
        22 to listOf(16, 17, 12),
        23 to emptyList(),
        24 to listOf(19, 16, 8, 11, 9, 13),
        25 to listOf(19, 14),
        26 to listOf(21, 9),
        27 to emptyList(),
        28 to listOf(23),
        29 to emptyList(),
        30 to listOf(25),
        31 to listOf(26),
        32 to listOf(16, 26),
        33 to listOf(14),
        34 to emptyList(),
        35 to listOf(28),
        36 to listOf(24, 22, 46, 18),
        37 to listOf(24, 32, 46),
        38 to listOf(20, 22, 31, 46),
        39 to listOf(31, 32, 46),
        40 to listOf(46, 35),
        41 to listOf(24, 37, 38, 46),
        42 to listOf(46),
        43 to listOf(38, 46),
        44 to listOf(46),
        45 to listOf(46, 40),
        46 to emptyList(),
        47 to emptyList()
    )
    override val reglasDeCorrelatividadesCursadaConFinal= null
    override val cantidadDeAprobadasParaCursar= mapOf(
        23 to 10,
        27 to 15,
        34 to 20,
        42 to 30,
        44 to 30
    )
    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()

}