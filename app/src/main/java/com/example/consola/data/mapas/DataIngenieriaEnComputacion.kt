package com.example.consola.data.mapas

object DataIngenieriaEnComputacion : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Introducción a la Informática",           // 1 (I1001)
        "Matemática A",                            // 2 (F1301)
        "Programación I",                          // 3 (I1101)
        "Fundamentos de Arquitectura de Computadoras", // 4 (I1166)
        "Matemática B",                            // 5 (F1302)
        "Física I",                                // 6 (F1303)
        "Programación II",                         // 7 (I1102)
        "Matemática C",                            // 8 (F1304)
        "Programación III",                        // 9 (I1103)
        "Taller de Lenguajes I",                   // 10 (I1104)
        "Arquitectura de Computadoras",            // 11 (I1105)
        "Física II",                               // 12 (F1305)
        "Matemática D",                            // 13 (F1306)
        "Conceptos de Sistemas Operativos",        // 14 (I1106)
        "Taller de Lenguajes II",                  // 15 (I1107)
        "Inglés",                                  // 16 (INFIN) <- MOVIDO AQUÍ
        "Electrotecnia y Electrónica",             // 17 (E1282)
        "Introducción al Diseño Lógico",           // 18 (E1301)
        "Probabilidades y Estadística",            // 19 (F1315)
        "Conceptos de Bases de Datos",             // 20 (I1108)
        "Introducción al Procesamiento de Señales", // 21 (E1302)
        "Redes de Datos I",                        // 22 (E1303)
        "Taller de Arquitectura",                  // 23 (I1109)
        "Ingeniería de Software",                  // 24 (I1110)
        "Instrumentación y Control",               // 25 (E1304)
        "Circuitos Digitales y Microcontroladores", // 26 (E1305)
        "Concurrencia y Paralelismo",              // 27 (I1111)
        "Economía y Emprendedorismo",              // 28 (I1113)
        "Actividades de Formación Complementaria I", // 29 (AFC 1)
        "Taller de Proyecto I",                    // 30 (E1306)
        "Bases de Datos",                          // 31 (I1112)
        "Redes de Datos II",                       // 32 (I1114)
        "Sistemas de Tiempo Real",                 // 33 (I1115)
        "Actividades de Formación Complementaria II", // 34 (AFC 2)
        "Introducción a la Arquitectura de Computadoras Cuánticas", // 35 (E1307)
        "Sistemas Distribuidos y Paralelos",       // 36 (I1116)
        "Aspectos legales de Ingeniería Informática", // 37 (I1117)
        "Actividades de Formación Complementaria III", // 38 (AFC 3)
        "Optativa 1",                              // 39
        "Taller de Proyecto II",                   // 40 (I1118)
        "Introducción a la Programación Cuántica", // 41 (I1167)
        "Práctica Profesional Supervisada",        // 42 (EI100)
        "Actividades de Formación Complementaria IV", // 43 (AFC 4)
        "Optativa 2",                              // 44
        "Electiva Humanística"                     // 45
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(1),         // Prog I -> Intro Info (Reg)
        4 to listOf(1),         // Fund Arq -> Intro Info (Reg)
        5 to listOf(2),         // Mat B -> Mat A (Reg)
        6 to listOf(2),         // Fis I -> Mat A (Reg)
        7 to listOf(3),         // Prog II -> Prog I (Reg)
        8 to listOf(5),         // Mat C -> Mat B (Reg)
        9 to listOf(7),         // Prog III -> Prog II (Reg)
        10 to listOf(7),        // Taller Len I -> Prog II (Reg)
        11 to listOf(4),        // Arq Comp -> Fund Arq (Reg)
        12 to listOf(5, 6),     // Fis II -> Mat B, Fis I (Reg)
        13 to listOf(8),        // Mat D -> Mat C (Reg)
        14 to listOf(7, 11),    // Sist Op -> Prog II, Arq Comp (Reg)
        15 to listOf(10),       // Taller Len II -> Taller Len I (Reg)
        16 to emptyList(),      // Ingles
        17 to listOf(8, 12),    // Electro -> Mat C, Fis II (Reg)
        18 to listOf(11),       // Dis Log -> Arq Comp (Reg)
        19 to listOf(5),        // Prob -> Mat B (Reg)
        20 to listOf(7),        // Concepto BD -> Prog II (Reg)
        21 to listOf(13),       // Proc Señales -> Mat D (Reg)
        22 to listOf(14),       // Redes I -> Sist Op (Reg)
        23 to listOf(18),       // Taller Arq -> Dis Log (Reg)
        24 to listOf(7),        // Ing Soft -> Prog II (Reg)
        25 to listOf(17, 21),   // Instrum -> Electro, Proc Señales (Reg)
        26 to listOf(23),       // Circ Dig -> Taller Arq (Reg)
        27 to listOf(14, 15),   // Concurrencia -> Sist Op, Taller Len II (Reg)
        28 to listOf(8),        // Eco -> Mat C (Reg)
        29 to emptyList(),
        30 to listOf(26, 24),   // Taller Proy I -> Circ Dig, Ing Soft (Reg)
        31 to listOf(20),       // BD -> Concepto BD (Reg)
        32 to listOf(22),       // Redes II -> Redes I (Reg)
        33 to listOf(24, 27),   // Sist TR -> Ing Soft, Concurrencia (Reg)
        34 to listOf(29),       // AFC 2 -> AFC 1
        35 to listOf(30),       // Arq Cuant -> Taller Proy I (Reg)
        36 to listOf(27),       // Distr Paral -> Concurrencia (Reg)
        37 to listOf(28),       // Legal -> Eco (Reg)
        38 to listOf(34),       // AFC 3 -> AFC 2
        39 to emptyList(),
        40 to listOf(24),       // Taller Proy II -> Ing Soft (Reg)
        41 to listOf(11, 24),   // Prog Cuant -> Arq Comp, Ing Soft (Reg)
        42 to emptyList(),      // PPS (Req aprobadas)
        43 to listOf(38),       // AFC 4 -> AFC 3
        44 to emptyList(),
        45 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),         // Mat A -> Mat Ing (Apr)
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),         // Mat B -> Mat Ing (Apr)
        6 to listOf(0),         // Fis I -> Mat Ing (Apr)
        7 to listOf(1),         // Prog II -> Intro Info (Apr)
        8 to listOf(2),         // Mat C -> Mat A (Apr)
        9 to listOf(3),         // Prog III -> Prog I (Apr)
        10 to listOf(3),        // Taller Len I -> Prog I (Apr)
        11 to listOf(1),        // Arq Comp -> Intro Info (Apr)
        12 to listOf(2),        // Fis II -> Mat A (Apr)
        13 to listOf(5),        // Mat D -> Mat B (Apr)
        14 to listOf(3, 4),     // Sist Op -> Prog I, Fund Arq (Apr)
        15 to listOf(7),        // Taller Len II -> Prog II (Apr)
        16 to listOf(0),        // Ingles -> Mat Ing (Apr)
        17 to listOf(5, 6, 16), // Electro -> Mat B, Fis I, Ingles (Apr)
        18 to listOf(4, 16),    // Dis Log -> Fund Arq, Ingles (Apr)
        19 to listOf(2, 16),    // Prob -> Mat A, Ingles (Apr)
        20 to listOf(3, 16),    // Concepto BD -> Prog I, Ingles (Apr)
        21 to listOf(8, 16),    // Proc Señales -> Mat C, Ingles (Apr)
        22 to listOf(7, 11, 16), // Redes I -> Prog II, Arq Comp, Ingles (Apr)
        23 to listOf(11, 16),   // Taller Arq -> Arq Comp, Ingles (Apr)
        24 to listOf(3, 16),    // Ing Soft -> Prog I, Ingles (Apr)
        25 to listOf(8, 12, 13, 16), // Instrum -> Mat C, Fis II, Mat D, Ingles (Apr)
        26 to listOf(18, 16),   // Circ Dig -> Dis Log, Ingles (Apr)
        27 to listOf(7, 10, 11, 16), // Concurrencia -> Prog II, Taller Len I, Arq Comp, Ingles (Apr)
        28 to listOf(5, 16),    // Eco -> Mat B, Ingles (Apr)
        29 to emptyList(),
        30 to listOf(7, 23, 16), // Taller Proy I -> Prog II, Taller Arq, Ingles (Apr)
        31 to listOf(7, 16),    // BD -> Prog II, Ingles (Apr)
        32 to listOf(14, 16),   // Redes II -> Sist Op, Ingles (Apr)
        33 to listOf(7, 14, 15, 16), // Sist TR -> Prog II, Sist Op, Taller Len II, Ingles (Apr)
        34 to emptyList(),
        35 to listOf(26, 24, 16), // Arq Cuant -> Circ Dig, Ing Soft, Ingles (Apr)
        36 to listOf(14, 15, 16), // Distr Paral -> Sist Op, Taller Len II, Ingles (Apr)
        37 to listOf(8, 16),    // Legal -> Mat C, Ingles (Apr)
        38 to emptyList(),
        39 to emptyList(),
        40 to listOf(7, 16),    // Taller Proy II -> Prog II, Ingles (Apr)
        41 to listOf(7, 4, 16), // Prog Cuant -> Prog II, Fund Arq, Ingles (Apr)
        42 to listOf(16),       // PPS -> Ingles (Apr)
        43 to emptyList(),
        44 to emptyList(),
        45 to listOf(16)
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),
        3 to listOf(1),
        4 to listOf(1),
        5 to listOf(2),
        6 to listOf(2),
        7 to listOf(3),
        8 to listOf(5),
        9 to listOf(7),
        10 to listOf(7),
        11 to listOf(4),
        12 to listOf(5, 6),
        13 to listOf(8),
        14 to listOf(7, 11),
        15 to listOf(10),
        16 to listOf(0),
        17 to listOf(8, 12, 16),
        18 to listOf(11, 16),
        19 to listOf(5, 16),
        20 to listOf(7, 16),
        21 to listOf(13, 16),
        22 to listOf(14, 16),
        23 to listOf(18, 16),
        24 to listOf(7, 16),
        25 to listOf(17, 21, 16),
        26 to listOf(23, 16),
        27 to listOf(14, 15, 16),
        28 to listOf(8, 16),
        29 to emptyList(),
        30 to listOf(26, 24, 16),
        31 to listOf(20, 16),
        32 to listOf(22, 16),
        33 to listOf(24, 27, 16),
        34 to listOf(29),
        35 to listOf(30, 16),
        36 to listOf(27, 16),
        37 to listOf(28, 16),
        38 to listOf(34),
        39 to emptyList(),
        40 to listOf(24, 16),
        41 to listOf(11, 24, 16),
        42 to listOf(16),
        43 to listOf(38),
        44 to emptyList(),
        45 to listOf(16)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        29 to 10, // AFC 1
        42 to 20,  // PPS
        45 to 15 //Electiva humanística
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}