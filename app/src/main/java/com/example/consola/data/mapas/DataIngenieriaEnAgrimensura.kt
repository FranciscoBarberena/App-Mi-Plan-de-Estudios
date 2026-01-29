package com.example.consola.data.mapas

object DataIngenieriaEnAgrimensura : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Matemática para Ingeniería",              // 0 (D1001)
        "Representación Gráfica",                  // 1 (C1102)
        "Matemática A",                            // 2 (F1301)
        "Dibujo Topográfico",                      // 3 (G1401)
        "Introducción a la Agrimensura y el Derecho", // 4 (G1402)
        "Matemática B",                            // 5 (F1302)
        "Física I",                                // 6 (F1303)
        "Química para Ingeniería",                 // 7 (U1901)
        "Matemática C",                            // 8 (F1304)
        "Física II",                               // 9 (F1305)
        "Geomorfología",                           // 10 (G1403)
        "Fundamentos de Instrumental",             // 11 (G1404)
        "Probabilidades y Estadística",            // 12 (F1315)
        "Agrimensura Legal I",                     // 13 (G1405)
        "Elementos de Construcciones Civiles",     // 14 (G1406)
        "Topografía I",                            // 15 (G1407)
        "Instrumental y Técnicas Especiales",      // 16 (G1409)
        "Topografía II",                           // 17 (G1410)
        "Gestión Ambiental",                       // 18 (H1508)
        "Introducción a la Programación y Análisis Numérico", // 19 (F1316)
        "Electiva Humanística",                    // 20
        "Fotogrametría I",                         // 21 (G1411)
        "Geodesia I",                              // 22 (G1412)
        "Topografía Aplicada",                     // 23 (G1413)
        "Organización de Empresas y Evaluación de Proyectos", // 24 (P1762)
        "Actividades de Formación Complementaria I", // 25 (AFC 1)
        "Cálculo de Compensación",                 // 26 (G1408)
        "Agrimensura Legal II",                    // 27 (G1414)
        "Geodesia II",                             // 28 (G1416)
        "Fotointerpretación",                      // 29 (G1417)
        "Actividades de Formación Complementaria II", // 30 (AFC 2)
        "Cartografía",                             // 31 (G1418)
        "Catastro Parcelario",                     // 32 (G1419)
        "Percepción Remota",                       // 33 (G1420)
        "Ingeniería de Levantamientos",            // 34 (G1421)
        "Actividades de Formación Complementaria III", // 35 (AFC 3)
        "Agrimensura Aplicada a Obras De Desarrollo Lineal", // 36 (G1422)
        "Valuaciones",                             // 37 (G1423)
        "Planeamiento Territorial",                // 38 (G1424)
        "Sistema de Información Geográfica",       // 39 (G1425)
        "Higiene, Seguridad y Desarrollo Sustentable", // 40 (M1681)
        "Actividades de Formación Complementaria IV", // 41 (AFC 4)
        "Catastro Económico y Administración Territorial", // 42 (G1426)
        "Ejercicio Profesional y Mensuras",        // 43 (G1427)
        "Hidrografía",                             // 44 (G1428)
        "Trabajo Final",                           // 45 (G1429)
        "Práctica Profesional Supervisada",        // 46 (G1430)
        "Agrología e Información Rural",           // 47 (G1433)
        "Actividades de Formación Complementaria V", // 48 (AFC 5)
        "Inglés",                                  // 49 (M0001)
        "Optativa 1",                              // 50
        "Optativa 2"                               // 51
    )

    // Requisito: Regularizada para Cursar
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(2),         // Mat B -> Mat A (Reg)
        6 to listOf(2),         // Fis I -> Mat A (Reg)
        7 to emptyList(),
        8 to listOf(5),         // Mat C -> Mat B (Reg)
        9 to listOf(5, 6),      // Fis II -> Mat B, Fis I (Reg)
        10 to listOf(3),        // Geomorf -> Dib Topo (Reg)
        11 to listOf(5, 3),     // Fund Instr -> Mat B, Dib Topo (Reg)
        12 to listOf(5),        // Prob -> Mat B (Reg)
        13 to listOf(3, 4),     // Agr Leg I -> Dib Topo, Intro Agr (Reg)
        14 to listOf(11),       // Elem Const -> Fund Instr (Reg)
        15 to listOf(1, 11),    // Topo I -> Rep Graf, Fund Instr (Reg)
        16 to listOf(9, 15),    // Instr Esp -> Fis II, Topo I (Reg)
        17 to listOf(10, 15),   // Topo II -> Geomorf, Topo I (Reg)
        18 to listOf(10, 13),   // Gest Amb -> Geomorf, Agr Leg I (Reg)
        19 to listOf(8),        // Intro Prog -> Mat C (Reg)
        20 to emptyList(),
        21 to listOf(9, 17),    // Foto I -> Fis II, Topo II (Reg)
        22 to listOf(8, 17),    // Geod I -> Mat C, Topo II (Reg)
        23 to listOf(14, 17),   // Topo Ap -> Elem Const, Topo II (Reg)
        24 to listOf(13),       // Org Emp -> Agr Leg I (Reg)
        25 to emptyList(),
        26 to listOf(12, 19, 17), // Calc Comp -> Prob, Intro Prog, Topo II (Reg)
        27 to listOf(13, 17),   // Agr Leg II -> Agr Leg I, Topo II (Reg)
        28 to listOf(16, 22),   // Geod II -> Instr Esp, Geod I (Reg)
        29 to listOf(21),       // Fotoint -> Foto I (Reg)
        30 to listOf(25),       // AFC 2 -> AFC 1
        31 to listOf(21, 28),   // Carto -> Foto I, Geod II (Reg)
        32 to listOf(21, 27),   // Catastro P -> Foto I, Agr Leg II (Reg)
        33 to listOf(29),       // Perc Rem -> Fotoint (Reg)
        34 to listOf(23, 28),   // Ing Lev -> Topo Ap, Geod II (Reg)
        35 to listOf(30),       // AFC 3 -> AFC 2
        36 to listOf(23),       // Agr Obras -> Topo Ap (Reg)
        37 to listOf(14, 32),   // Val -> Elem Const, Catastro P (Reg)
        38 to listOf(14, 32, 18), // Plan Terr -> Elem Const, Catastro P, Gest Amb (Reg)
        39 to listOf(31, 33),   // SIG -> Carto, Perc Rem (Reg)
        40 to listOf(27),       // Hig Seg -> Agr Leg II (Reg)
        41 to listOf(35),       // AFC 4 -> AFC 3
        42 to listOf(37, 39, 24), // Cat Econ -> Val, SIG, Org Emp (Reg)
        43 to listOf(23, 37, 24), // Ejer Prof -> Topo Ap, Val, Org Emp (Reg)
        44 to listOf(34),       // Hidro -> Ing Lev (Reg)
        45 to emptyList(),
        46 to emptyList(),
        47 to listOf(29, 32),   // Agro -> Fotoint, Catastro P (Reg)
        48 to listOf(41),       // AFC 5 -> AFC 4
        49 to emptyList(),
        50 to emptyList(),
        51 to emptyList()
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),         // Mat A -> Mat Ing (Apr)
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(0),         // Mat B -> Mat Ing (Apr)
        6 to listOf(0),         // Fis I -> Mat Ing (Apr)
        7 to emptyList(),
        8 to listOf(2),         // Mat C -> Mat A (Apr)
        9 to listOf(2),         // Fis II -> Mat A (Apr)
        10 to emptyList(),
        11 to listOf(2),        // Fund Instr -> Mat A (Apr)
        12 to listOf(2),        // Prob -> Mat A (Apr)
        13 to emptyList(),
        14 to listOf(5, 3),     // Elem Const -> Mat B, Dib Topo (Apr)
        15 to listOf(5, 3),     // Topo I -> Mat B, Dib Topo (Apr)
        16 to listOf(1, 5, 6, 3, 11), // Instr Esp -> Rep Graf, Mat B, Fis I, Dib Topo, Fund Instr (Apr)
        17 to listOf(1, 3, 11), // Topo II -> Rep Graf, Dib Topo, Fund Instr (Apr)
        18 to listOf(3, 4),     // Gest Amb -> Dib Topo, Intro Agr (Apr)
        19 to listOf(5),        // Intro Prog -> Mat B (Apr)
        20 to emptyList(),
        21 to listOf(5, 6, 10, 15), // Foto I -> Mat B, Fis I, Geomorf, Topo I (Apr)
        22 to listOf(5, 10, 15), // Geod I -> Mat B, Geomorf, Topo I (Apr)
        23 to listOf(10, 11, 15), // Topo Ap -> Geomorf, Fund Instr, Topo I (Apr)
        24 to listOf(3, 4),     // Org Emp -> Dib Topo, Intro Agr (Apr)
        25 to emptyList(),
        26 to listOf(5, 8, 10, 15), // Calc Comp -> Mat B, Mat C, Geomorf, Topo I (Apr)
        27 to listOf(3, 4, 10, 15), // Agr Leg II -> Dib Topo, Intro Agr, Geomorf, Topo I (Apr)
        28 to listOf(8, 9, 15, 17), // Geod II -> Mat C, Fis II, Topo I, Topo II (Apr)
        29 to listOf(9, 17),    // Fotoint -> Fis II, Topo II (Apr)
        30 to emptyList(),
        31 to listOf(9, 16, 17, 22), // Carto -> Fis II, Instr Esp, Topo II, Geod I (Apr)
        32 to listOf(9, 13, 17), // Catastro P -> Fis II, Agr Leg I, Topo II (Apr)
        33 to listOf(21),       // Perc Rem -> Foto I (Apr)
        34 to listOf(14, 16, 17, 22), // Ing Lev -> Elem Const, Instr Esp, Topo II, Geod I (Apr)
        35 to emptyList(),
        36 to listOf(14, 17, 49), // Agr Obras -> Elem Const, Topo II, Ingles (Apr)
        37 to listOf(11, 21, 27, 49), // Val -> Fund Instr, Foto I, Agr Leg II, Ingles (Apr)
        38 to listOf(10, 11, 13, 21, 27, 49), // Plan Terr -> Geomorf, Fund Instr, Agr Leg I, Foto I, Agr Leg II, Ingles (Apr)
        39 to listOf(21, 28, 29, 49), // SIG -> Foto I, Geod II, Fotoint, Ingles (Apr)
        40 to listOf(13, 17, 49), // Hig Seg -> Agr Leg I, Topo II, Ingles (Apr)
        41 to listOf(49),       // AFC 4 -> Ingles (Apr)
        42 to listOf(13, 14, 31, 32, 33, 49), // Cat Econ -> Agr Leg I, Elem Const, Carto, Catastro P, Perc Rem, Ingles (Apr)
        43 to listOf(13, 14, 17, 32, 49), // Ejer Prof -> Agr Leg I, Elem Const, Topo II, Catastro P, Ingles (Apr)
        44 to listOf(23, 28, 49), // Hidro -> Topo Ap, Geod II, Ingles (Apr)
        45 to listOf(49),       // TF -> Ingles (Apr)
        46 to listOf(49),       // PPS -> Ingles (Apr)
        47 to listOf(21, 27, 49), // Agro -> Foto I, Agr Leg II, Ingles (Apr)
        48 to listOf(49),       // AFC 5 -> Ingles (Apr)
        49 to listOf(0),        // Ingles -> Mat Ing (Apr)
        50 to emptyList(),
        51 to emptyList()
    )

    // Requisito: Final Aprobado para Aprobar Final
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to listOf(0),
        3 to emptyList(),
        4 to emptyList(),
        5 to listOf(2),
        6 to listOf(2),
        7 to emptyList(),
        8 to listOf(5),
        9 to listOf(5, 6),
        10 to listOf(3),
        11 to listOf(5, 3),
        12 to listOf(5),
        13 to listOf(3, 4),
        14 to listOf(11),
        15 to listOf(1, 3, 11),
        16 to listOf(9, 15),
        17 to listOf(10, 15),
        18 to listOf(10, 13),
        19 to listOf(8),
        20 to emptyList(),
        21 to listOf(9, 17),
        22 to listOf(8, 17),
        23 to listOf(14, 17),
        24 to listOf(13),
        25 to emptyList(),
        26 to listOf(12, 19, 17),
        27 to listOf(13, 17),
        28 to listOf(16, 22),
        29 to listOf(21),
        30 to listOf(25),
        31 to listOf(21, 28),
        32 to listOf(21, 27),
        33 to listOf(29),
        34 to listOf(23, 28),
        35 to listOf(30),
        36 to listOf(23, 49),
        37 to listOf(14, 32, 49),
        38 to listOf(14, 32, 18, 49),
        39 to listOf(31, 33, 49),
        40 to listOf(27, 49),
        41 to listOf(49, 35),
        42 to listOf(37, 39, 49, 24),
        43 to listOf(23, 37, 49, 24),
        44 to listOf(34, 49),
        45 to listOf(49),
        46 to listOf(49),
        47 to listOf(29, 32, 49),
        48 to listOf(49, 41),
        49 to listOf(0),
        50 to emptyList(),
        51 to emptyList()
    )

    override val reglasDeCorrelatividadesCursadaConFinal = null

    override val cantidadDeAprobadasParaCursar = mapOf(
        25 to 10, // AFC 1
        45 to 30, // Trabajo Final
        46 to 30  // PPS
    )

    override val cantidadDeAprobadasParaFinal = cantidadDeAprobadasParaCursar
    override val cantidadDeCursadasParaCursar= emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal= emptyMap<Int, Int>()
}