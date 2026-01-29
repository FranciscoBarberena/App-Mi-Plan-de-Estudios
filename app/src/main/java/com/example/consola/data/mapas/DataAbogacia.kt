package com.example.consola.data.mapas

object DataAbogacia: _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Introducción al Estudio de las Ciencias Sociales", //0
        "Introducción al Derecho",//1
        "Historia Constitucional",//2
        "Introducción a la Sociología",//3
        "Introducción al Pensamiento Científico",//4
        "Derecho Romano",//5
        "Derecho Político",//6
        "Taller de lecto-comprensión en Idioma I",//7
        "Taller de lecto-comprensión en Idioma II",//8
        "Derecho Privado I (Civil)",//9
        "Derecho Privado II (Civil)",//10
        "Derecho Penal I",//11
        "Derecho Constitucional",//12
        "Derecho Humanos",//13
        "Teoría del Conflicto",//14
        "Derecho Privado IV (Comercial)",//15
        "Derecho Privado III (Civil)",//16
        "Derecho Procesal I",//17
        "Economía Política",//18
        "Derecho Penal II",//19
        "Derecho Público, Provincial y Municipal",//20
        "Derecho Internacional Público",//21
        "Derecho Administrativo I",//22
        "Derecho Privado VI (Comercial)",//23
        "Derecho Privado V (Civil)",//24
        "Derecho Procesal II",//25
        "Derecho Social del Trabajo",//26
        "Mediación y Medios de Resolución de Conflictos",//27
        "Derecho Agrario",//28
        "Filosofía del Derecho",//29
        "Seminario", //30
        "Derecho Administrativo II",//31
        "Derecho de Familia",//32
        "Derecho de la Navegación",//33
        "Derecho Colectivo del Trabajo y Seg. Social",//34
        "Derecho de Minería y Energía",//35
        "Sociología Jurídica",//36
        "Derecho Internacional Privado",//37
        "Derecho de las Sucesiones",//38
        "Derecho Notarial y Registral",//39
        "Finanzas y Derecho Financiero",//40
        "Práctica Supervisada Pre-profesional",//41
        "Adaptaciones Profesionales Penales",//42
        "Adaptaciones Profesionales Civiles"//43
    )
    // Requisito: Regularizada para Cursar
    // Regla: "Para la cursada de una se necesita la cursada de la anterior"
    override val reglasDeCorrelatividadesCursadaConCursada = null
    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to listOf(0),
        2 to listOf(0),
        3 to listOf(0),
        4 to listOf(0),
        5 to listOf(0),
        6 to listOf(2,3),
        7 to (0..6).toList(),
        8 to (0..6).toList(),
        9 to listOf(1,5),
        10 to listOf(9,14),
        11 to listOf(9,12),
        12 to listOf(1,6),
        13 to listOf(12),
        14 to listOf(3,4),
        15 to listOf(16),
        16 to listOf(10,12),
        17 to listOf(19,20),
        18 to listOf(10,13),
        19 to listOf(11,13),
        20 to listOf(12),
        21 to listOf(12),
        22 to listOf(17,24),
        23 to listOf(15),
        24 to listOf(16),
        25 to listOf(15,17,24),
        26 to listOf(15),
        27 to listOf(25),
        28 to listOf(22),
        29 to listOf(17),
        30 to emptyList(),
        31 to listOf(22,25),
        32 to listOf(24),
        33 to listOf(23),
        34 to listOf(26),
        35 to listOf(22),
        36 to listOf(29,32),
        37 to listOf(23,38),
        38 to listOf(32),
        39 to listOf(23,38),
        40 to listOf(18,31),
        41 to (0..6).toList(),
        42 to listOf(17),
        43 to listOf(25)






    )
    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesFinalConCursada

    override val reglasDeCorrelatividadesCursadaConFinal = null
    override val cantidadDeAprobadasParaCursar = mapOf(
        30 to 20
    )
    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}