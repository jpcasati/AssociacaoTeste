package com.example.associacaoteste

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Curso::class, Aluno::class], version = 1)
abstract class DB : RoomDatabase() {

    abstract fun CursoDAO() : CursoDAO
    abstract fun AlunoDAO() : AlunoDAO

    companion object {

        private var database: DB? = null

        private val DATABASE = "AlunoCursoDB"

        fun getInstance(context: Context): DB? {

            if(database == null)
                return criaBanco(context)
            else
                return database

        }

        private fun criaBanco(context: Context): DB {
            return Room.databaseBuilder(context, DB::class.java, DATABASE)
                .allowMainThreadQueries()
                .build()
        }
    }
}