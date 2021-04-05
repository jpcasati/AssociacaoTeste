package com.example.associacaoteste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AndroidException
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_cad_aluno.*

class CadAluno : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cad_aluno)

        val cursos = DB.getInstance(this)!!.CursoDAO().listar()

        val adp = ArrayAdapter(this, android.R.layout.simple_spinner_item, cursos)

        spnCurso.adapter = adp


        btnSalvaAluno.setOnClickListener {

            val ra = edtRa.text.toString()
            val nome = edtNome.text.toString()

            val codigoCurso = spnCurso.selectedItem.toString().toInt()

            val a = Aluno(ra, nome, codigoCurso)

            DB.getInstance(this)!!.AlunoDAO().salvar(a)

            finish()
        }
    }
}
