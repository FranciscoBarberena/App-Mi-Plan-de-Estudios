package com.example.consola.data.mapas

object DataTraductoradoIngles : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Introducción a la Lengua Inglesa",              // 0
        "Introducción a los Estudios del Lenguaje y de la Comunicación", // 1
        "Derecho 1",                                     // 2
        "Optativa Introductoria",                        // 3
        "Optativa Literaria I",                          // 4
        "Lengua Inglesa 1",                              // 5
        "Fonética y Fonología Inglesas 1",               // 6
        "Gramática Inglesa 1",                           // 7
        "Técnicas de Expresión en Castellano",           // 8
        "Derecho 2",                                     // 9
        "Lengua Inglesa 2",                              // 10
        "Fonética y Fonología Inglesas 2",               // 11
        "Gramática Inglesa 2",                           // 12
        "Gramática Comparada (Castellano-Inglés)",       // 13
        "Optativa Literaria II",                         // 14
        "Optativa Filosófica",                           // 15
        "Lengua Inglesa 3",                              // 16
        "Traducción Literaria 1",                        // 17
        "Traducción Científico-Técnica 1",               // 18
        "Traducción Jurídico-Económica 1",               // 19
        "Dicción Inglesa 1",                             // 20
        "Lingüística",                                   // 21
        "Lengua Inglesa 4",                              // 22
        "Interpretación",                                // 23
        "Traducción Literaria 2",                        // 24
        "Traducción Científico-Técnica 2",               // 25
        "Prácticas en Traducción",                       // 26
        "Traducción Jurídico-Económica 2",               // 27
        "Capacitación Nivel 1",                          // 28
        "Capacitación Nivel 2"                           // 29
    )

    private val correlatividadesComunes = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1, 3),       // Optativa Lit I <- Intro Est. Lenguaje, Opt. Intro
        5 to listOf(0),          // Lengua Inglesa 1 <- Intro Lengua Inglesa
        6 to listOf(0),          // Fonetica 1 <- Intro Lengua Inglesa
        7 to listOf(0),          // Gramatica 1 <- Intro Lengua Inglesa
        8 to listOf(1),          // Tecnicas Exp Castellano <- Intro Est. Lenguaje
        9 to emptyList(), //Derecho 2
        10 to listOf(6, 5),      // Lengua Inglesa 2 <- Fonetica 1, Lengua 1
        11 to listOf(6, 5),      // Fonetica 2 <- Fonetica 1, Lengua 1
        12 to listOf(7),         // Gramatica 2 <- Gramatica 1
        13 to listOf(1, 12),     // Gramatica Comparada <- Intro Est. Lenguaje, Gramatica 2
        14 to listOf(3, 5),      // Optativa Lit II <- Opt. Intro, Lengua 1
        15 to listOf(1),         // Optativa Filosofica <- Intro Est. Lenguaje
        16 to listOf(11, 10),    // Lengua Inglesa 3 <- Fonetica 2, Lengua 2
        17 to listOf(10, 13, 4, 14), // Trad. Literaria 1 <- Lengua 2, Gram. Comp, Opt Lit I, Opt Lit II
        18 to listOf(10, 13, 15),    // Trad. Cientifica 1 <- Lengua 2, Gram. Comp, Opt Filosofica
        19 to listOf(10, 13, 2, 9),  // Trad. Juridica 1 <- Lengua 2, Gram. Comp, Derecho 1, Derecho 2
        20 to listOf(11),        // Diccion Inglesa 1 <- Fonetica 2
        21 to listOf(1, 8, 12),  // Linguistica <- Intro Est. Lenguaje, Tecnicas Exp, Gramatica 2
        22 to listOf(20, 16),    // Lengua Inglesa 4 <- Diccion 1, Lengua 3
        23 to listOf(19, 18, 17),// Interpretacion <- Trad Jur 1, Trad Cient 1, Trad Lit 1
        24 to listOf(17),        // Trad Lit 2 <- Trad Lit 1
        25 to listOf(18),        // Trad Cient 2 <- Trad Cient 1
        26 to listOf(19, 17, 18),// Practicas Trad <- Trad Jur 1, Trad Lit 1, Trad Cient 1
        27 to listOf(19),        // Trad Jur 2 <- Trad Jur 1
        28 to emptyList(),      //Capacitacion Nivel 1
        29 to listOf(28)         // Capacitacion Nivel 2 <- Capacitacion Nivel 1
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