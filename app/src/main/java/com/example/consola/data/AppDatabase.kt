package com.example.consola.data
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Tablas que tiene la base de datos:
@Database(entities = [MateriaEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {


    abstract fun materiaDao(): MateriaDao


    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "base_de_datos_carrera"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}