package br.edu.ifsp.scl.ads.exercicio4ead1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Função de soma de inteiros
        fun soma(a: Int, b: Int): Int {
            return a + b
        }

        // Função de concatenação de strings
        fun cat(a: String, b: String): String {
            return a + b
        }

        // Função de alta ordem genérica
        fun <T> xpto(a: T, b: T, operation: (T, T) -> T): T {
            return operation(a, b)
        }

        // Chamadas para a função xpto
        val resultadoSoma = xpto(2, 3, ::soma)  // Soma: 5
        val resultadoConcat = xpto("Jo", "ão", ::cat)  // Concatenação: João

        // Exibir os resultados no TextView
        val textView = findViewById<TextView>(R.id.textViewResultado)
        textView.text = "Soma: $resultadoSoma\nConcatenação: $resultadoConcat"
    }
}