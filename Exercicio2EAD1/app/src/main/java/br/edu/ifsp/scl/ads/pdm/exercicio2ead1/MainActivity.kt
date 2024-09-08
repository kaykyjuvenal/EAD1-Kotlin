package br.edu.ifsp.scl.ads.pdm.exercicio2ead1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout principal da Activity

        // Mapa com informações da família
        val familiaMap: MutableMap<String, String> = mutableMapOf(
            Pair("Pai", "Pedro"),
            Pair("Mãe", "Marcela"),
            Pair("Filho", "João"),
            Pair("Caçula", "Cadu"),
            Pair("Pet", "Paçoca")
        )

        // Referência ao ListView
        val listView = findViewById<ListView>(R.id.listViewFamilia)

        // Criar uma lista para armazenar as strings a serem exibidas
        val listaItens = mutableListOf<String>()
        for ((chave, valor) in familiaMap) {
            listaItens.add("$chave: $valor")
        }

        // Criar o ArrayAdapter com o layout adequado
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaItens)

        // Associar o adapter ao ListView
        listView.adapter = adapter
    }
}