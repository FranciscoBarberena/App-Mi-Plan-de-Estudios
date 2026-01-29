package com.example.consola.data.mapas

object DataProfesoradoEnDisenoIndustrial : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Taller de Diseño Industrial 1",           // 0  (I0001)
        "Tecnología de Diseño Industrial 1",       // 1  (I0002)
        "Fundamentos de la forma",                 // 2  (I0003)
        "Dibujo 1",                                // 3  (I0005)
        "Ergonomía y Diseño Centrado en las Personas", // 4 (I0025)
        "Panorama Histórico y social del diseño",  // 5  (H0053)
        "Taller de Diseño Industrial 2",           // 6  (I0006)
        "Tecnología de Diseño Industrial 2",       // 7  (I0007)
        "Producción de la forma",                  // 8  (I0008)
        "Dibujo 2",                                // 9  (I0010)
        "Métodos de Diseño 1",                     // 10 (I0026)
        "Historia, política y cultura contemporáneas", // 11 (H0105)
        "Matemática 1",                            // 12 (I0028)
        "Taller de Diseño Industrial 3",           // 13 (I0011)
        "Tecnología de Diseño Industrial 3",       // 14 (I0012)
        "Sistemas de la forma",                    // 15 (I0013)
        "Métodos de Diseño 2",                     // 16 (I0027)
        "Seminario Optativo 1",                    // 17 (I0014)
        "Diseño y Cultura",                        // 18 (I0035)
        "Matemática 2",                            // 19 (I0029)
        "Física 1",                                // 20 (I0009)
        "Taller de Diseño Industrial 4",           // 21 (I0017)
        "Tecnología de Diseño Industrial 4",       // 22 (I0018)
        "Economía política e industria",           // 23 (I0031)
        "Historia del diseño Industrial",          // 24 (I0019)
        "Seminario Optativo 2",                    // 25 (I0020)
        "Física 2",                                // 26 (I0016)
        "Taller de Diseño Industrial 5",           // 27 (I0021)
        "Tecnología de Diseño Industrial 5",       // 28 (I0022)
        "Gestión de Diseño",                       // 29 (I0034)
        "Seminario Optativo 3",                    // 30 (I0032)
        "Seminario Optativo 4"                     // 31 (I0033)
    )

    // Columna: "Materias Correlativas para Cursar" -> Subcolumna "Correlativa Cursada"
    // Requisito: Tener la cursada (regularizada) de estas materias para CURSAR la actual.
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(1, 2, 3),      // Taller 2 -> Tecno 1, Fundamentos, Dibujo 1
        7 to listOf(1, 3),         // Tecno 2 -> Tecno 1, Dibujo 1
        8 to listOf(2, 3),         // Prod Forma -> Fundamentos, Dibujo 1
        9 to listOf(2, 3),         // Dibujo 2 -> Fundamentos, Dibujo 1
        10 to listOf(5),           // Metodos 1 -> Panorama
        11 to listOf(5),           // Hist Pol -> Panorama
        12 to emptyList(),         // Mat 1 -> Sin correlativas
        13 to listOf(10, 7, 8, 9), // Taller 3 -> Metodos 1, Tecno 2, Prod Forma, Dibujo 2
        14 to listOf(7, 12),       // Tecno 3 -> Tecno 2, Mat 1
        15 to listOf(8, 9),        // Sist Forma -> Prod Forma, Dibujo 2
        16 to listOf(10),          // Metodos 2 -> Metodos 1
        17 to listOf(9),           // Sem Opt 1 -> Dibujo 2
        18 to listOf(11),          // Dis y Cult -> Hist Pol
        19 to listOf(12),          // Mat 2 -> Mat 1
        20 to listOf(12, 7),       // Fis 1 -> Mat 1, Tecno 2
        21 to listOf(14, 15, 16),  // Taller 4 -> Tecno 3, Sist Forma, Metodos 2
        22 to listOf(14, 20),      // Tecno 4 -> Tecno 3, Fis 1
        23 to listOf(18),          // Economia -> Dis y Cult
        24 to listOf(18, 16),      // Hist Dis -> Dis y Cult, Metodos 2
        25 to listOf(9),           // Sem Opt 2 -> Dibujo 2
        26 to listOf(19, 20),      // Fis 2 -> Mat 2, Fis 1
        27 to listOf(18),
        28 to listOf(22, 24, 23),  // Taller 5 -> Tecno 4, Hist Dis, Economia
        29 to listOf(22, 26),      // Tecno 5 -> Tecno 4, Fis 2
        30 to listOf(23, 24),      // Gestion -> Economia, Hist Dis
        31 to emptyList(),         // Sem Opt 3 -> (Ver FinalConCursada)
        32 to emptyList(),          // Sem Opt 4 -> (Ver FinalConCursada)
        33 to listOf(27,24)
    )

    // Columna: "Materias Correlativas para Cursar" -> Subcolumna "Correlativa Aprobada"
    // Requisito: Tener el FINAL aprobado de estas materias para CURSAR la actual.
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(0),            // Taller 2 -> Final Taller 1
        7 to emptyList(),
        8 to emptyList(),
        9 to emptyList(),
        10 to listOf(0),           // Metodos 1 -> Final Taller 1
        11 to emptyList(),
        12 to emptyList(),
        13 to listOf(6, 4),        // Taller 3 -> Final Taller 2, Ergonomia
        14 to listOf(1, 3, 0),     // Tecno 3 -> Final Tecno 1, Dibujo 1, Taller 1
        15 to listOf(2),           // Sist Forma -> Final Fundamentos
        16 to listOf(6, 1, 2, 3),  // Metodos 2 -> Final Taller 2, Tecno 1, Fundamentos, Dibujo 1
        17 to listOf(3, 6, 1),     // Sem Opt 1 -> Final Dibujo 1, Taller 2, Tecno 1
        18 to listOf(5),           // Dis y Cult -> Final Panorama
        19 to emptyList(),
        20 to listOf(1),           // Fis 1 -> Final Tecno 1
        21 to listOf(13, 11, 7, 8),// Taller 4 -> Final Taller 3, Hist Pol, Tecno 2, Prod Forma
        22 to listOf(7, 9, 12, 6), // Tecno 4 -> Final Tecno 2, Dibujo 2, Mat 1, Taller 2
        23 to listOf(11),          // Economia -> Final Hist Pol
        24 to listOf(11, 10, 5),   // Hist Dis -> Final Hist Pol, Metodos 1, Panorama
        25 to listOf(3, 6, 1),     // Sem Opt 2 -> Final Dibujo 1, Taller 2, Tecno 1
        26 to listOf(12, 7),       // Fis 2 -> Final Mat 1, Tecno 2
        27 to listOf(14),
        28 to listOf(21, 14, 15, 18), // Taller 5 -> Final Taller 4, Tecno 3, Sist Forma, Dis y Cult
        29 to listOf(14, 13, 20),  // Tecno 5 -> Final Tecno 3, Taller 3, Fis 1
        30 to listOf(16, 18),      // Gestion -> Final Metodos 2, Dis y Cult
        31 to listOf(25),          // Sem Opt 3 -> Final Sem Opt 2
        32 to listOf(25),           // Sem Opt 4 -> Final Sem Opt 2
        33 to listOf(21)
    )

    // Columna: "Materias Correlativas para Rendir" -> Subcolumna "Correlativa Aprobada"
    // Requisito: Tener el FINAL aprobado de estas materias para RENDIR (Aprobar final) de la actual.
    // Nota: La columna "Correlativa Cursada" bajo "Para Rendir" suele ser redundante o implica la regularidad propia,
    // por lo que usamos la columna estricta de "Aprobada".
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(0),            // Taller 2 -> Taller 1
        7 to emptyList(),          // Tecno 2 -> (Celda vacía en col Aprobada p/ Rendir)
        8 to emptyList(),
        9 to emptyList(),
        10 to listOf(0),           // Metodos 1 -> Taller 1
        11 to emptyList(),
        12 to emptyList(),
        13 to listOf(6, 4, 1, 2, 3), // Taller 3 -> Taller 2, Ergo, Tecno 1, Fund, Dib 1
        14 to listOf(1, 3, 0),     // Tecno 3 -> Tecno 1, Dibujo 1, Taller 1
        15 to listOf(2, 3),        // Sist Forma -> Fundamentos, Dibujo 1
        16 to listOf(6, 1, 2, 3, 5), // Metodos 2 -> Taller 2, Tecno 1, Fund, Dib 1, Panorama
        17 to listOf(3, 6, 1),     // Sem Opt 1 -> Dibujo 1, Taller 2, Tecno 1
        18 to listOf(5, 0, 2),     // Dis y Cult -> Panorama, Taller 1, Fundamentos
        19 to emptyList(),
        20 to listOf(1),           // Fis 1 -> Tecno 1
        21 to listOf(13, 11, 7, 8, 9), // Taller 4 -> Taller 3, Hist Pol, Tecno 2, Prod F, Dib 2
        22 to listOf(7, 9, 12, 6), // Tecno 4 -> Tecno 2, Dib 2, Mat 1, Taller 2 (Según col Final/Final parece repetir Final/Cursada)
        23 to listOf(11),          // Economia -> Hist Pol
        24 to listOf(11, 10, 5),   // Hist Dis -> Hist Pol, Met 1, Panorama
        25 to listOf(3, 6, 1),     // Sem Opt 2 -> Dib 1, Taller 2, Tecno 1
        26 to listOf(12, 7),       // Fis 2 -> Mat 1, Tecno 2
        27 to listOf(13),
        28 to listOf(21, 14, 15, 18), // Taller 5 -> Taller 4, Tecno 3, Sist Forma, Dis y Cult
        29 to listOf(14, 13, 20),  // Tecno 5 -> Tecno 3, Taller 3, Fis 1
        30 to listOf(16, 18),      // Gestion -> Metodos 2, Dis y Cult
        31 to listOf(25),          // Sem Opt 3 -> Sem Opt 2
        32 to listOf(25),           // Sem Opt 4 -> Sem Opt 2
        33 to listOf(21)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = reglasDeCorrelatividadesCursadaConCursada
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}