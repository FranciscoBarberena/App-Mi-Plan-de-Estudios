package com.example.consola.data.mapas

object DataProfesoradoEnSociologia : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Sociología General",                                 // 0
        "Introducción a la Filosofía",                        // 1
        "Socioestadística",                                   // 2
        "Epistemología y Metodología de las Ciencias Sociales", // 3
        "Economía I",                                         // 4
        "Antropología Cultural y Social",                     // 5
        "Teoría Social Clásica I",                            // 6
        "Metodología de la Investigación Social I",           // 7
        "Teoría Política",                                    // 8
        "Teoría Social Clásica II",                           // 9
        "Historia Social Contemporánea",                      // 10
        "Economía II",                                        // 11
        "Metodología de la Investigación Social II",          // 12
        "Teoría Social Contemporánea A",                      // 13
        "Historia Social Argentina",                          // 14
        "Teoría Social Contemporánea B",                      // 15
        "Historia Social Latinoamericana",                    // 16
        "Fundamentos de la Educación",                        // 17
        "Psicología y Cultura en el Proceso Educativo",       // 18
        "Taller I",                                           // 19
        "Sociología de las Organizaciones",                   // 20
        "Sociología Política",                                // 21
        "Historia y Política del Sistema Educativo Argentino",// 22
        "Didáctica de las Ciencias Sociales",                 // 23
        "Optativa Geografía",                                 // 24
        "Taller II",                                          // 25
        "Análisis de la Sociedad Argentina",                  // 26
        "Optativa C, D o E",                                  // 27
        "Didáctica Especial y Prácticas de la Enseñanza en Sociología y Ciencias Sociales" // 28
    )

    // REGLAS PARA CURSAR (Cursada con Cursada)
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),         // Sociología General
        1 to emptyList(),         // Introducción a la Filosofía
        2 to emptyList(),         // Optativa A
        3 to listOf(1, 0),        // Epistemología <- Intro Filo, Socio Gen
        4 to emptyList(),         // Optativa B
        5 to emptyList(),         // Antropología
        6 to listOf(1, 0),        // Teo Soc Clas I <- Intro Filo, Socio Gen
        7 to listOf(3),           // Metodología I <- Epistemología
        8 to listOf(1, 0),        // Teo Pol <- Intro Filo, Socio Gen
        9 to listOf(6),           // Teo Soc Clas II <- Teo Soc Clas I
        10 to listOf(4, 0, 1),    // Hist Soc Cont <- Econ I, Socio Gen, Intro Filo
        11 to listOf(4),          // Economía II <- Economía I
        12 to listOf(7),          // Metodología II <- Metodología I
        13 to listOf(9),          // Teo Soc Cont A <- Teo Soc Clas II
        14 to listOf(10),         // Hist Soc Arg <- Hist Soc Cont
        15 to listOf(9),          // Teo Soc Cont B <- Teo Soc Clas II
        16 to listOf(10),         // Hist Soc Lat <- Hist Soc Cont
        17 to emptyList(),        // Fundamentos de la Educación
        18 to listOf(17),        // Psicología y Cultura
        19 to listOf(12, 13),     // Taller I <- Metodología II, Teo Soc Cont A
        20 to listOf(4, 13),      // Soc Organizaciones <- Econ I, Teo Soc Cont A
        21 to listOf(8, 13),      // Soc Política <- Teo Pol, Teo Soc Cont A
        22 to listOf(17),        // Historia y Política Sist. Ed.
        23 to listOf(17),        // Didáctica Cs Sociales
        24 to emptyList(),        // Optativa Geografía
        25 to listOf(7, 13),      // Taller II <- Metodología I, Teo Soc Cont A
        26 to listOf(11, 14, 21), // Análisis Soc Arg <- Econ II, Hist Soc Arg, Soc Política
        27 to listOf(3, 9),       // Optativa C,D,E <- Epistemología, Teo Soc Clas II
        28 to listOf(23)        // Didáctica Especial
    )

    // REGLAS PARA CURSAR QUE PIDEN FINAL (Cursada con Final)
    // Actualizado con la lógica específica solicitada, mapeada a los nuevos índices
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),         // Sociología General
        1 to emptyList(),         // Introducción a la Filosofía
        2 to emptyList(),         // Optativa A
        3 to emptyList(),         // Economía I
        4 to emptyList(),         // Optativa B
        5 to emptyList(),         // Antropología
        6 to emptyList(),           // Teo Soc Clas I
        7 to listOf(1, 0),        // Metodología I pide FINAL de Intro Filo, Socio Gen
        8 to emptyList(),
        9 to listOf(0, 1),        // Teo Soc Clas II pide FINAL de Socio Gen, Intro Filo
        10 to emptyList(),
        11 to emptyList(),
        12 to listOf(3),          // Metodología II  pide FINAL de Epistemología
        13 to listOf(6),          // Teo Soc Cont A  pide FINAL de Teo Soc Clas I
        14 to listOf(4, 0, 1),    // Hist Soc Arg  pide FINAL de Econ I, Socio Gen, Intro Filo
        15 to listOf(6),          // Teo Soc Cont B  pide FINAL de Teo Soc Clas I
        16 to listOf(1, 4, 0),    // Hist Soc Lat  pide FINAL de Intro Filo, Econ I, Socio Gen
        17 to emptyList(),
        18 to emptyList(),
        19 to listOf(7, 9),       // Taller I  pide FINAL de Metodología I (7) y Teo Soc Clas II (9)
        20 to listOf(9),          // Soc Org  pide FINAL de Teo Soc Clas II (9)
        21 to listOf(9),          // Soc Política  pide FINAL de Teo Soc Clas II (9)
        22 to emptyList(),
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(7, 9),       // Taller II  pide FINAL de Metodología I (7) y Teo Soc Clas II (9)
        26 to listOf(10, 8, 4, 13), // Análisis Soc Arg  pide FINAL de Hist Cont(10), Teo Pol(8), Econ I(4), Teo Cont A(13)
        27 to listOf(2, 6),        // Optativa  pide FINAL de Socioestadística(2) y Teo Soc Clas I(6)
        28 to listOf(17)
    )

    // REGLAS PARA FINAL (Final con Final)
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        3 to listOf(1, 0),        // Epistemología <- Intro Filo, Socio Gen
        5 to emptyList(),         // Antropología
        6 to listOf(1, 0),        // Teo Soc Clas I <- Intro Filo, Socio Gen
        7 to listOf(3),           // Metodología I <- Epistemología
        8 to listOf(1, 0),        // Teo Pol <- Intro Filo, Socio Gen
        9 to listOf(6),           // Teo Soc Clas II <- Teo Soc Clas I
        10 to listOf(4, 0, 1),    // Hist Soc Cont <- Econ I, Socio Gen, Intro Filo
        11 to listOf(4),          // Economía II <- Economía I
        12 to listOf(7),          // Metodología II <- Metodología I
        13 to listOf(9),          // Teo Soc Cont A <- Teo Soc Clas II
        14 to listOf(10),         // Hist Soc Arg <- Hist Soc Cont
        15 to listOf(9),          // Teo Soc Cont B <- Teo Soc Clas II
        16 to listOf(10),         // Hist Soc Lat <- Hist Soc Cont
        17 to emptyList(),
        18 to listOf(17),// Psicología y Cultura pide FINAL de Fundamentos
        19 to listOf(12, 13),     // Taller I <- Metodología II, Teo Soc Cont A
        20 to listOf(13, 4),      // Soc Organizaciones <- Teo Soc Cont A, Econ I
        21 to listOf(13, 8),      // Soc Política <- Teo Soc Cont A, Teo Pol
        22 to listOf(17),        // Historia y Política  pide FINAL de Fundamentos
        23 to listOf(17),        // Didáctica Cs Sociales pide FINAL de Fundamentos
        24 to emptyList(), // Optativa Geografía
        25 to listOf(7, 13),      // Taller II <- Metodología I, Teo Soc Cont A
        26 to listOf(8, 10, 4, 13), // Análisis Soc Arg <- Teo Pol, Hist Cont, Econ I, Teo Cont A
        27 to listOf(3, 9),       // Optativa C,D,E <- Epistemología, Teo Soc Clas II
        28 to listOf(23)        // Didáctica Especial
    )

    override val reglasDeCorrelatividadesCursadaConFinal = emptyMap<Int, List<Int>>()
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}