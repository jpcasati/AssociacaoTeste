package com.example.associacaoteste

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CursoDAO {

    @Insert
    fun salvar(c: Curso)

    @Query("SELECT * FROM Curso")
    fun listar(): List<Curso>

    @Query("SELECT * FROM Curso")
    fun listarComAluno(): List<AlunoCurso>

}