package com.example.consola.data.mapas

object DataIngenieriaQuimica : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Matemática A",                            // 1 (F1301)
        "Introducción a la Ingeniería Química",    // 2 (Q1001)
        "Química para Ingeniería",                 // 3 (U1901)
        "Matemática B",                            // 4 (F1302)
        "Física I",                                // 5 (F1303)
        "Química Inorgánica",                      // 6 (U1903)
        "Matemática C",                            // 7 (F1304)
        "Física II",                               // 8 (F1305)
        "Química Orgánica I",                      // 9 (U1904)
        "Física III",                              // 10 (F1308)
        "Probabilidades y Estadística",            // 11 (F1315)
        "Gráfica para Ingeniería",                 // 12 (M1602)
        "Química Orgánica II",                     // 13 (U1905)
        "Química Analítica General e Instrumental", // 14 (U1906)
        "Termodinámica de Ingeniería Química I",   // 15 (Q1801)
        "Transferencia de Cantidad de Movimiento", // 16 (Q1804)
        "Simulación de Procesos I",                // 17 (Q1805)
        "Fisicoquímica I",                         // 18 (U1907)
        "Termodinámica de Ingeniería Química II",  // 19 (Q1806)
        "Transferencia de Energía y Materia",      // 20 (Q1807)
        "Simulación de Procesos II",               // 21 (Q1808)
        "Fisicoquímica II",                        // 22 (U1908)
        "Actividades de Formación Complementaria I", // 23 (AFC 1)
        "Electiva Humanística",                    // 24
        "Ingeniería de las Operaciones Físicas I", // 25 (Q1809)
        "Ingeniería de las Reacciones Químicas I", // 26 (Q1810)
        "Tecnología del Calor",                    // 27 (Q1811)
        "Ingeniería Bioquímica I",                 // 28 (Q1815)
        "Actividades de Formación Complementaria II", // 29 (AFC 2)
        "Electroquímica",                          // 30 (Q1812)
        "Ingeniería de las Operaciones Físicas II", // 31 (Q1813)
        "Ingeniería de las Reacciones Químicas II", // 32 (Q1814)
        "Gestión de Empresas",                     // 33 (Q1816)
        "Laboratorio de Ingeniería Química",       // 34 (Q1817)
        "Actividades de Formación Complementaria III", // 35 (AFC 3)
        "Control de Procesos I",                   // 36 (Q1818)
        "Materiales y Equipos Para Procesos Químicos", // 37 (Q1819)
        "Diseño Óptimo I",                         // 38 (Q1822)
        "Industrias Químicas",                     // 39 (Q1823)
        "Proyecto",                                // 40 (Q1824)
        "Fundamentos de Ingeniería Ambiental",     // 41 (Q1850)
        "Higiene y Seguridad en el Trabajo",       // 42 (Q1851)
        "Actividades de Formación Complementaria IV", // 43 (AFC 4)
        "Ingeniería Legal y Ejercicio Profesional", // 44 (P1759)
        "Práctica Profesional Supervisada",        // 45 (Q1825)
        "Actividades de Formación Complementaria V", // 46 (AFC 5)
        "Optativa",                                // 47
        "Inglés"                                   // 48 (M0001)
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),         // Mat B -> Mat A (Reg)
        5 to listOf(1),         // Fis I -> Mat A (Reg)
        6 to listOf(3),         // Quim Inorg -> Quim Ing (Reg)
        7 to listOf(4),         // Mat C -> Mat B (Reg)
        8 to listOf(4, 5),      // Fis II -> Mat B, Fis I (Reg)
        9 to listOf(6),         // Org I -> Quim Inorg (Reg)
        10 to listOf(7, 8),     // Fis III -> Mat C, Fis II (Reg)
        11 to listOf(4),        // Prob -> Mat B (Reg)
        12 to emptyList(),
        13 to listOf(9),        // Org II -> Org I (Reg)
        14 to listOf(8, 6),     // Analitica -> Fis II, Quim Inorg (Reg)
        15 to listOf(5, 7, 3),  // Termo I -> Fis I, Mat C, Quim Ing (Reg)
        16 to listOf(5, 7),     // Transf Cant Mov -> Fis I, Mat C (Reg)
        17 to listOf(7),        // Sim I -> Mat C (Reg)
        18 to listOf(10, 14),   // Fisicoquim I -> Fis III, Analitica (Reg)
        19 to listOf(15),       // Termo II -> Termo I (Reg)
        20 to listOf(16),       // Transf Ener Mat -> Transf Cant Mov (Reg)
        21 to listOf(11, 16, 17), // Sim II -> Prob, Transf Cant Mov, Sim I (Reg)
        22 to listOf(18),       // Fisicoquim II -> Fisicoquim I (Reg)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(15, 16, 17), // Op Fis I -> Termo I, Transf Cant Mov, Sim I (Reg)
        26 to listOf(19, 20, 21), // Reac Quim I -> Termo II, Transf Ener Mat, Sim II (Reg)
        27 to listOf(19, 20, 21), // Tec Calor -> Termo II, Transf Ener Mat, Sim II (Reg)
        28 to listOf(13, 18),   // Bioquim I -> Org II, Fisicoquim I (Reg)
        29 to listOf(23),       // AFC 2 -> AFC 1
        30 to listOf(8, 20, 22), // Electroquim -> Fis II, Transf Ener Mat, Fisicoquim II (Reg)
        31 to listOf(19, 20, 25), // Op Fis II -> Termo II, Transf Ener Mat, Op Fis I (Reg)
        32 to listOf(26),       // Reac Quim II -> Reac Quim I (Reg)
        33 to listOf(25, 26, 27), // Gestion -> Op Fis I, Reac Quim I, Tec Calor (Reg)
        34 to listOf(25, 26, 27), // Lab -> Op Fis I, Reac Quim I, Tec Calor (Reg)
        35 to listOf(29),       // AFC 3 -> AFC 2
        36 to listOf(26, 27, 31), // Control -> Reac Quim I, Tec Calor, Op Fis II (Reg)
        37 to listOf(26, 31),   // Materiales -> Reac Quim I, Op Fis II (Reg)
        38 to listOf(26, 27, 31), // Diseño Opt -> Reac Quim I, Tec Calor, Op Fis II (Reg)
        39 to listOf(31, 32, 33), // Industrias -> Op Fis II, Reac Quim II, Gestion (Reg)
        40 to listOf(12, 31, 32, 33), // Proyecto -> Grafica, Op Fis II, Reac Quim II, Gestion (Reg)
        41 to listOf(25, 14),   // Ambiental -> Op Fis I, Analitica (Reg)
        42 to emptyList(),
        43 to listOf(35),       // AFC 4 -> AFC 3
        44 to emptyList(),
        45 to listOf(27, 31, 32), // PPS -> Tec Calor, Op Fis II, Reac Quim II (Reg)
        46 to listOf(43),       // AFC 5 -> AFC 4
        47 to emptyList(),
        48 to emptyList()
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
        9 to listOf(3),         // Org I -> Quim Ing (Apr)
        10 to listOf(4, 5),     // Fis III -> Mat B, Fis I (Apr)
        11 to listOf(1),        // Prob -> Mat A (Apr)
        12 to emptyList(),
        13 to listOf(6),        // Org II -> Quim Inorg (Apr)
        14 to listOf(4, 5, 3),  // Analitica -> Mat B, Fis I, Quim Ing (Apr)
        15 to listOf(1, 4),     // Termo I -> Mat A, Mat B (Apr)
        16 to listOf(1, 4),     // Transf Cant Mov -> Mat A, Mat B (Apr)
        17 to listOf(4),        // Sim I -> Mat B (Apr)
        18 to listOf(4, 7, 8, 6), // Fisicoquim I -> Mat B, Mat C, Fis II, Quim Inorg (Apr)
        19 to listOf(5, 7, 3),  // Termo II -> Fis I, Mat C, Quim Ing (Apr)
        20 to listOf(5, 7),     // Transf Ener Mat -> Fis I, Mat C (Apr)
        21 to listOf(4, 5, 7),  // Sim II -> Mat B, Fis I, Mat C (Apr)
        22 to listOf(7, 10, 14), // Fisicoquim II -> Mat C, Fis III, Analitica (Apr)
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(5, 7, 3),  // Op Fis I -> Fis I, Mat C, Quim Ing (Apr)
        26 to listOf(8, 15, 16, 17), // Reac Quim I -> Fis II, Termo I, Transf Cant Mov, Sim I (Apr)
        27 to listOf(11, 15, 16, 17), // Tec Calor -> Prob, Termo I, Transf Cant Mov, Sim I (Apr)
        28 to listOf(7, 10, 9, 14), // Bioquim I -> Mat C, Fis III, Org I, Analitica (Apr)
        29 to emptyList(),
        30 to listOf(4, 5, 16, 18), // Electroquim -> Mat B, Fis I, Transf Cant Mov, Fisicoquim I (Apr)
        31 to listOf(15, 16, 17), // Op Fis II -> Termo I, Transf Cant Mov, Sim I (Apr)
        32 to listOf(19, 20, 21), // Reac Quim II -> Termo II, Transf Ener Mat, Sim II (Apr)
        33 to listOf(15, 16, 17, 19, 20, 21), // Gestion -> Termo I, Transf Mov, Sim I, Termo II, Transf Ener, Sim II (Apr)
        34 to listOf(15, 16, 17, 19, 20, 21), // Lab -> Termo I, Transf Mov, Sim I, Termo II, Transf Ener, Sim II (Apr)
        35 to emptyList(),
        36 to listOf(48, 19, 20, 21, 25), // Control -> Ingles, Termo II, Transf Ener, Sim II, Op Fis I (Apr)
        37 to listOf(48, 19, 20, 21, 25), // Materiales -> Ingles, Termo II, Transf Ener, Sim II, Op Fis I (Apr)
        38 to listOf(48, 19, 20, 21, 25), // Diseño Opt -> Ingles, Termo II, Transf Ener, Sim II, Op Fis I (Apr)
        39 to listOf(48, 19, 20, 25, 26, 27), // Industrias -> Ingles, Termo II, Transf Ener, Op Fis I, Reac Quim I, Tec Calor (Apr)
        40 to listOf(48, 19, 20, 25, 26, 27), // Proyecto -> Ingles, Termo II, Transf Ener, Op Fis I, Reac Quim I, Tec Calor (Apr)
        41 to listOf(8, 48, 15, 16, 17, 6), // Ambiental -> Fis II, Ingles, Termo I, Transf Mov, Sim I, Quim Inorg (Apr)
        42 to listOf(48),       // Higiene -> Ingles (Apr)
        43 to listOf(48),       // AFC 4 -> Ingles (Apr)
        44 to listOf(48),       // Legal -> Ingles (Apr)
        45 to listOf(48, 19, 20, 21, 25, 26), // PPS -> Ingles, Termo II, Transf Ener, Sim II, Op Fis I, Reac Quim I (Apr)
        46 to listOf(48),       // AFC 5 -> Ingles (Apr)
        47 to emptyList(),
        48 to listOf(0)         // Ingles -> Mat Ing (Apr)
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to listOf(0),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),
        5 to listOf(1),
        6 to listOf(3),
        7 to listOf(4),
        8 to listOf(4, 5),
        9 to listOf(6),
        10 to listOf(7, 8),
        11 to listOf(4),
        12 to emptyList(),
        13 to listOf(9),
        14 to listOf(8, 6),
        15 to listOf(5, 7, 3),
        16 to listOf(5, 7),
        17 to listOf(7),
        18 to listOf(7, 10, 14),
        19 to listOf(15),
        20 to listOf(16),
        21 to listOf(11, 16, 17),
        22 to listOf(18),
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(15, 16, 17),
        26 to listOf(19, 20, 21),
        27 to listOf(19, 20, 21),
        28 to listOf(13, 18),
        29 to listOf(23),
        30 to listOf(8, 20, 22),
        31 to listOf(19, 20, 25),
        32 to listOf(26),
        33 to listOf(25, 26, 27),
        34 to listOf(25, 26, 27),
        35 to listOf(29),
        36 to listOf(48, 26, 27, 31),
        37 to listOf(48, 26, 31),
        38 to listOf(48, 26, 27, 31),
        39 to listOf(48, 31, 32, 33),
        40 to listOf(48, 12, 31, 32, 33),
        41 to listOf(48, 25, 14),
        42 to listOf(48),
        43 to listOf(48, 35),
        44 to listOf(48),
        45 to listOf(48, 27, 31, 32),
        46 to listOf(48, 43),
        47 to emptyList(),
        48 to listOf(0)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        23 to 10, // AFC 1
        42 to 20, // Higiene y Seguridad
        44 to 20, // Legal

    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}