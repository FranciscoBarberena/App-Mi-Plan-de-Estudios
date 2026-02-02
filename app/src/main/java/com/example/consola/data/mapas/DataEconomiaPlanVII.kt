package com.example.consola.data.mapas

object DataEconomiaPlanVII : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(

        "Introducción a la Economía y Estructura Económica Argentina", //0
        "Contabilidad I", //1
        "Administración I", //2
        "Microeconomía I", //3
        "Matemática I", //4
        "Derecho Constitucional y Administrativo", //5
        "Introducción a las Ciencias Sociales y al Conocimiento Científico", //6
        "Macroeconomía I", //7
        "Matemática para Economistas I", //8
        "Historia Económica y Social I", //9
        "Finanzas Públicas",//10
        "Estadística para Economistas I", //11
        "Matemática para Economistas II", //12
        "Historia Económica y Social II", //13
        "Microeconomía II", //14
        "Estadística para Economistas II", //15
        "Estructura Social Argentina", //16
        "Macroeconomía II", //17
        "Econometría I", //18
        "Historia del Pensamiento Económico", //19
        "Moneda, Crédito y Bancos", //20
        "Economía Internacional", //21
        "Econometría II", //22
        "Economía de los Ciclos y las Crisis", //23
        "Economía de la Empresa y de la Organización Industrial", //24
        "Economía del Sector Público", //25
        "Desarrollo Económico", //26
        "Finanzas Internacionales", //27
        "Política Económica I", //28
        "Política Económica II", //29
        "Optativa 1", //30
        "Optativa 2", //31
        "Optativa 3", //32
        "Optativa 4", //33
        "Optativa 5" //34
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to (1..3).toList(),
        4 to (1..3).toList(),
        5 to listOf(2),
        6 to listOf(1),
        7 to (0..2).toList(),
        8 to listOf(0,1,2,4),
        9 to listOf(1,2),
        10 to listOf(1,2),
        11 to listOf(0,1,2,4),
        12 to listOf(0,1,2,4),
        13 to listOf(1),
        14 to listOf(8),
        15 to listOf(11),
        16 to listOf(11),
        17 to listOf(7),
        18 to listOf(11),
        19 to emptyList(),





    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0,1),
        6 to listOf(0,2),
        7 to emptyList(),
        8 to emptyList(),
        9 to listOf(0),
        10 to listOf(0,3),
        11 to emptyList(),
        12 to emptyList(),
        13 to listOf(0,2,6),
        14 to listOf(0,1,2,3,4,5,6),
        15 to (0..6).toList(),
        16 to (0..6).toList(),
        17 to (0..6).toList(),
        18 to (0..6).toList(),
        19 to (0..6).toList() + listOf(13),

    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(1),
        4 to listOf(1),
        5 to listOf(0,1),
        6 to listOf(0,2),
        7 to listOf(0),
        8 to listOf(0,4),
        9 to listOf(0),
        10 to listOf(0,3),
        11 to listOf(0,4),
        12 to listOf(0,4),
        13 to listOf(0,2,6),
        14 to listOf(0,1,2,3,4,5,6,8),
        15 to (0..6).toList() + listOf(11),
        16 to (0..6).toList() + listOf(11),
        17 to (0..7).toList() ,
        18 to (0..6).toList() + listOf(11),
        19 to (0..6).toList() + listOf(13),



    )

    //Cursada aprobada para final
    override val reglasDeCorrelatividadesCursadaConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to listOf(2, 3),
        4 to listOf(2, 3),
        5 to listOf(2),
        6 to listOf(1),
        7 to listOf(1,2),
        8 to listOf(1,2),
        9 to listOf(1,2),
        10 to listOf(1,2),
        11 to listOf(1,2),
        12 to listOf(1,2),
        13 to listOf(1),
        14 to emptyList(),
        15 to emptyList(),
        16 to emptyList(),
        17 to emptyList(),
        18 to emptyList(),
        19 to emptyList(),





    )
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()

    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()

}