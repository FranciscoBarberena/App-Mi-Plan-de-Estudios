package com.example.consola.data.mapas

object DataIngenieriaEnEnergiaElectrica : _InformacionDeCarrera {
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
        "Estructuras",                             // 15 (C1152)
        "Electromagnetismo Aplicado",              // 16 (E1202)
        "Dispositivos Electrónicos",               // 17 (E1231)
        "Análisis de Sistemas y Señales",          // 18 (E1211)
        "Circuitos y Sistemas Lineales",           // 19 (E1206)
        "Materiales Eléctricos",                   // 20 (E1207)
        "Medidas Eléctricas",                      // 21 (E1208)
        "Control Automático",                      // 22 (E1237)
        "Conversión Electrónica de Potencia",      // 23 (E1232)
        "Máquinas Eléctricas I",                   // 24 (E1233)
        "Técnicas de Medición y Comunicación en Sistemas Eléctricos", // 25 (E1241)
        "Termodinámica y Recursos Energéticos",    // 26 (M1673)
        "Actividades de Formación Complementaria I", // 27 (AFC 1)
        "Máquinas Eléctricas II",                  // 28 (E1234)
        "Teoría de la Transmisión de la Energía Eléctrica", // 29 (E1235)
        "Dispositivos e Instalaciones Eléctricas I", // 30 (E1236)
        "Economía Para Ingenieros y Org. Industrial", // 31 (P1752)
        "Ingeniería Legal y Ejercicio Profesional", // 32 (P1759)
        "Actividades de Formación Complementaria II", // 33 (AFC 2)
        "Generación de Energía Eléctrica",         // 34 (E1238)
        "Sistemas de Potencia",                    // 35 (E1239)
        "Dispositivos e Instalaciones Eléctricas II", // 36 (E1240)
        "Diseño De Líneas De Transmisión y Estaciones Transformadoras", // 37 (E1242)
        "Actividades de Formación Complementaria III", // 38 (AFC 3)
        "Distribución de la Energía Eléctrica",    // 39 (E1243)
        "Práctica Profesional Supervisada",        // 40 (E1247)
        "Taller Integrador de Sistemas Eléctricos", // 41 (E1400)
        "Actividades de Formación Complementaria IV", // 42 (AFC 4)
        "Optativa 1",                              // 43
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
        13 to listOf(7, 8, 3),  // Fis III -> Mat C, Fis II, Quimica (Reg)
        14 to listOf(7),        // Intro Prog -> Mat C (Reg)
        15 to listOf(5),        // Estructuras -> Fis I (Reg)
        16 to listOf(11),       // Electro -> Circ (Reg)
        17 to listOf(11, 13),   // Disp Elec -> Circ, Fis III (Reg)
        18 to listOf(11, 12),   // Señales -> Circ, Mat D (Reg)
        19 to listOf(18),       // Sist Lin -> Señales (Reg)
        20 to listOf(3),        // Mat Elec -> Quimica (Reg)
        21 to listOf(18, 9),    // Medidas -> Señales, Prob (Reg)
        22 to listOf(18),       // Control -> Señales (Reg)
        23 to listOf(17, 22),   // Conv Pot -> Disp Elec, Control (Reg)
        24 to listOf(16, 21),   // Maq I -> Electro, Medidas (Reg)
        25 to listOf(19),       // Tec Med -> Sist Lin (Reg)
        26 to listOf(5, 3),     // Termo -> Fis I, Quimica (Reg)
        27 to emptyList(),
        28 to listOf(24),       // Maq II -> Maq I (Reg)
        29 to listOf(11, 24),   // Teo Trans -> Circ, Maq I (Reg)
        30 to listOf(20, 24),   // Disp Inst I -> Mat Elec, Maq I (Reg)
        31 to emptyList(),
        32 to emptyList(),
        33 to listOf(27),       // AFC 2 -> AFC 1
        34 to listOf(28, 30, 44, 26), // Gen -> Maq II, Disp Inst I, Ingles, Termo (Reg)
        35 to listOf(28, 29, 22), // Sist Pot -> Maq II, Teo Trans, Control (Reg)
        36 to listOf(30),       // Disp Inst II -> Disp Inst I (Reg)
        37 to listOf(15, 29, 6), // Dis Lineas -> Estructuras, Teo Trans, Grafica (Reg)
        38 to listOf(33),       // AFC 3 -> AFC 2
        39 to listOf(36),       // Distr -> Disp Inst II (Reg)
        40 to emptyList(),
        41 to listOf(35, 25),   // Taller -> Sist Pot, Tec Med (Reg)
        42 to listOf(38),       // AFC 4 -> AFC 3
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
        15 to listOf(2),        // Estructuras -> Mat A (Apr)
        16 to listOf(7, 8),     // Electro -> Mat C, Fis II (Apr)
        17 to listOf(7, 8, 3),  // Disp Elec -> Mat C, Fis II, Quimica (Apr)
        18 to listOf(7, 8),     // Señales -> Mat C, Fis II (Apr)
        19 to listOf(11, 12),   // Sist Lin -> Circ, Mat D (Apr)
        20 to listOf(3),        // Mat Elec -> Quimica (Apr)
        21 to listOf(11, 4, 12), // Medidas -> Circ, Mat B, Mat D (Apr)
        22 to listOf(11, 12),   // Control -> Circ, Mat D (Apr)
        23 to listOf(11, 18, 13), // Conv Pot -> Circ, Señales, Fis III (Apr)
        24 to listOf(11, 18, 9), // Maq I -> Circ, Señales, Prob (Apr)
        25 to listOf(18),       // Tec Med -> Señales (Apr)
        26 to listOf(2),        // Termo -> Mat A (Apr)
        27 to emptyList(),
        28 to listOf(16, 21),   // Maq II -> Electro, Medidas (Apr)
        29 to listOf(16, 21, 7, 8), // Teo Trans -> Electro, Medidas, Mat C, Fis II (Apr)
        30 to listOf(16, 21, 3), // Disp Inst I -> Electro, Medidas, Quimica (Apr)
        31 to emptyList(),
        32 to emptyList(),
        33 to emptyList(),
        34 to listOf(20, 24, 5, 3), // Gen -> Mat Elec, Maq I, Fis I, Quimica (Apr)
        35 to listOf(11, 18, 24, 44), // Sist Pot -> Circ, Señales, Maq I, Ingles (Apr)
        36 to listOf(20, 24, 44), // Disp Inst II -> Mat Elec, Maq I, Ingles (Apr)
        37 to listOf(11, 24, 5, 44), // Dis Lineas -> Circ, Maq I, Fis I, Ingles (Apr)
        38 to listOf(44),       // AFC 3 -> Ingles (Apr)
        39 to listOf(30, 44),   // Distr -> Disp Inst I, Ingles (Apr)
        40 to listOf(44),       // PPS -> Ingles (Apr)
        41 to listOf(19, 28, 29, 22, 44), // Taller -> Sist Lin, Maq II, Teo Trans, Control, Ingles (Apr)
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
        13 to listOf(7, 8),
        14 to listOf(7),
        15 to listOf(5),
        16 to listOf(11),
        17 to listOf(11, 13),
        18 to listOf(11, 12),
        19 to listOf(18),
        20 to listOf(3),
        21 to listOf(18, 9),
        22 to listOf(18),
        23 to listOf(17, 22),
        24 to listOf(16, 21),
        25 to listOf(19),
        26 to listOf(5, 3),
        27 to emptyList(),
        28 to listOf(24),
        29 to listOf(11, 24),
        30 to listOf(20, 24),
        31 to emptyList(),
        32 to emptyList(),
        33 to listOf(27),
        34 to listOf(28, 30, 44, 26),
        35 to listOf(28, 29, 22, 44),
        36 to listOf(30, 44),
        37 to listOf(15, 29, 44, 6),
        38 to listOf(44, 33),
        39 to listOf(36, 44),
        40 to listOf(44),
        41 to listOf(35, 25, 44),
        42 to listOf(44, 38),
        43 to emptyList(),
        44 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        27 to 15, // AFC 1
        31 to 15, // Economía
        32 to 15, // Legal
        40 to 30  // PPS
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}