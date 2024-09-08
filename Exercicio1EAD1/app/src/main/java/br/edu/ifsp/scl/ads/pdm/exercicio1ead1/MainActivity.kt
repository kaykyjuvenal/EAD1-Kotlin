package br.edu.ifsp.scl.ads.pdm.exercicio1ead1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val listaCursos: MutableList<String> = mutableListOf(
                    "Sistemas para Dispositivos Móveis",
                    "Análise e Desenvolvimento de Sistemas",
                    "Técnico em Informática para Internet",
                    "Manutenção de Aeronaves",
                    "Técnico em Células",
                    "Processos Gerenciais"
                )

        // Filtrando os cursos que contém a palavra "Sistemas"
            val cursosComSistemas = listaCursos.filter { it.contains("Sistemas", ignoreCase = true) }

            // Cria um ArrayAdapter para mapear os dados para a view
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cursosComSistemas)

            // Obtém a referência para o ListView
            val listView = findViewById<ListView>(R.id.listViewCursos)

            // Associa o adapter ao ListView
            listView.adapter = adapter
    }
}
