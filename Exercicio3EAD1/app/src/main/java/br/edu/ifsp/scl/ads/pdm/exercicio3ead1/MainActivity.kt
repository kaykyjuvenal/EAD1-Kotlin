package br.edu.ifsp.scl.ads.pdm.exercicio3ead1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Certifique-se de que o layout esteja correto.

        // Função para somar dois inteiros
        fun soma(i: Int, j: Int) = i + j

        // Função para concatenar duas Strings
        fun cat(i: String, j: String): String = "${i}${j}"

        // Função que aplica uma operação em dois inteiros
        fun foo(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
            return operation(a, b)
        }

        // Função que aplica uma operação em duas Strings
        fun bar(a: String, b: String, operation: (String, String) -> String): String {
            return operation(a, b)
        }

        // Obtenção do TextView e definição dos resultados
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)
        val resultadoSoma = foo(10, 20, ::soma)
        val resultadoConcat = bar("Ped", "ro", ::cat)

        // Exibe os resultados no TextView
        textViewResultado.text = "Soma: $resultadoSoma\nConcatenação: $resultadoConcat"
    }
}
