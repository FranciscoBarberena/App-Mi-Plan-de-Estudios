package com.example.consola.data.mapas

object DataProfesoradoEnDisenoComunicacionVisual : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Diseño en comunicación visual I",         // 0  (V0001)
        "Lenguaje visual I",                       // 1  (H0003)
        "Tecnología y materiales I",               // 2  (V0002)
        "Dibujo I",                                // 3  (V0003)
        "Tipografía",                              // 4  (V0024)
        "Panorama histórico y social del diseño",  // 5  (H0053)
        "Diseño en comunicación visual II",        // 6  (V0004)
        "Lenguaje visual II",                      // 7  (H0037)
        "Tecnología y materiales II",              // 8  (V0005)
        "Dibujo II",                               // 9  (V0006)
        "Recursos digitales",                      // 10 (V0010)
        "Optativa I",                              // 11 (V0025)
        "Diseño en comunicación visual III",       // 12 (V0008)
        "Lenguaje visual III",                     // 13 (H0040)
        "Tecnología y materiales III",             // 14 (V0013)
        "Teoría y metodología del diseño",         // 15 (V0011)
        "Mercadotecnia aplicada",                  // 16 (V0017)
        "Textos y escritura",                      // 17 (H0103)
        "Optativa II",                             // 18 (V0026)
        "Diseño en comunicación visual IV",        // 19 (V0012)
        "Estudios sobre diseño",                   // 20 (V0015)
        "Innovación y gestión",                    // 21 (V0023)
        "Historia del diseño en com. visual",      // 22 (V0027)
        "Estética",                                // 23 (H0104)
        "Diseño audiovisual",                      // 24 (V0009)
        "Fundamentos pedagógicos de la educación", //25 !!!!
        "Diseño en comunicación visual V",         // 25 (V0016)
        "Legislación y práctica profesional",      // 26 (H0056)
        "Historia y cultura visual de Arg. y Lat.",// 27 (V0030)
        "Optativa III",                            // 28 (V0028)
        "Optativa IV"  ,                            // 29 (V0029)
        "Didáctica especial y práctica de la enseñanza"
    )

    // Columna: "CORRELATIVAS PARA CURSAR" -> Subcolumna "CURSADA"
    // Requisito: Tener la cursada (regularizada) de estas materias para CURSAR la actual.
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(2, 4),        // DCV II -> Tecno I, Tipografía
        7 to emptyList(),
        8 to listOf(2),           // Tecno II -> Tecno I
        9 to emptyList(),
        10 to listOf(2, 4),       // Rec. Digitales -> Tecno I, Tipografía
        11 to emptyList(),
        12 to listOf(8),          // DCV III -> Tecno II
        13 to emptyList(),
        14 to listOf(8),          // Tecno III -> Tecno II
        15 to listOf(5),          // Teoría -> Panorama
        16 to listOf(8),          // Mercadotecnia -> Tecno II
        17 to listOf(5),          // Textos -> Panorama
        18 to emptyList(),
        19 to listOf(14),         // DCV IV -> Tecno III
        20 to emptyList(),
        21 to emptyList(),
        22 to emptyList(),
        23 to emptyList(),
        24 to emptyList(),
        25 to emptyList(),
        26 to listOf(21),         // DCV V -> Innovación
        27 to emptyList(),
        28 to listOf(15, 22, 23), // Hist Arg -> Teoría, Hist DCV, Estética
        29 to emptyList(),
        30 to emptyList(),
        31 to listOf(25)
    )



    // Columna: "CORRELATIVAS PARA APROBAR" -> Subcolumna "CURSADA"
    // Requisito: Tener la cursada (regularizada) de estas materias para RENDIR el final de la actual.
    // Nota: La mayoría están vacías, pero V0030 (Hist Arg) tiene requisitos aquí.
    override val reglasDeCorrelatividadesCursadaConFinal = reglasDeCorrelatividadesCursadaConCursada

    // Columna: "CORRELATIVAS PARA CURSAR" -> Subcolumna "APROBADA"
    // Requisito: Tener el FINAL aprobado de estas materias para CURSAR la actual.
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(0, 1),             // DCV II -> Final DCV I, Lenguaje I
        7 to listOf(1),                // Lenguaje II -> Final Lenguaje I
        8 to listOf(0),                // Tecno II -> Final DCV I
        9 to listOf(3),                // Dibujo II -> Final Dibujo I
        10 to listOf(0),               // Rec. Digitales -> Final DCV I
        11 to listOf(0, 1),            // Optativa I -> Final DCV I, Lenguaje I
        12 to listOf(2, 3, 6, 7, 10),  // DCV III -> Final Tecno I, Dib I, DCV II, Leng II, Rec Dig
        13 to listOf(0, 4, 7),         // Lenguaje III -> Final DCV I, Tipografía, Leng II
        14 to listOf(2, 6, 10),        // Tecno III -> Final Tecno I, DCV II, Rec Dig
        15 to listOf(6),               // Teoría -> Final DCV II
        16 to listOf(6),               // Mercadotecnia -> Final DCV II
        17 to listOf(7),               // Textos -> Final Lenguaje II
        18 to listOf(6, 11),           // Optativa II -> Final DCV II, Optativa I
        19 to listOf(9, 12, 13),       // DCV IV -> Final Dib II, DCV III, Leng III
        20 to listOf(10, 17),          // Estudios -> Final Rec Dig, Textos
        21 to listOf(6, 8, 17),        // Innovación -> Final DCV II, Tecno II, Textos
        22 to listOf(5, 6),            // Hist DCV -> Final Panorama, DCV II
        23 to listOf(5, 6, 7),         // Estética -> Final Panorama, DCV II, Leng II
        24 to listOf(6, 8, 10),        // Audiovisual -> Final DCV II, Tecno II, Rec Dig
        25 to listOf(12,17),
        26 to listOf(15, 16, 19),      // DCV V -> Final Teoría, Mercadotecnia, DCV IV
        27 to listOf(12, 14),          // Legislación -> Final DCV III, Tecno III
        28 to listOf(5, 17),           // Hist Arg -> Final Panorama, Textos
        29 to listOf(12, 15, 18),      // Optativa III -> Final DCV III, Teoría, Optativa II
        30 to listOf(12, 15, 18) ,      // Optativa IV -> Final DCV III, Teoría, Optativa II
        31 to listOf(19,22)
    )

    // Columna: "CORRELATIVAS PARA APROBAR" -> Subcolumna "APROBADA"
    // Requisito: Tener el FINAL aprobado de estas materias para RENDIR (Aprobar final) de la actual.
    override val reglasDeCorrelatividadesFinalConFinal = reglasDeCorrelatividadesFinalConCursada + mapOf(
        8 to (reglasDeCorrelatividadesFinalConCursada[8]?.plus(listOf(2)) ?: emptyList()),
        14 to (reglasDeCorrelatividadesFinalConCursada[14]?.plus(listOf(8)) ?: emptyList()),
        15 to (reglasDeCorrelatividadesFinalConCursada[15]?.plus(listOf(5,6)) ?: emptyList()),
        22 to (reglasDeCorrelatividadesFinalConCursada[22]?.plus(listOf(5,6)) ?: emptyList()),
        23 to (reglasDeCorrelatividadesFinalConCursada[23]?.plus(listOf(5,6,7)) ?: emptyList()),
        25 to (reglasDeCorrelatividadesFinalConCursada[25]?.plus(listOf(12,17)) ?: emptyList()),
        27 to (reglasDeCorrelatividadesFinalConCursada[27]?.plus(listOf(12,14)) ?: emptyList()),
        28 to (reglasDeCorrelatividadesFinalConCursada[28]?.plus(listOf(5,17)) ?: emptyList()),
    )

    override val cantidadDeAprobadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()
}