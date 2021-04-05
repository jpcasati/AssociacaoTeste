package com.example.associacaoteste

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Curso(@PrimaryKey val codigoCurso: Int, val nome: String) {

    override fun toString(): String {
        return codigoCurso.toString()
    }
}