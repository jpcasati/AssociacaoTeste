package com.example.associacaoteste

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        carregaLista()
        super.onResume()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.cadastros, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.menuAluno) {
            startActivity(Intent(this, CadAluno::class.java))
        }

        if (item.itemId == R.id.menuCurso) {
            startActivity(Intent(this, CadCurso::class.java))
        }
        return super.onOptionsItemSelected(item)
    }


    fun carregaLista() {

        val alunos = DB.getInstance(this)!!.AlunoDAO().listarComCurso()
        val adp = ArrayAdapter(this, android.R.layout.simple_list_item_1, alunos)
        lstAlunos.adapter = adp
    }
}