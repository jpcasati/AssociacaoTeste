package com.example.associacaoteste

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface AlunoDAO {

    @Insert
    fun salvar(a: Aluno)

    @Query("SELECT * FROM Aluno")
    fun listar(): List<Aluno>

    @Query("SELECT * FROM Aluno")
    fun listarComCurso(): List<AlunoCurso>

}