package com.example.associacaoteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cad_curso.*

class CadCurso : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_curso)

        btnSalvaCurso.setOnClickListener {

            DB.getInstance(this)!!.CursoDAO().salvar(Curso(edtCodigo.text.toString().toInt(), edtNomeCurso.text.toString()))
            finish()

        }
    }
}
