package com.example.consola.data
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
@Dao
interface MateriaDao {

    @Query("SELECT * FROM tabla_materias")
    suspend fun obtenerTodas(): List<MateriaEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertarTodas(materias: List<MateriaEntity>)

    @Update
    suspend fun actualizar(materia: MateriaEntity)

    @Query("DELETE FROM tabla_materias")
    suspend fun borrarTodo()
}