package com.example.consola.data.mapas

object DataIngenieriaEnTelecomunicaciones : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Introducción a la Electrotecnia",         // 1 (E1001)
        "Matemática A",                            // 2 (F1301)
        "Química para Ingeniería",                 // 3 (U1901)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Gráfica para Ingeniería",                 // 6 (M1602)
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Probabilidades y Estadística",            // 9 (F1315)
        "Electiva Humanística",                    // 10
        "Análisis de Circuitos",                   // 11 (E1204)
        "Matemática D",                            // 12 (F1306)
        "Física III",                              // 13 (F1308)
        "Introducción a la Programación y Análisis Numérico", // 14 (F1316)
        "Programación",                            // 15 (E1201)
        "Electromagnetismo Aplicado",              // 16 (E1202)
        "Dispositivos Electrónicos",               // 17 (E1231)
        "Análisis de Sistemas y Señales",          // 18 (E1211)
        "Circuitos y Sistemas Lineales",           // 19 (E1206)
        "Técnicas Digitales",                      // 20 (E1212)
        "Fundamentos de las Comunicaciones",       // 21 (E1214)
        "Control Automático I",                    // 22 (E1216)
        "Medidas Eléctricas",                      // 23 (E1208)
        "Arquitectura de Computadores",            // 24 (E1213)
        "Propagación, Enlaces y Antenas",          // 25 (E1222)
        "Análisis de Señales Aleatorias",          // 26 (E1601)
        "Actividades de Formación Complementaria I", // 27 (AFC 1)
        "Técnicas de Radio Frecuencia y Microondas", // 28 (E1217)
        "Redes de Comunicaciones",                 // 29 (E1221)
        "Comunicaciones Digitales",                // 30 (E1223)
        "Sistemas Operativos y Redes",             // 31 (E1224)
        "Actividades de Formación Complementaria II", // 32 (AFC 2)
        "Teoría de la Información y Codificación", // 33 (E1603)
        "Taller de Telecomunicaciones",            // 34 (E1604)
        "Comunicaciones Móviles y Satelitales",    // 35 (E1605)
        "Actividades de Formación Complementaria III", // 36 (AFC 3)
        "Optativa 1",                              // 37
        "Práctica Profesional Supervisada",        // 38 (E1228)
        "Proyecto Integrador de Telecomunicaciones", // 39 (E1606)
        "Economía Para Ingenieros y Org. Industrial", // 40 (P1752)
        "Ingeniería Legal y Ejercicio Profesional", // 41 (P1759)
        "Actividades de Formación Complementaria IV", // 42 (AFC 4)
        "Optativa 2",                              // 43
        "Inglés"                                   // 44 (M0001)
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
        10 to emptyList(),
        11 to listOf(7, 8),     // Circ -> Mat C, Fis II (Reg)
        12 to listOf(7),        // Mat D -> Mat C (Reg)
        13 to listOf(7, 8, 3),  // Fis III -> Mat C, Fis II, Quim Ing (Reg)
        14 to listOf(7),        // Intro Prog -> Mat C (Reg)
        15 to listOf(14),       // Prog -> Intro Prog (Reg)
        16 to listOf(11),       // Electro -> Circ (Reg)
        17 to listOf(11, 13),   // Disp Elec -> Circ, Fis III (Reg)
        18 to listOf(11, 12),   // Señales -> Circ, Mat D (Reg)
        19 to listOf(18),       // Sist Lin -> Señales (Reg)
        20 to listOf(15, 17),   // Tec Dig -> Prog, Disp Elec (Reg)
        21 to listOf(16, 18, 9), // Comu -> Electro, Señales, Prob (Reg)
        22 to listOf(18),       // Control I -> Señales (Reg)
        23 to listOf(18, 9),    // Medidas -> Señales, Prob (Reg)
        24 to listOf(20),       // Arq Comp -> Tec Dig (Reg)
        25 to listOf(21),       // Propag -> Comu (Reg)
        26 to listOf(19, 21),   // Aleatorias -> Sist Lin, Comu (Reg)
        27 to emptyList(),
        28 to listOf(19, 23, 21), // RF Micro -> Sist Lin, Medidas, Comu (Reg)
        29 to listOf(26),       // Redes Com -> Aleatorias (Reg)
        30 to listOf(26),       // Com Dig -> Aleatorias (Reg)
        31 to listOf(24),       // SO -> Arq Comp (Reg)
        32 to listOf(27),       // AFC 2 -> AFC 1
        33 to listOf(30),       // Teo Info -> Com Dig (Reg)
        34 to listOf(28, 25, 30), // Taller -> RF Micro, Propag, Com Dig (Reg)
        35 to listOf(29, 25, 30), // Moviles -> Redes Com, Propag, Com Dig (Reg)
        36 to listOf(32),       // AFC 3 -> AFC 2
        37 to emptyList(),
        38 to emptyList(),
        39 to listOf(24, 29, 34, 6), // Proy -> Arq Comp, Redes Com, Taller, Grafica (Reg)
        40 to emptyList(),
        41 to emptyList(),
        42 to listOf(36),       // AFC 4 -> AFC 3
        43 to emptyList(),
        44 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),         // Mat A -> Mat Ing (Apr)
        3 to emptyList(),
        4 to listOf(0),         // Mat B -> Mat Ing (Apr)
        5 to listOf(0),         // Fis I -> Mat Ing (Apr)
        6 to emptyList(),
        7 to listOf(2),         // Mat C -> Mat A (Apr)
        8 to listOf(2),         // Fis II -> Mat A (Apr)
        9 to listOf(2),         // Prob -> Mat A (Apr)
        10 to emptyList(),
        11 to listOf(4, 5),     // Circ -> Mat B, Fis I (Apr)
        12 to listOf(4),        // Mat D -> Mat B (Apr)
        13 to listOf(4, 5),     // Fis III -> Mat B, Fis I (Apr)
        14 to listOf(4),        // Intro Prog -> Mat B (Apr)
        15 to listOf(7),        // Prog -> Mat C (Apr)
        16 to listOf(7, 8),     // Electro -> Mat C, Fis II (Apr)
        17 to listOf(7, 8, 3),  // Disp Elec -> Mat C, Fis II, Quim Ing (Apr)
        18 to listOf(7, 8),     // Señales -> Mat C, Fis II (Apr)
        19 to listOf(11, 12),   // Sist Lin -> Circ, Mat D (Apr)
        20 to listOf(11, 13, 14), // Tec Dig -> Circ, Fis III, Intro Prog (Apr)
        21 to listOf(11, 4, 12),  // Comu -> Circ, Mat B, Mat D (Apr)
        22 to listOf(11, 12),     // Control I -> Circ, Mat D (Apr)
        23 to listOf(11, 4, 12),  // Medidas -> Circ, Mat B, Mat D (Apr)
        24 to listOf(15, 17, 14), // Arq Comp -> Prog, Disp Elec, Intro Prog (Apr)
        25 to listOf(16, 18, 9),  // Propag -> Electro, Señales, Prob (Apr)
        26 to listOf(16, 18, 9),  // Aleatorias -> Electro, Señales, Prob (Apr)
        27 to emptyList(),
        28 to listOf(16, 18, 9),  // RF Micro -> Electro, Señales, Prob (Apr)
        29 to listOf(19, 21),     // Redes Com -> Sist Lin, Comu (Apr)
        30 to listOf(19, 21),     // Com Dig -> Sist Lin, Comu (Apr)
        31 to listOf(15, 20),     // SO -> Prog, Tec Dig (Apr)
        32 to emptyList(),
        33 to listOf(26, 44),     // Teo Info -> Aleatorias, Ingles (Apr)
        34 to listOf(19, 23, 21, 26, 44), // Taller -> Sist Lin, Medidas, Comu, Aleatorias, Ingles (Apr)
        35 to listOf(21, 26, 44), // Moviles -> Comu, Aleatorias, Ingles (Apr)
        36 to listOf(44),       // AFC 3 -> Ingles (Apr)
        37 to emptyList(),
        38 to listOf(44),       // PPS -> Ingles (Apr)
        39 to listOf(15, 20, 28, 25, 30, 26, 44), // Proy -> Prog, Tec Dig, RF Micro, Propag, Com Dig, Aleatorias, Ingles (Apr)
        40 to listOf(44),       // Eco -> Ingles (Apr)
        41 to listOf(44),       // Legal -> Ingles (Apr)
        42 to listOf(44),       // AFC 4 -> Ingles (Apr)
        43 to emptyList(),
        44 to listOf(0)         // Ingles -> Mat Ing (Apr)
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
        10 to emptyList(),
        11 to listOf(7, 8),
        12 to listOf(7),
        13 to listOf(7, 8, 3),
        14 to listOf(7),
        15 to listOf(14),
        16 to listOf(11),
        17 to listOf(11, 13),
        18 to listOf(11, 12),
        19 to listOf(18),
        20 to listOf(15, 17),
        21 to listOf(16, 18, 9),
        22 to listOf(18),
        23 to listOf(18, 9),
        24 to listOf(15, 20),
        25 to listOf(21),
        26 to listOf(19, 21),
        27 to emptyList(),
        28 to listOf(19, 23, 21),
        29 to listOf(26),
        30 to listOf(26),
        31 to listOf(24),
        32 to listOf(27),
        33 to listOf(30, 44),
        34 to listOf(28, 25, 30, 44),
        35 to listOf(29, 25, 30, 44),
        36 to listOf(44, 32),
        37 to emptyList(),
        38 to listOf(44),
        39 to listOf(24, 29, 34, 44, 6),
        40 to listOf(44),
        41 to listOf(44),
        42 to listOf(44, 36),
        43 to emptyList(),
        44 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        27 to 10, // AFC 1
        38 to 30, // PPS
        40 to 15, // Economía
        41 to 15  // Legal
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}