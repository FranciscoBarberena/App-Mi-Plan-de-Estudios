package com.example.consola.data.mapas

object DataCienciaDeDatos : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Algoritmos y Programación I",                                // 0  (I101)
        "Matemática A",                                               // 1  (X102)
        "Gestión de las organizaciones",                              // 2  (E103)
        "Algoritmos y Programación II",                               // 3  (I104)
        "Matemática B",                                               // 4  (X105)
        "Economía y Medición Económica",                              // 5  (E106)
        "Taller de lenguajes",                                        // 6  (I201)
        "Introducción a Base de Datos",                               // 7  (I202)
        "Contabilidad e interpretación de estados contables",         // 8  (E203)
        "Matemática C",                                               // 9  (X204)
        "Base de Datos",                                              // 10 (I205)
        "Procesos de negocio",                                        // 11 (E206)
        "Matemática D",                                               // 12 (X207)
        "Inglés (Prueba lecto-comprensión y traducción)",             // 13 (0208)
        "Fundamentos de Arquitectura de Computadoras, Sistemas Operativos y Redes", // 14 (I301)
        "Ingeniería de Software",                                     // 15 (I302)
        "Costos e información para la gestión",                       // 16 (E303)
        "Gestión de personas y equipos",                              // 17 (E304)
        "Visualización de grandes volúmenes de datos",                // 18 (I305)
        "Minería de Datos y Aprendizaje Automático",                  // 19 (I306)
        "Tecnologías para la Gestión",                                // 20 (E307)
        "Conceptos y aplicaciones en Big Data",                       // 21 (I401)
        "Finanzas de empresas",                                       // 22 (E402)
        "Estrategia de tecnología y gestión de proyectos",            // 23 (E403)
        "Marketing estratégico y operativo",                          // 24 (E404)
        "Aplicaciones de Inteligencia de Datos en organizaciones",    // 25 (I405)
        "Dirección general",                                          // 26 (E406)
        "Optativa",                                                   // 27 (0407)
        "Práctica Profesional Supervisada (PPS)"                      // 28 (0408)
    )


    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),         // Algoritmos y Prog I
        1 to emptyList(),         // Matemática A
        2 to emptyList(),         // Gestión de las organizaciones
        3 to listOf(0),           // Algoritmos II <- Algoritmos I (I101)
        4 to listOf(1),           // Matemática B <- Matemática A (X102)
        5 to listOf(1, 2),        // Economía y Medición <- Mat A (X102), Gestión Org (E103)
        6 to listOf(3),           // Taller de lenguajes <- Algoritmos II (I104)
        7 to listOf(3),           // Intro Base de Datos <- Algoritmos II (I104)
        8 to listOf(5),           // Contabilidad <- Economía y Medición (E106)
        9 to listOf(4),           // Matemática C <- Matemática B (X105)
        10 to listOf(7),          // Base de Datos <- Intro Base de Datos (I202)
        11 to listOf(8),          // Procesos de negocio <- Contabilidad (E203)
        12 to listOf(9),          // Matemática D <- Matemática C (X204)
        13 to emptyList(),        // Inglés
        14 to listOf(3, 13),      // Fundamentos Arq. <- Algoritmos II (I104), Inglés (0208)
        15 to listOf(6, 13),      // Ing. de Software <- Taller lenguajes (I201), Inglés (0208)
        16 to listOf(4, 8, 13),   // Costos <- Mat B (X105), Contabilidad (E203), Inglés (0208)
        17 to listOf(4, 8, 13),   // Gestión de personas <- Mat B (X105), Contabilidad (E203), Inglés (0208)
        18 to listOf(12, 13),     // Visualización Datos <- Mat D (X207), Inglés (0208)
        19 to listOf(6, 12, 13),  // Minería de Datos <- Taller leng. (I201), Mat D (X207), Inglés (0208)
        20 to listOf(9, 11, 13),  // Tecnologías para Gestión <- Mat C (X204), Procesos (E206), Inglés (0208)
        21 to listOf(6, 12, 13),  // Big Data <- Taller leng. (I201), Mat D (X207), Inglés (0208)
        22 to listOf(12, 16),     // Finanzas empresas <- Mat D (X207), Costos (E303)
        23 to listOf(12, 20, 13), // Estrategia de tec. <- Mat D (X207), Tecnologías Gestión (E307), Inglés (0208)
        24 to listOf(11, 12, 13, 17), // Marketing <- Procesos (E206), Mat D (X207), Inglés (0208), Gestión pers. (E304)
        25 to listOf(19),         // Aplicaciones Int. Datos <- Minería de Datos (I306)
        26 to listOf(12, 16, 17, 20), // Dirección gral <- Mat D (X207), Costos (E303), Gestión pers. (E304), Tec. Gestión (E307)
        27 to emptyList(),        // Optativa (Depende de cuál se elija)
        28 to emptyList()         // PPS (No requiere materias específicas, sino CANTIDAD, mapeado abajo)
    )
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),         // Algoritmos y Prog I
        1 to emptyList(),         // Matemática A
        2 to emptyList(),         // Gestión de las organizaciones
        3 to listOf(0),           // Algoritmos II <- Algoritmos I (I101)
        4 to listOf(1),           // Matemática B <- Matemática A (X102)
        5 to listOf(1, 2),        // Economía y Medición <- Mat A (X102), Gestión Org (E103)
        6 to listOf(3),           // Taller de lenguajes <- Algoritmos II (I104)
        7 to listOf(3),           // Intro Base de Datos <- Algoritmos II (I104)
        8 to listOf(5),           // Contabilidad <- Economía y Medición (E106)
        9 to listOf(4),           // Matemática C <- Matemática B (X105)
        10 to listOf(7),          // Base de Datos <- Intro Base de Datos (I202)
        11 to listOf(8),          // Procesos de negocio <- Contabilidad (E203)
        12 to listOf(9),          // Matemática D <- Matemática C (X204)
        13 to emptyList(),        // Inglés
        14 to listOf(3, 13),      // Fundamentos Arq. <- Algoritmos II (I104), Inglés (0208)
        15 to listOf(6, 13),      // Ing. de Software <- Taller lenguajes (I201), Inglés (0208)
        16 to listOf(4, 8, 13),   // Costos <- Mat B (X105), Contabilidad (E203), Inglés (0208)
        17 to listOf(4, 8, 13),   // Gestión de personas <- Mat B (X105), Contabilidad (E203), Inglés (0208)
        18 to listOf(12, 13),     // Visualización Datos <- Mat D (X207), Inglés (0208)
        19 to listOf(6, 12, 13),  // Minería de Datos <- Taller leng. (I201), Mat D (X207), Inglés (0208)
        20 to listOf(9, 11, 13),  // Tecnologías para Gestión <- Mat C (X204), Procesos (E206), Inglés (0208)
        21 to listOf(6, 12, 13),  // Big Data <- Taller leng. (I201), Mat D (X207), Inglés (0208)
        22 to listOf(12, 16),     // Finanzas empresas <- Mat D (X207), Costos (E303)
        23 to listOf(12, 20, 13), // Estrategia de tec. <- Mat D (X207), Tecnologías Gestión (E307), Inglés (0208)
        24 to listOf(11, 12, 13, 17), // Marketing <- Procesos (E206), Mat D (X207), Inglés (0208), Gestión pers. (E304)
        25 to listOf(19),         // Aplicaciones Int. Datos <- Minería de Datos (I306)
        26 to listOf(12, 16, 17, 20), // Dirección gral <- Mat D (X207), Costos (E303), Gestión pers. (E304), Tec. Gestión (E307)
        27 to emptyList(),        // Optativa (Depende de cuál se elija)
        28 to emptyList()         // PPS (No requiere materias específicas, sino CANTIDAD, mapeado abajo)
    )

    // --- REGLAS ESPECIALES POR CANTIDAD ---
    // La Práctica Profesional Supervisada (PPS) requiere 13 materias aprobadas
    override val cantidadDeAprobadasParaCursar = mapOf(
        28 to 13 // Para cursar PPS (índice 28) se necesitan 13 aprobadas
    )

    // Por lógica, para dar el final/aprobarla definitivamente también necesita esas 13 materias
    override val cantidadDeAprobadasParaFinal = mapOf(
        28 to 13
    )

    override val reglasDeCorrelatividadesCursadaConFinal = emptyMap<Int, List<Int>>()
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(0),
        7 to listOf(0),
        8 to listOf(1,2),
        9 to listOf(1),
        10 to listOf(3),
        11 to listOf(5),
        12 to listOf(4),
        13 to emptyList(),
        14 to listOf(0),
        15 to listOf(3),
        16 to listOf(1,5),
        17 to listOf(1,5),
        18 to listOf(9),
        19 to listOf(3,9),
        20 to listOf(4,8),
        21 to listOf(3,9),
        22 to listOf(4,8,9,13),
        23 to listOf(9,11,13),
        24 to listOf(4,8,9,13),
        25 to listOf(6,12,13,),
        26 to listOf(4,8,9,11,13,),
        27 to emptyList(),
        28 to emptyList()
    )
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}