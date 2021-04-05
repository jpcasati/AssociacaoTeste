package com.example.associacaoteste

import androidx.room.Embedded
import androidx.room.Relation


data class AlunoCurso(@Embedded val curso: Curso,
                      @Relation(
                          parentColumn = "codigoCurso",
                          entityColumn = "codigoCurso"
                      ) val alunos: List<Aluno>) {
}