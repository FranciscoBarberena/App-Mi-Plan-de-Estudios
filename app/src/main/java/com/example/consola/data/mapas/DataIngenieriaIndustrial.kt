package com.example.consola.data.mapas

object DataIngenieriaIndustrial : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Matemática A",                            // 1 (F1301)
        "Introducción a la Ingeniería Industrial", // 2 (P1701)
        "Química para Ingeniería",                 // 3 (U1901)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Electiva Humanística",                    // 6
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Termodinámica y Recursos Energéticos",    // 9 (M1673)
        "Representación Gráfica",                  // 10 (C1102)
        "Estructuras",                             // 11 (C1152)
        "Materiales",                              // 12 (M1603)
        "Introducción a la Programación y Análisis Numérico", // 13 (F1316)
        "Mecánica y Mecanismos",                   // 14 (A1098)
        "Electrotecnia y Electrónica",             // 15 (E1282)
        "Probabilidades y Estadística",            // 16 (F1315)
        "Macroeconomía y Políticas Económicas Argentinas", // 17 (P1702)
        "Mecánica de los Fluidos",                 // 18 (A1099)
        "Producción I",                            // 19 (P1703)
        "Microeconomía",                           // 20 (P1704)
        "Procesos de Fabricación",                 // 21 (P1721)
        "Actividades de Formación Complementaria I", // 22 (AFC 1)
        "Administración General y Sistemas Administrativos", // 23 (P1706)
        "Producción II",                           // 24 (P1707)
        "Industrias",                              // 25 (P1708)
        "Higiene y Seguridad en el Trabajo",       // 26 (P1720)
        "Actividades de Formación Complementaria II", // 27 (AFC 2)
        "Máquinas e Instalaciones Eléctricas",     // 28 (E1210)
        "Administración Financiera",               // 29 (P1709)
        "Comercialización",                        // 30 (P1710)
        "Fundamentos de la Ingeniería Ambiental",  // 31 (P1722)
        "Actividades de Formación Complementaria III", // 32 (AFC 3)
        "Dirección General",                       // 33 (P1711)
        "Formulación y Evaluación de Proyectos",   // 34 (P1712)
        "Administración de Personal",              // 35 (P1719)
        "Ingeniería Legal y Ejercicio Profesional", // 36 (P1759)
        "Actividades de Formación Complementaria IV", // 37 (AFC 4)
        "Optativa 1",                              // 38
        "Producción III",                          // 39 (P1716)
        "Práctica Profesional Supervisada",        // 40 (P1717)
        "Automatismos y Controles Industriales",   // 41 (P1784)
        "Instalaciones Industriales",              // 42 (P1732)
        "Actividades de Formación Complementaria V", // 43 (AFC 5)
        "Optativa 2",                              // 44
        "Inglés"                                   // 45 (M0001)
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
        9 to listOf(5, 3),      // Termo -> Fis I, Quimica (Reg)
        10 to emptyList(),
        11 to listOf(5),        // Estructuras -> Fis I (Reg)
        12 to listOf(3),        // Materiales -> Quimica (Reg)
        13 to listOf(7),        // Intro Prog -> Mat C (Reg)
        14 to listOf(11, 7),    // Mec y Mec -> Estructuras, Mat C (Reg)
        15 to listOf(7, 8),     // Electro -> Mat C, Fis II (Reg)
        16 to listOf(4),        // Prob -> Mat B (Reg)
        17 to listOf(7),        // Macro -> Mat C (Reg)
        18 to listOf(5, 7),     // Mec Fluidos -> Fis I, Mat C (Reg)
        19 to listOf(16, 13),   // Prod I -> Prob, Intro Prog (Reg)
        20 to listOf(17),       // Micro -> Macro (Reg)
        21 to listOf(12),       // Proc Fab -> Materiales (Reg)
        22 to emptyList(),
        23 to listOf(7),        // Admin Gen -> Mat C (Reg)
        24 to listOf(19),       // Prod II -> Prod I (Reg)
        25 to listOf(18, 9),    // Industrias -> Mec Fluidos, Termo (Reg)
        26 to emptyList(),
        27 to listOf(22),       // AFC 2 -> AFC 1
        28 to listOf(15),       // Maq Elec -> Electro (Reg)
        29 to listOf(13, 23),   // Admin Fin -> Intro Prog, Admin Gen (Reg)
        30 to listOf(13, 23),   // Comer -> Intro Prog, Admin Gen (Reg)
        31 to listOf(3),        // Amb -> Quimica (Reg)
        32 to listOf(27),       // AFC 3 -> AFC 2
        33 to listOf(23),       // Dir Gen -> Admin Gen (Reg)
        34 to listOf(29, 30),   // Eval Proy -> Admin Fin, Comer (Reg)
        35 to listOf(29),       // Personal -> Admin Fin (Reg)
        36 to emptyList(),
        37 to listOf(32),       // AFC 4 -> AFC 3
        38 to emptyList(),
        39 to listOf(24),       // Prod III -> Prod II (Reg)
        40 to emptyList(),
        41 to listOf(28),       // Automatismos -> Maq Elec (Reg)
        42 to listOf(28, 9, 25), // Inst Ind -> Maq Elec, Termo, Industrias (Reg)
        43 to listOf(37),       // AFC 5 -> AFC 4
        44 to emptyList(),
        45 to emptyList()
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
        9 to listOf(1),         // Termo -> Mat A (Apr)
        10 to listOf(0),        // Rep Graf -> Mat Ing (Apr)
        11 to listOf(1),        // Estructuras -> Mat A (Apr)
        12 to listOf(3),        // Materiales -> Quimica (Apr)
        13 to listOf(4),        // Intro Prog -> Mat B (Apr)
        14 to listOf(4, 5),     // Mec y Mec -> Mat B, Fis I (Apr)
        15 to listOf(4, 5),     // Electro -> Mat B, Fis I (Apr)
        16 to listOf(1),        // Prob -> Mat A (Apr)
        17 to listOf(4),        // Macro -> Mat B (Apr)
        18 to listOf(1, 4),     // Mec Fluidos -> Mat A, Mat B (Apr)
        19 to listOf(4, 7),     // Prod I -> Mat B, Mat C (Apr)
        20 to listOf(7),        // Micro -> Mat C (Apr)
        21 to listOf(3),        // Proc Fab -> Quimica (Apr)
        22 to emptyList(),
        23 to listOf(4),        // Admin Gen -> Mat B (Apr)
        24 to listOf(16, 13),   // Prod II -> Prob, Intro Prog (Apr)
        25 to listOf(5, 7, 3),  // Industrias -> Fis I, Mat C, Quimica (Apr)
        26 to emptyList(),
        27 to emptyList(),
        28 to listOf(7, 8),     // Maq Elec -> Mat C, Fis II (Apr)
        29 to listOf(7),        // Admin Fin -> Mat C (Apr)
        30 to listOf(7),        // Comer -> Mat C (Apr)
        31 to emptyList(),
        32 to emptyList(),
        33 to listOf(7, 45),    // Dir Gen -> Mat C, Ingles (Apr)
        34 to listOf(13, 23, 45), // Eval Proy -> Intro Prog, Admin Gen, Ingles (Apr)
        35 to listOf(13, 23, 45), // Personal -> Intro Prog, Admin Gen, Ingles (Apr)
        36 to listOf(45),       // Legal -> Ingles (Apr)
        37 to listOf(45),       // AFC 4 -> Ingles (Apr)
        38 to emptyList(),
        39 to listOf(45, 19),   // Prod III -> Ingles, Prod I (Apr)
        40 to listOf(45),       // PPS -> Ingles (Apr)
        41 to listOf(15, 45),   // Automatismos -> Electro, Ingles (Apr)
        42 to listOf(45),       // Inst Ind -> Ingles (Apr)
        43 to listOf(45),       // AFC 5 -> Ingles (Apr)
        44 to emptyList(),
        45 to listOf(0)         // Ingles -> Mat Ing (Apr)
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
        9 to listOf(5, 3),
        10 to listOf(0),
        11 to listOf(5),
        12 to listOf(3),
        13 to listOf(7),
        14 to listOf(11, 7),
        15 to listOf(7, 8),
        16 to listOf(4),
        17 to listOf(7),
        18 to listOf(5, 7),
        19 to listOf(16, 13),
        20 to listOf(17),
        21 to listOf(12),
        22 to emptyList(),
        23 to listOf(7),
        24 to listOf(19),
        25 to listOf(18, 9),
        26 to emptyList(),
        27 to emptyList(),
        28 to listOf(15),
        29 to listOf(13, 23),
        30 to listOf(13, 23),
        31 to listOf(3),
        32 to emptyList(),
        33 to listOf(45, 23),
        34 to listOf(45, 29, 30),
        35 to listOf(45, 29),
        36 to listOf(45),
        37 to listOf(45, 32),
        38 to emptyList(),
        39 to listOf(24),
        40 to listOf(45),
        41 to listOf(28, 45),
        42 to listOf(28, 45, 9, 25),
        43 to listOf(45, 37),
        44 to emptyList(),
        45 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        22 to 10, // AFC 1
        26 to 15, // Higiene y Seguridad
        36 to 20, // Legal
        40 to 30  // PPS
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}