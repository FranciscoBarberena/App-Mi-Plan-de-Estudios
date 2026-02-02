package com.example.consola.data.mapas

object DataMedicinaVeterinaria : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Bioquímica", //0
        "Biofísica", //1
        "Biología Celular y del Desarrollo", //2
        "Embriología y Anatomía Sistémica", //3
        "Bioestadística", //4
        "Fisicoquímica Aplicada a la Fisiología Veterinaria", //5
        "Histología", //6
        "Microbiología I", //7
        "Fisiología", //8
        "Anatomía Veterinaria", //9
        "Microbiología II", //10
        "Inmunobiología Animal Básica", //11
        "Economía General y Sociología", //12
        "Patología General Veterinaria", //13
        "Parasitología", //14
        "Epidemiología y Salud Pública Básica", //15
        "Patología Especial", //16
        "Nutrición Animal y Alimentos", //17
        "Zootecnia General", //18
        "Farmacología General", //19
        "Genética General", //20
        "Semiología", //21
        "Genética de Población y Mejoramiento Animal", //22
        "Inglés Técnico", //23
        "Farmacología Especial y Toxicología", //24
        "Producción de Aves y Pilíferos", //25
        "Infectología, Zoonosis y Enfermedades Exóticas y Emergentes", //26
        "Cirugía General I", //27
        "Producción de Bovinos de Carne", //28
        "Epidemiología y Salud Pública Aplicada", //29
        "Producción Porcina", //30
        "Producción Equina", //31
        "Producción Ovina y Caprina", //32
        "Enfermedades de los Rumiantes y Cerdos", //33
        "Producción de Bovinos de Leche", //34
        "Gestión de Empresa y Economía Agraria", //35
        "Enfermedades de los Caninos y Felinos Domésticos", //36
        "Tecnología Aplicada a los Productos Alimenticios", //37
        "Enfermedades de las Aves y los Pilíferos", //38
        "Enfermedades de los Equinos", //39
        "Teriogenología", //40
        "Bromatología, Higiene e Inspección de Productos Alimenticios", //41
        "Análisis Clínicos Veterinarios", //42
        "Inmunobiología Animal Aplicada", //43
        "Métodos Complementarios de Diagnóstico", //44
        "Introducción a la Ciencia de los Animales de Laboratorio", //45
        "Biotecnología de la Reproducción", //46
        "Cirugía II y Anestesiología", //47
        "Clínica de Equinos", //48
        "Clínica y Sanidad de los Cerdos", //49
        "Clínica de Caninos y Felinos", //50
        "Clínica y Sanidad de los Rumiantes", //51
        "Bienestar Animal", //52
        "Ética y Legislación Veterinaria", //53
        "Electivo I", //54
        "Electivo II", //55
        "Electivo III", //56
        "Prácticas Pre-Profesionales" //57
    )

    //CORRELATIVIDADES

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0, 1),
        6 to listOf(2),
        7 to listOf(0, 2),
        8 to listOf(3, 5, 6),
        9 to listOf(3),
        10 to listOf(6, 7),
        11 to listOf(0, 6, 7),
        12 to listOf(4),
        13 to listOf(3, 5, 6, 11),
        14 to listOf(3, 4, 6, 7),
        15 to listOf(4),
        16 to listOf(8, 9, 10, 13, 14),
        17 to listOf(8, 9, 12, 14),
        18 to listOf(8, 9, 12),
        19 to listOf(8, 9, 13),
        20 to listOf(13),
        21 to listOf(8, 9, 13),
        22 to listOf(18, 20),
        23 to emptyList(), //Inglés
        24 to listOf(10, 14, 19),
        25 to listOf(17, 22),
        26 to listOf(16, 21, 24),
        27 to (0..15).toList(),
        28 to listOf(22) + (16..19).toList(),
        29 to listOf(16, 18, 21, 24),
        30 to listOf(21, 22) + (16..19).toList(),
        31 to listOf(16, 18, 21, 24),
        32 to listOf(21, 18, 17, 16, 19, 22),
        33 to listOf(18, 17, 21, 24, 26, 28, 29),
        34 to listOf(21, 18, 17, 16, 19, 22),
        35 to listOf(17, 18, 22),
        36 to (0..24).toList(),
        37 to listOf(26, 33, 29, 28, 34, 25),
        38 to listOf(25, 26),
        39 to listOf(31),
        40 to listOf(26, 29, 28, 34, 30, 32, 33),
        41 to listOf(37),
        42 to listOf(33, 39, 36),
        43 to listOf(33, 38, 39, 36, 29, 26),
        44 to listOf(39, 36),
        45 to listOf(26),
        46 to listOf(40),
        47 to listOf(33, 39, 36, 40),
        48 to listOf(39, 44, 42, 43, 46, 47, 40),
        49 to listOf(42, 43, 46, 40),
        50 to listOf(36, 44, 42, 40),
        51 to listOf(33, 42, 43, 40),
        52 to (0..25).toList(),
        53 to listOf(41),
        54 to emptyList(),
        55 to emptyList(),
        56 to emptyList(),
        57 to listOf(48, 49, 50, 51, 41, 46)
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to emptyList(),
        7 to emptyList(),
        8 to emptyList(),
        9 to emptyList(),
        10 to emptyList(),
        11 to emptyList(),
        12 to emptyList(),
        13 to emptyList(),
        14 to emptyList(),
        15 to emptyList(),
        16 to (0..7).toList(),
        17 to (0..7).toList(),
        18 to (0..7).toList(),
        19 to (0..7).toList(),
        20 to (0..7).toList(),
        21 to (0..7).toList(),
        22 to (0..7).toList(),
        23 to emptyList(), //Inglés
        24 to (0..7).toList(),
        25 to (8..15).toList(),
        26 to (8..15).toList(),
        27 to (8..15).toList(),
        28 to (8..15).toList(),
        29 to (8..15).toList(),
        30 to (8..15).toList(),
        31 to (8..15).toList(),
        32 to (8..15).toList(),
        33 to (8..15).toList(),
        34 to (8..15).toList(),
        35 to (8..15).toList(),
        36 to (16..24).toList(),
        37 to (16..24).toList(),
        38 to (16..24).toList(),
        39 to (16..24).toList(),
        40 to (16..24).toList(),
        41 to (16..24).toList(),
        42 to (16..24).toList(),
        43 to (16..24).toList(),
        44 to (16..24).toList(),
        45 to (16..24).toList(),
        46 to (16..24).toList(),
        47 to (16..24).toList(),
        48 to (25..35).toList(),
        49 to (25..35).toList(),
        50 to (25..35).toList(),
        51 to (25..35).toList(),
        52 to (25..35).toList(),
        53 to (25..35).toList(),
        54 to (25..35).toList(),
        55 to (25..35).toList(),
        56 to (25..35).toList(),
        57 to (25..35).toList()
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesFinalConCursada

    override val reglasDeCorrelatividadesCursadaConFinal = reglasDeCorrelatividadesCursadaConCursada


    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()


    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}