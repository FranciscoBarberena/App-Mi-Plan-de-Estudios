package com.example.consola.data.mapas

object DataEconomiaPlanVIII : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática Inicial y Técnicas de Estudio y Comunicación", //0
        "Introducción a la Economía y Estructura Económica Argentina", //1
        "Contabilidad I", //2
        "Administración I", //3
        "Microeconomía I", //4
        "Matemática I", //5
        "Laboratorio de Datos", //6
        "Historia Económica Mundial y Argentina", //7
        "Macroeconomía I", //8
        "Matemática para Economistas I", //9
        "Interpretación de los Estados Contables", //10
        "Matemática para Economistas II", //11
        "Estadística para Economistas", //12
        "Finanzas Públicas", //13
        "Comportamiento Estratégico", //14
        "Microeconomía II", //15
        "Econometría I", //16
        "Estructura Social Argentina", //17
        "Cálculo Financiero", //18
        "Economía Espacial y Ambiental", //19
        "Historia del Pensamiento Económico", //20
        "Macroeconomía II", //21
        "Econometría II", //22
        "Organización Industrial", //23
        "Mercado de Capitales", //24
        "Economía Laboral", //25
        "Desarrollo Económico", //26
        "Moneda, Crédito y Bancos", //27
        "Comercio Internacional", //28
        "Economía de las Instituciones y el Comportamiento", //29
        "Finanzas de Empresas", //30
        "Finanzas Internacionales", //31
        "Economía del Sector Público", //32
        "Política Económica", //33
        "Economía de los Ciclos y las Crisis", //34
        "Optativa 1", //35
        "Optativa 2", //36
        "Optativa 3", //37
        "Optativa 4" //38
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to (1..3).toList(),
        5 to (1..3).toList(),
        6 to emptyList()//LABORATORIO DE DATOS (NO ENCONTRE CORRELATIVAS),



    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = null

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(1),
        5 to listOf(1),
        6 to emptyList()//LABORATORIO DE DATOS (NO ENCONTRE CORRELATIVAS),


    )
    //Cursada aprobada para final
    override val reglasDeCorrelatividadesCursadaConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to listOf(2,3),
        5 to listOf(2,3),
        6 to emptyList()//LABORATORIO DE DATOS (NO ENCONTRE CORRELATIVAS),

    )
    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()

    override val cantidadDeAprobadasParaFinal = emptyMap<Int,Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()

}