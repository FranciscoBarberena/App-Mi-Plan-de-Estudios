package com.example.consola.data.mapas

import androidx.core.graphics.component1
import androidx.core.graphics.component2
import androidx.core.graphics.component3
import androidx.core.graphics.component4

object DataArquitectura : _InformacionDeCarrera {
    override val nombresDeMaterias = arrayOf(
        "Introducción a la Materialidad",        // 0
        "Arquitectura I",                        // 1
        "Teoría I",                              // 2
        "Comunicación I",                        // 3
        "Sistema de Representación",             // 4
        "Elementos de Matemática y Física",      // 5
        "Arquitectura II",                       // 6
        "Teoría II",                             // 7
        "Comunicación II",                       // 8
        "Historia de la Arquitectura I",         // 9
        "Matemática Aplicada",                   // 10
        "Estructuras I",                         // 11
        "Procesos Constructivos I",              // 12
        "Arquitectura III",                      // 13
        "Teorías Territoriales",                 // 14
        "Comunicación III",                      // 15
        "Historia de la Arquitectura II",        // 16
        "Instalaciones I",                       // 17
        "Estructuras II",                        // 18
        "Procesos Constructivos II",             // 19
        "Arquitectura IV",                       // 20
        "Planificación Territorial I",           // 21
        "Historia de la Arquitectura III",       // 22
        "Instalaciones II",                      // 23
        "Producción de Obras I",                 // 24
        "Estructuras III",                       // 25
        "Procesos Constructivos III",            // 26
        "Asignatura Electiva I",                 // 27
        "Asignatura Electiva II",                // 28
        "Arquitectura V",                        // 29
        "Planificación Territorial II",          // 30
        "Producción de Obras II",                // 31
        "Práctica Pre Profesional Asistida",     // 32
        "PPO Práctica y Producción de Obras",    // 33
        "Trabajo Final de Carrera"               // 34
    )

    // Requisito: Regularizada para Cursar
    // Regla: "Para la cursada de una se necesita la cursada de la anterior"
    override val reglasDeCorrelatividadesCursadaConCursada = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(1),         // Arq II -> Arq I
        7 to listOf(2),         // Teo II -> Teo I
        8 to listOf(3),         // Com II -> Com I
        9 to emptyList(),
        10 to listOf(5),        // Mat Apl -> Elem Mat
        11 to listOf(0),        // Est I -> Intro Mat
        12 to listOf(0),        // Proc I -> Intro Mat
        13 to listOf(6) + (0..5).toList(),        // Arq III -> Arq II
        14 to (0..5).toList(),
        15 to listOf(8) + (0..5).toList(),        // Com III -> Com II
        16 to listOf(9) + (0..5).toList(),        // Hist II -> Hist I
        17 to (0..5).toList(),        // Inst I -> Intro Mat
        18 to listOf(11) + (0..5).toList(),       // Est II -> Est I
        19 to listOf(12) + (0..5).toList(),       // Proc II -> Proc I
        20 to listOf(13),       // Arq IV -> Arq III
        21 to listOf(14),       // Plan Terr I -> Teo Terr
        22 to listOf(16),       // Hist III -> Hist II
        23 to listOf(17),       // Inst II -> Inst I
        24 to listOf(0),        // Prod Obras I -> Intro Mat
        25 to listOf(18),       // Est III -> Est II
        26 to listOf(19),       // Proc III -> Proc II
        27 to listOf(14) + listOf(21, 24),
        28 to listOf(14) + listOf(21, 24),
        29 to listOf(20) + listOf(14) + listOf(21, 24),       // Arq V -> Arq IV
        30 to listOf(14) + listOf(21, 24),       // Plan Terr II -> Plan Terr I
        31 to listOf(14) + listOf(21, 24),       // Prod Obras II -> Prod Obras I
        32 to listOf(14) + listOf(21, 24),
        33 to listOf(31) + listOf(14) + listOf(21, 24),       // PPO -> Prod Obras II
        34 to listOf(29) + listOf(14) + listOf(21, 24)       // TFC -> Arq V
    )

    // Requisito: Final Aprobado para Cursar
    override val reglasDeCorrelatividadesFinalConCursada = mapOf(
        27 to (6..12).toList() + listOf(20),
        28 to (6..12).toList() + listOf(20),
        29 to (6..12).toList() + listOf(20),
        30 to (6..12).toList() + listOf(20),
        31 to (6..12).toList() + listOf(20),
        32 to (6..12).toList() + listOf(20),
        33 to (6..12).toList() + listOf(20),
        34 to (6..12).toList() + listOf(20),
    )

    // Requisito: Final Aprobado para Aprobar Final
    // Regla: "Para aprobar una se necesita el final de la anterior"
    override val reglasDeCorrelatividadesFinalConFinal = mapOf(
        0 to emptyList(),
        1 to emptyList(),
        2 to emptyList(),
        3 to emptyList(),
        4 to emptyList(),
        5 to emptyList(),
        6 to listOf(1),         // Arq II -> Arq I
        7 to listOf(2),         // Teo II -> Teo I
        8 to listOf(3),         // Com II -> Com I
        9 to emptyList(),
        10 to listOf(5),        // Mat Apl -> Elem Mat
        11 to listOf(0),        // Est I -> Intro Mat
        12 to listOf(0),        // Proc I -> Intro Mat
        13 to listOf(6),        // Arq III -> Arq II
        14 to emptyList(),
        15 to listOf(8),        // Com III -> Com II
        16 to listOf(9),        // Hist II -> Hist I
        17 to listOf(0),        // Inst I -> Intro Mat
        18 to listOf(11),       // Est II -> Est I
        19 to listOf(12),       // Proc II -> Proc I
        20 to listOf(13),       // Arq IV -> Arq III
        21 to listOf(14),       // Plan Terr I -> Teo Terr
        22 to listOf(16),       // Hist III -> Hist II
        23 to listOf(17),       // Inst II -> Inst I
        24 to listOf(0),        // Prod Obras I -> Intro Mat
        25 to listOf(18),       // Est III -> Est II
        26 to listOf(19),       // Proc III -> Proc II
        27 to emptyList(),
        28 to emptyList(),
        29 to listOf(20),       // Arq V -> Arq IV
        30 to listOf(21),       // Plan Terr II -> Plan Terr I
        31 to listOf(24),       // Prod Obras II -> Prod Obras I
        32 to emptyList(),
        33 to listOf(31),       // PPO -> Prod Obras II
        34 to (0..33).toList()        // TFC -> Todas las anteriores
    )

    override val reglasDeCorrelatividadesCursadaConFinal = reglasDeCorrelatividadesFinalConCursada
    override val cantidadDeAprobadasParaCursar = mapOf(
        34 to 25
    )
    override val cantidadDeAprobadasParaFinal = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaCursar = emptyMap<Int, Int>()
    override val cantidadDeCursadasParaFinal = emptyMap<Int, Int>()

}