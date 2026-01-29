package com.example.consola.data.mapas

object DataMedicina: _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Anatomía", //0
        "Biología",//1
        "Ciencias Sociales y Medicina",//2
        "Citología, Histología y Embriología",//3
        "Informática Básica",//4
        "Bioquímica y Biología Molecular",//5
        "Epidemiología", //6
        "Fisiología y Física Biológica",//7
        "Psicología Médica",//8
        "Farmacología Básica",//9
        "Informatica Médica",//10
        "Microbiología y Parasitología",//11
        "Patología",//12
        "Salud y Medicina Comunitaria",//13
        "Semiología",//14
        "Inglés Médico",//15
        "Cirugía I",//16
        "Dermatología",//17
        "Diagnóstico y Terapéutica por Imágenes Módulo 1",//18
        "Farmacología Aplicada",//19
        "Infectología",//20
        "Medicina Interna I",//21
        "Neurología",//22
        "Oftalmología",//23
        "Ortopedia y Traumatología",//24
        "Otorrinolaringología",//25
        "Psiquiatría Módulo 1",//26
        "Salud Pública Módulo 1",//27
        "Urología",//28
        "Cirugía II",//29
        "Deontología Médica y Medicina Legal",//30
        "Diagnóstico y Terapéutica por Imágenes Módulo 2",//31
        "Ginecología",//32
        "Medicina Interna II",//33
        "Obstetricia",//34
        "Pediatría",//35
        "Psiquiatría Módulo 2",//36
        "Salud Pública Módulo 2",//37
        "Terapia Intensiva",//38
        "Toxicología",//39
        "Práctica Final Obligatoria"//40
    )
    // Requisito: Regularizada para Cursar
    // Regla: "Para la cursada de una se necesita la cursada de la anterior"
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(3),
        6 to listOf(2),
        7 to listOf(0,1),
        8 to listOf(0),
        9 to emptyList(),
        10 to emptyList(),
        11 to emptyList(),
        12 to listOf(1),
        13 to listOf(6),
        14 to emptyList(),
        15 to emptyList(),
        16 to listOf(9),
        17 to listOf(12,14),
        18 to listOf(12,14),
        19 to listOf(13),
        20 to listOf(9,11),
        21 to listOf(9,11),
        22 to listOf(12,14),
        23 to listOf(0),
        24 to listOf(12,14),
        25 to listOf(12,14),
        26 to listOf(8,9),
        27 to listOf(17),
        28 to listOf(12,14),
        29 to listOf(16),
        30 to listOf(12,14),
        31 to listOf(18),
        32 to listOf(16,19,20),
        33 to listOf(9,11),
        34 to listOf(16,19,20),
        35 to listOf(9,20),
        36 to listOf(26),
        37 to listOf(27),
        38 to listOf(9,14,16),
        39 to listOf(12,14),
        40 to emptyList(), //?? ES LA PRACTICA FINAL
    )
    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(1),
        6 to emptyList(),
        7 to listOf(3),
        8 to emptyList(),
        9 to listOf(5,7),
        10 to listOf(4),
        11 to listOf(5,7),
        12 to listOf(0,7),
        13 to emptyList(),
        14 to listOf(0,5,7),
        15 to listOf(0,2,7),
        16 to listOf(12,14),
        17 to listOf(12,14),
        18 to emptyList(),
        19 to listOf(12,14),
        20 to listOf(12,14),
        21 to listOf(12,14),
        22 to emptyList(),
        23 to listOf(5,7),
        24 to emptyList(),
        25 to emptyList(),
        26 to emptyList(),
        27 to emptyList(),
        28 to emptyList(),
        29 to emptyList(),
        30 to emptyList(),
        31 to emptyList(),
        32 to emptyList(),
        33 to emptyList(),
        34 to emptyList(),
        35 to emptyList(),
        36 to emptyList(),
        37 to emptyList(),
        38 to emptyList(),
        39 to emptyList(),
        40 to emptyList(),

    )
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(1),
        6 to listOf(2),
        7 to listOf(1),
        8 to listOf(0),
        9 to listOf(5,7),
        10 to listOf(4),
        11 to listOf(5,7),
        12 to listOf(0,7),
        13 to listOf(6),
        14 to listOf(0,5,7),
        15 to listOf(0,2,7),
        16 to listOf(12,14),
        17 to listOf(12,14),
        18 to emptyList(),
        19 to listOf(12,14),
        20 to listOf(11,12,14),
        21 to listOf(12,14),
        22 to listOf(12,14),
        23 to listOf(5,7),
        24 to listOf(12,14),
        25 to listOf(12,14),
        26 to emptyList(),
        27 to emptyList(),
        28 to listOf(12,14),
        29  to listOf(16),
        30 to listOf(12,14),
        31 to listOf(12,14),
        32 to listOf(12,14,16),
        33 to listOf(12,14),
        34 to listOf(9,11,12),
        35 to listOf(20),
        36 to listOf(9,11,12),
        37 to listOf(13),
        38 to emptyList(),
        39 to listOf(12,14),
        40 to emptyList()
        )

    override val reglasDeCorrelatividadesCursadaConFinal = reglasDeCorrelatividadesCursadaConCursada
    override val cantidadDeAprobadasParaCursar = emptyMap<Int,Int>()
    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}