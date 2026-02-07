package com.example.consola.data.mapas

object DataLicenciaturaEnSociologia : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Sociología General",                                // 0
        "Introducción a la Filosofía",                       // 1
        "Optativa A",                                        // 2
        "Economía I",                                        // 3
        "Optativa B",                                        // 4
        "Epistemología y Metodología de las Cs. Sociales",   // 5
        "Historia Social Contemporánea",                     // 6
        "Teoría Política",                                   // 7
        "Teoría Social Clásica I",                           // 8
        "Metodología de la Investigación Social I",          // 9
        "Teoría Social Clásica II",                          // 10
        "Historia Social Latinoamericana",                   // 11
        "Socioestadística",                                  // 12
        "Teoría Social Contemporánea A",                     // 13
        "Metodología de la Investigación Social II",         // 14
        "Optativa C",                                        // 15
        "Teoría Social Contemporánea B",                     // 16
        "Economía II",                                       // 17
        "Sociología de las Organizaciones",                  // 18
        "Sociología Política",                               // 19
        "Taller I",                                          // 20
        "Historia Social Argentina",                         // 21
        "Optativa D",                                        // 22
        "Análisis de la Sociedad Argentina",                 // 23
        "Taller II",                                         // 24
        "Optativa E",                                        // 25
        "Capacitación en Idiomas",                          // 26
        "Tesina"                                            // 27
    )

    // REGLAS PARA CURSAR (Cursada con Cursada)
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),       // Sociología General
        1 to emptyList(),       // Introducción a la Filosofía
        2 to emptyList(),       // Optativa A
        3 to emptyList(),       // Economía I
        4 to emptyList(),       // Optativa B
        5 to listOf(1, 0),       // Epistemología <- Intro Filo, Socio Gen
        6 to listOf(3, 0, 1),    // Hist Soc Cont <- Econ I, Socio Gen, Intro Filo
        7 to listOf(1, 0),       // Teo Pol <- Intro Filo, Socio Gen
        8 to listOf(1, 0),       // Teo Soc Clas I <- Intro Filo, Socio Gen
        9 to listOf(5),          // Metodología I <- Epistemología
        10 to listOf(8),         // Teo Soc Clas II <- Teo Soc Clas I
        11 to listOf(6),         // Hist Soc Lat <- Hist Soc Cont
        12 to emptyList(),      // Socioestadística
        13 to listOf(10),        // Teo Soc Cont A <- Teo Soc Clas II
        14 to listOf(9),         // Metodología II <- Metodología I
        15 to listOf(5, 10),     // Optativa C <- Epistemología, Teo Soc Clas II
        16 to listOf(10),        // Teo Soc Cont B <- Teo Soc Clas II
        17 to listOf(3),         // Economía II <- Economía I
        18 to listOf(3, 13),     // Soc Organizaciones <- Econ I, Teo Soc Cont A (o B)
        19 to listOf(7, 13),     // Soc Política <- Teo Pol, Teo Soc Cont A (o B)
        20 to listOf(14, 13),    // Taller I <- Metodología II, Teo Soc Cont A (o B)
        21 to listOf(6),         // Hist Soc Arg <- Hist Soc Cont
        22 to listOf(5, 10),     // Optativa D <- Epistemología, Teo Soc Clas II
        23 to listOf(17, 21, 19),// Análisis Soc Arg <- Econ II, Hist Soc Arg, Soc Política
        24 to listOf(9, 13),     // Taller II <- Metodología I, Teo Soc Cont A (o B)
        25 to listOf(5, 10),      // Optativa E <- Epistemología, Teo Soc Clas II
        26 to emptyList(),       // Capacitación en Idiomas
        27 to emptyList()        // Tesina
    )

    // REGLAS PARA CURSAR QUE PIDEN FINAL (Cursada con Final)
    override val reglasDeCorrelatividadesCursadaConFinal = emptyMap<Int, List<Int>>()

    // REGLAS PARA FINAL (Final con Final)
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(), // Sociología General
        1 to emptyList(),// Introducción a la Filosofía
        2 to emptyList(),//Optativa A
        3 to emptyList(),// Economía I
        4 to emptyList(),// Optativa B
        5 to listOf(1, 0),       // Epistemología <- Intro Filo, Socio Gen
        6 to listOf(3, 0, 1),    // Hist Soc Cont <- Econ I, Socio Gen, Intro Filo
        7 to listOf(1, 0),       // Teo Pol <- Intro Filo, Socio Gen
        8 to listOf(1, 0),       // Teo Soc Clas I <- Intro Filo, Socio Gen
        9 to listOf(5),          // Metodología I <- Epistemología
        10 to listOf(8),         // Teo Soc Clas II <- Teo Soc Clas I
        11 to listOf(6),         // Hist Soc Lat <- Hist Soc Cont
        12 to emptyList(),// Socioestadística
        13 to listOf(10),        // Teo Soc Cont A <- Teo Soc Clas II
        14 to listOf(9),         // Metodología II <- Metodología I
        15 to listOf(5, 10),     // Optativa C <- Epistemología, Teo Soc Clas II
        16 to listOf(10),        // Teo Soc Cont B <- Teo Soc Clas II
        17 to listOf(3),         // Economía II <- Economía I
        18 to listOf(13, 3),     // Soc Organizaciones <- Teo Soc Cont A (o B), Econ I
        19 to listOf(13, 7),     // Soc Política <- Teo Soc Cont A (o B), Teo Pol
        20 to listOf(14, 13),    // Taller I <- Metodología II, Teo Soc Cont A (o B)
        21 to listOf(6),         // Hist Soc Arg <- Hist Soc Cont
        22 to listOf(5, 10),     // Optativa D <- Epistemología, Teo Soc Clas II
        23 to listOf(7, 6, 3, 13), // Análisis Soc Arg <- Teo Pol, Hist Cont, Econ I, Teo Cont A
        24 to listOf(9, 13),     // Taller II <- Metodología I, Teo Soc Cont A (o B)
        25 to listOf(5, 10),      // Optativa E <- Epistemología, Teo Soc Clas II
        26 to emptyList(),       // Capacitación en Idiomas
        27 to emptyList()        // Tesina
    )

    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(), // Sociología General
        1 to emptyList(),// Introducción a la Filosofía
        2 to emptyList(),//Optativa A
        3 to emptyList(),// Economía I
        4 to emptyList(),// Optativa B
        5 to emptyList(), // Epistemología
        6 to emptyList(),// Hist Soc Cont
        7 to emptyList(),// Teo Pol
        8 to emptyList(),// Teo Soc Clas I
        9 to listOf(1, 0),       // Metodología I requiere FINAL de Intro Filo, Socio Gen
        10 to listOf(0, 1),      // Teo Soc Clas II requiere FINAL de Socio Gen, Intro Filo
        11 to listOf(1, 3, 0),   // Hist Soc Lat requiere FINAL de Intro Filo, Econ I, Socio Gen
        12 to emptyList(),
        13 to listOf(8),         // Teo Soc Cont A requiere FINAL de Teo Soc Clas I
        14 to listOf(5),         // Metodología II requiere FINAL de Epistemología
        15 to listOf(12, 8),     // Optativa C requiere FINAL de Socioestadística, Teo Soc Clas I
        16 to listOf(8),         // Teo Soc Cont B requiere FINAL de Teo Soc Clas I
        17 to emptyList(),
        18 to listOf(10),         // Sociología de las organizaciones requiere FINAL de Teo Soc Clas II
        19 to listOf(10),        // Soc Política requiere FINAL de Teo Soc Clas II
        20 to listOf(9, 10),     // Taller I requiere FINAL de Metodología I, Teo Soc Clas II
        21 to listOf(3, 0, 1),   // Hist Soc Arg requiere FINAL de Econ I, Socio Gen, Intro Filo
        22 to listOf(12, 8),     // Optativa D requiere FINAL de Socioestadística, Teo Soc Clas I
        23 to listOf(6,7,3,13,), // Análisis Soc Arg requiere FINAL de Hist Soc Cont, Teo Pol, Econ I, Teo Cont A (o B)
        24 to listOf(9, 10),     // Taller II requiere FINAL de Metodología I, Teo Soc Clas II
        25 to listOf(12, 8),      // Optativa E requiere FINAL de Socioestadística, Teo Soc Clas I
        26 to emptyList(),       // Capacitación en Idiomas
        27 to emptyList()        // Tesina
    )
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}