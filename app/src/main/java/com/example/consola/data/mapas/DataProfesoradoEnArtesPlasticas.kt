package com.example.consola.data.mapas

object DataProfesoradoEnArtesPlasticas : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Procedimientos de las artes plásticas",   // 0 (P0001)
        "Lenguaje visual 1",                       // 1 (H0003)
        "Dibujo 1",                                // 2 (P0002)
        "Arte contemporáneo",                      // 3 (H0006)
        "Taller básico 1",                         // 4 (P0033)
        "Taller complementario 1",                 // 5 (P0083)
        "Taller complementario 2",                 // 6 (P0083)
        "Lenguaje visual 2",                       // 7 (H0037)
        "Dibujo 2",                                // 8 (P0003)
        "Historia de las artes visuales 1",        // 9 (H0001)
        "Historia, política y cultura contemporánea",   // 10 (H0105)
        "Taller básico 2",                         // 11 (P0034)
        "Taller complementario 3",                 // 12 (P0083)
        "Taller complementario 4",                 // 13 (P0083)
        "Lenguaje visual 3",                       // 14 (H0040)
        "Dibujo 3",                                // 15 (P0004)
        "Historia de las artes visuales 2",        // 16 (H0002)
        "Producción de textos A",                  // 17 (H0005)
        "Epistemología de las artes",              // 18 (H0016)
        "Taller básico 3",                         // 19 (P0035)
        "Taller complementario (Artes combinadas)",         // 20 (P0057)
        "Taller complementario (Fotografía e imagen digital)", // 21 (P0058)
        "Dibujo 4",                                // 22 (P0005)
        "Teoría del arte",                         // 23 (H0113)
        "Historia de las artes visuales 3",        // 24 (H0007)
        "Metodología de la investigación", // 25 (H0030)
        "Fundamentos de la educación", //26
        "Legislación y política cultural",         // 27 (H0070)
        "Historia de las artes visuales 4", // 28 (H0008)
        "Didáctica especial y prácticas de la enseñanza", //29
        "Seminario a elección 1",                  // 30 (00010)

    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to emptyList(),
        7 to emptyList(),
        8 to emptyList(),
        9 to listOf(3),
        10 to listOf(3),
        11 to emptyList(),
        12 to emptyList(),
        13 to emptyList(),
        14 to emptyList(),
        15 to emptyList(),
        16 to listOf(9),
        17 to listOf(10),
        18 to listOf(3, 10),
        19 to emptyList(),
        20 to emptyList(),
        21 to emptyList(),
        22 to emptyList(),
        23 to listOf(10),
        24 to listOf(16),
        25 to listOf(18),
        26 to listOf(16),
        27 to listOf(25),
        28 to listOf(24),
        29 to listOf(23,26),
        30 to listOf(16)
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(0,1,2),
        5 to listOf(0,1),
        6 to listOf(0,1),
        7 to listOf(0,1),
        8 to listOf(2),
        9 to emptyList(),
        10 to emptyList(),
        11 to listOf(2,4,7),
        12 to listOf(0,1),
        13 to listOf(0,1),
        14 to listOf(0,1),
        15 to listOf(8),
        16 to listOf(3),
        17 to emptyList(),
        18 to emptyList(),
        19 to listOf(11,14),
        20 to listOf(3,5,14),
        21 to listOf(3,5,14),
        22 to listOf(15),
        23 to emptyList(),
        24 to emptyList(),
        25 to emptyList(),
        26 to listOf(11,14),
        27 to emptyList(),
        28 to emptyList(),
        29 to listOf(15,18,19,20,21),
        30 to listOf(11, 14, 9)

    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(0, 1, 2),
        5 to listOf(0, 1),
        6 to listOf(0, 1),
        7 to listOf(0, 1),
        8 to listOf(2),
        9 to listOf(3),
        10 to listOf(3),
        11 to listOf(2, 4, 7),
        12 to listOf(0, 1),
        13 to listOf(0, 1),
        14 to listOf(7, 4),
        15 to listOf(8),
        16 to listOf(9),
        17 to listOf(10),
        18 to listOf(3, 10),
        19 to listOf(11, 14),
        20 to listOf(3, 12,14),
        21 to listOf(3, 12,14),
        22 to listOf(15),
        23 to listOf(10),
        24 to listOf(16),
        25 to listOf(18),
        26 to listOf(11,14,16),
        27 to listOf(25),
        28 to listOf(24),
        29 to listOf(26,15,19,20,21,18,23),
        30 to listOf(11, 14, 16)

    )

    override val reglasDeCorrelatividadesCursadaConFinal = null
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}