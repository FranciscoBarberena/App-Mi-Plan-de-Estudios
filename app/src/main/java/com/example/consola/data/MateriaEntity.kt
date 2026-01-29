package com.example.consola.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_materias")
data class MateriaEntity(
    @PrimaryKey val id: Int,
    val nombre: String,
    val nota: Int,
    val cursadaAprobada: Boolean)
{

}

