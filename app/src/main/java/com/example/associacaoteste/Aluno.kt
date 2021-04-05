package com.example.associacaoteste

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Aluno(@PrimaryKey val ra: String, val nome: String, val codigoCurso: Int) {

    override fun toString(): String {
        return ra + " / " + nome + " / " + codigoCurso
    }
}