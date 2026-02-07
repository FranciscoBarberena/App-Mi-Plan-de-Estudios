package com.example.consola.data.mapas

object DataProfesoradoIngles : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Introducción a la Lengua Inglesa",              // 0
        "Introducción a los Estudios del Lenguaje y de la Comunicación", // 1
        "Fundamentos de la Educación",                   // 2
        "Optativa Introductoria",                        // 3
        "Optativa Literaria I",                          // 4
        "Lengua Inglesa 1",                              // 5
        "Fonética y Fonología Inglesas 1",               // 6
        "Gramática Inglesa 1",                           // 7
        "Técnicas de Expresión en Castellano",           // 8
        "Historia y Política del Sistema Educativo Argentino", // 9
        "Fonética y Fonología Inglesas 2",               // 10
        "Gramática Inglesa 2",                           // 11
        "Lengua Inglesa 2",                              // 12
        "Gramática Comparada (Castellano-Inglés)",       // 13
        "Lingüística",                                   // 14
        "Psicología y Cultura en el Proceso Educativo",  // 15
        "Lengua Inglesa 3",                              // 16
        "Dicción Inglesa 1",                             // 17
        "Dicción Inglesa 2",                             // 18
        "Historia de la Lengua Inglesa",                 // 19
        "Didáctica Especial y Prácticas Docentes en Lengua Inglesa 1", // 20
        "Literatura Inglesa Contemporánea (Optativa)",   // 21
        "Cultura y Civilización Inglesa (Optativa)",     // 22
        "Lengua Inglesa 4",                              // 23
        "Didáctica Especial y Prácticas Docentes en Lengua Inglesa 2", // 24
        "Literatura Clásica y Moderna (Optativa)",       // 25
        "Literatura Inglesa Medieval y Renacentista (Optativa)", // 26
        "Literatura de los Estados Unidos (Optativa)",   // 27
        "Capacitación Nivel 1",                          // 28
        "Capacitación Nivel 2"                           // 29
    )

    private val correlatividadesComunes = mapOf(
        0 to emptyList(),         // Intro Lengua Inglesa
        1 to emptyList(),         // Intro Est Lenguaje
        2 to emptyList(),         // Fundamentos
        3 to emptyList(),         // Opt Intro
        4 to listOf(1, 3),        // Opt Literaria I <- Intro Est Lenguaje, Opt Intro
        5 to listOf(0),           // Lengua Inglesa 1 <- Intro Lengua Inglesa
        6 to listOf(0),           // Fonética 1 <- Intro Lengua Inglesa
        7 to listOf(0),           // Gramática 1 <- Intro Lengua Inglesa
        8 to listOf(1),           // Téc. Expresión <- Intro Est Lenguaje
        9 to emptyList(),         // Historia y Politica
        10 to listOf(6, 5),       // Fonética 2 <- Fonética 1, Lengua 1
        11 to listOf(7),          // Gramática 2 <- Gramática 1
        12 to listOf(6, 5),       // Lengua Inglesa 2 <- Fonética 1, Lengua 1
        13 to listOf(1, 11),      // Gram. Comparada <- Intro Est Lenguaje, Gramática 2
        14 to listOf(1, 8, 11),   // Lingüística <- Intro Est Lenguaje, Téc Expr, Gramática 2
        15 to emptyList(),        // Psicología y Cultura
        16 to listOf(10, 12),     // Lengua Inglesa 3 <- Fonética 2, Lengua 2
        17 to listOf(10),         // Dicción Inglesa 1 <- Fonética 2
        18 to listOf(17),         // Dicción Inglesa 2 <- Dicción Inglesa 1
        19 to listOf(11),         // Historia Lengua <- Gramática 2
        20 to listOf(2, 9, 15),   // Didáctica 1 <- Fundamentos, Historia Pol., Psicología
        21 to listOf(3, 12),      // Lit. Contemporánea <- Opt Intro, Lengua 2
        22 to listOf(3,12),        // Cultura y Civilización
        23 to listOf(17, 16),     // Lengua Inglesa 4 <- Dicción 1, Lengua 3
        24 to listOf(20),         // Didáctica 2 <- Didáctica 1
        25 to listOf(22),         // Lit. Clásica y Mod. <- Cultura y Civilización
        26 to listOf(19),         // Lit. Medieval <- Hist. Lengua
        27 to listOf(19),         // Lit. EEUU <- Hist. Lengua
        28 to emptyList(),        // Capacitación Nivel 1
        29 to listOf(28)          // Capacitación 2 <- Capacitación 1
    )

    override val reglasDeCorrelatividadesCursadaConCursada = correlatividadesComunes
    override val reglasDeCorrelatividadesFinalConFinal = correlatividadesComunes

    override val reglasDeCorrelatividadesCursadaConFinal = emptyMap<Int, List<Int>>()
    override val reglasDeCorrelatividadesFinalConCursada = emptyMap<Int, List<Int>>()
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}