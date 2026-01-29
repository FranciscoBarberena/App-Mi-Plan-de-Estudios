package com.example.consola.data.mapas

object DataLicenciaturaEnPsicologia : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Psicología I",                                          // 0
        "Antropología Cultural y Social",                        // 1
        "Lógica",                                                // 2
        "Introducción a la Filosofía",                           // 3
        "Biología Humana",                                       // 4
        "Psicología II",                                         // 5
        "Teoría Psicoanalítica",                                 // 6
        "Sociología General",                                    // 7
        "Psicología Genética",                                   // 8
        "Estadística Aplicada a la Psicología",                  // 9
        "Lingüística General",                                   // 10
        "Neuroanatomía y Neurofisiología",                       // 11
        "Epistemología y Metodología de la Investigación Psicológica",    // 12
        "Fundamentos, Técnicas e Instrumentos de la Exploración Psicológica I",   // 13
        "Corrientes Actuales en Psicología",                     // 14
        "Psicología Evolutiva I",                                // 15
        "Psicología Evolutiva II",                               // 16
        "Psicología Social",                                     // 17
        "Psicopatología I",                                      // 18
        "Psicología Institucional",                              // 19
        "Seminario de Psicología Experimental",                  // 20
        "Psicopatología II",                                     // 21
        "Fundamentos, Técnicas e Instrumentos de la Exploración Psicológica II",  // 22
        "Capacitación en Idioma I",                                // 23
        "Capacitación en Idioma II",//24
        "Psicodiagnóstico",                                      // 24
        "Psicología Educacional",                                // 25
        "Psicoterapia I",                                        // 26
        "Psicoterapia II",                                       // 27
        "Psicología Preventiva",                                 // 28
        "Taller de Producción Textual",                          // 29
        "Psicología Clínica de Niños y Adolescentes",            // 30
        "Psicología Clínica de Adultos y Gerontes",              // 31
        "Orientación Vocacional",                                // 32
        "Psicología Laboral",                                    // 33
        "Psicología Forense",                                    // 34
        "Trabajo Integrador Final (TIF)"                         // 35
    )

    // Requisito: Regularizada (Cursada aprobada) para Cursar la materia Key
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),          // Psico II -> Psico I
        6 to listOf(0),          // Teo Psico -> Psico I
        7 to emptyList(),        // Sociología -> (Solo pide final de Antropología para rendir)
        8 to listOf(0),          // Psico Genética -> Psico I
        9 to emptyList(),
        10 to listOf(2),         // Lingüística -> Lógica
        11 to listOf(4),         // Neuro -> Biología Humana
        12 to listOf(2, 5, 6),   // Epistemología -> Lógica, Psico II, Teo Psico
        13 to listOf(2, 5, 9, 6),// Fundamentos I -> Lógica, Psico II, Estad., Teo Psico
        14 to listOf(5, 10),     // Corrientes -> Psico II, Lingüística
        15 to listOf(8, 6),      // Evolutiva I -> Genética, Teo Psico
        16 to listOf(15),        // Evolutiva II -> Evolutiva I
        17 to listOf(2, 5, 7, 6),// Social -> Lógica, Psico II, Socio, Teo Psico
        18 to listOf(11, 16),    // Psicopato I -> Neuro, Evol II
        19 to listOf(12, 17),    // Institucional -> Epistemología, Social
        20 to listOf(12, 13),    // Sem Exp -> Epistemología, Fundamentos I
        21 to listOf(11, 15, 16),// Psicopato II -> Neuro, Evol I, Evol II
        22 to listOf(12, 13),    // Fundamentos II -> Epistemología, Fundamentos I
        23 to emptyList(),       // Idioma -> (Pide cantidad de finales)
        24 to emptyList(),
        25 to listOf(18, 21, 22),// Psicodiag -> Psicopato I, Psicopato II, Fund II
        26 to listOf(18, 21, 22, 19), // Educacional -> Psicopato I/II, Fund II, Inst
        27 to listOf(18, 21),    // PsicoTer I -> Psicopato I, Psicopato II
        28 to listOf(18, 21, 19),// PsicoTer II -> Psicopato I, Psicopato II, Inst
        29 to listOf(18, 21, 19),// Preventiva -> Psicopato I, Psicopato II, Inst
        30 to listOf(18, 19, 20, 21, 22, 23), // Taller Textual -> Cursadas de 4to año + Idioma
        31 to listOf(25, 27, 28),// Clinica Niños -> Psicodiag, PsicoTer I y II
        32 to listOf(25, 27, 28),// Clinica Adultos -> Psicodiag, PsicoTer I y II
        33 to listOf(25, 29),    // Orientación -> Psicodiag, Preventiva
        34 to listOf(25, 29),    // Laboral -> Psicodiag, Preventiva
        35 to listOf(25, 29),    // Forense -> Psicodiag, Preventiva
        36 to emptyList()      // //FALTAN LA MITAD DE CURSADAS DE 5TO AÑO)
    )

    // Requisito: Final Aprobado para Cursar la materia Key
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
        12 to listOf(0),         // Epistemología -> Final Psico I
        13 to listOf(0),         // Fundamentos I -> Final Psico I
        14 to listOf(0, 2),      // Corrientes -> Final Psico I, Lógica
        15 to listOf(0),         // Evolutiva I -> Final Psico I
        16 to listOf(0),         // Evolutiva II -> Final Psico I
        17 to listOf(0, 1),      // Social -> Final Psico I, Antropología
        18 to listOf(4, 8, 6),   // Psicopato I -> Biología, Genética, Teo Psico
        19 to listOf(2, 5, 7, 9),// Institucional -> Lógica, Psico II, Socio, Estad.
        20 to listOf(2, 5, 9, 6),// Sem Exp -> Lógica, Psico II, Estad., Teo Psico
        21 to listOf(4, 8, 6),   // Psicopato II -> Biología, Genética, Teo Psico
        22 to listOf(2, 5, 9, 6),// Fundamentos II -> Lógica, Psico II, Estad., Teo Psico
        23 to emptyList(),       // Idioma -> (Regla especial de cantidad)
        24 to emptyList(),
        25 to listOf(11, 16, 13),// Psicodiag -> Neuro, Evol II, Fund I
        26 to listOf(11, 16, 13, 17), // Educacional -> Neuro, Evol II, Fund I, Social
        27 to listOf(11, 16),    // PsicoTer I -> Neuro, Evol II
        28 to listOf(11, 16, 17),// PsicoTer II -> Neuro, Evol II, Social
        29 to listOf(11, 16, 17),// Preventiva -> Neuro, Evol II, Social
        30 to emptyList(),
        31 to listOf(21, 22, 19),// Clinica Niños -> Psicopato II, Fund II, Institucional
        32 to listOf(18, 22, 19),// Clinica Adultos -> Psicopato I, Fund II, Institucional
        33 to listOf(21, 22, 19),// Orientación -> Psicopato II, Fund II, Institucional
        34 to listOf(18, 22, 19),// Laboral -> Psicopato I, Fund II, Institucional
        35 to listOf(21, 22, 19),// Forense -> Psicopato II, Fund II, Institucional
        // TIF: El texto dice "Requisitos: [Lista]". Al ser TIF, se asume que se requieren los Finales para iniciarlo.
        36 to listOf(18, 19, 20, 21, 22, 23)
    )

    // Requisito: Final Aprobado para Aprobar (Rendir) el Final de la materia Key
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),          // Psico II -> Final Psico I
        6 to listOf(0),          // Teo Psico -> Final Psico I
        7 to listOf(1),          // Sociología -> Final Antropología
        8 to listOf(0),          // Psico Genética -> Final Psico I
        9 to emptyList(),
        10 to listOf(2),         // Lingüística -> Final Lógica
        11 to listOf(4),         // Neuro -> Final Biología
        12 to listOf(2, 5, 6),   // Epistemología -> Final Lógica, Psico II, Teo Psico
        13 to listOf(9, 12),     // Fundamentos I -> Final Estad., Epistemología
        14 to listOf(5, 10),     // Corrientes -> Final Psico II, Lingüística
        15 to listOf(8, 6),      // Evolutiva I -> Final Genética, Teo Psico
        16 to listOf(15),        // Evolutiva II -> Final Evolutiva I
        17 to listOf(7, 12),     // Social -> Final Socio, Epistemología
        18 to listOf(11, 16),    // Psicopato I -> Final Neuro, Evol II
        19 to listOf(12, 17),    // Institucional -> Final Epistemología, Social
        20 to listOf(12, 13),    // Sem Exp -> Final Epistemología, Fundamentos I
        21 to listOf(18),        // Psicopato II -> Final Psicopato I
        22 to listOf(12, 13),    // Fundamentos II -> Final Epistemología, Fundamentos I
        23 to emptyList(),
        24 to emptyList(),
        25 to listOf(21, 22),    // Psicodiag -> Final Psicopato II, Fund II
        26 to listOf(22, 19),    // Educacional -> Final Fund II, Institucional
        27 to listOf(21),        // PsicoTer I -> Final Psicopato II
        28 to listOf(21, 19),    // PsicoTer II -> Final Psicopato II, Institucional
        29 to listOf(19),        // Preventiva -> Final Institucional
        30 to listOf(18, 19, 20, 21, 22, 23),
        31 to listOf(25, 27, 28),// Clinica Niños -> Final Psicodiag, PsicoTer I y II
        32 to listOf(25, 27, 28),// Clinica Adultos -> Final Psicodiag, PsicoTer I y II
        33 to listOf(25, 29),    // Orientación -> Final Psicodiag, Preventiva
        34 to listOf(25, 29),    // Laboral -> Final Psicodiag, Preventiva
        35 to listOf(25, 29),    // Forense -> Final Psicodiag, Preventiva
        36 to listOf(18, 19, 20, 21, 22, 23)
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        23 to 12,
        24 to 12
    )

    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar= mapOf(
        36 to 27
    )
    override val cantidadDeCursadasParaFinal= mapOf(
        36 to 27
    )
}