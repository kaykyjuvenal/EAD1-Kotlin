package br.edu.ifsp.scl.ads.exercicio5ead1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referência ao TextView onde os resultados serão exibidos
        val textViewResultado = findViewById<TextView>(R.id.textViewResultado)

        // 1. Chamadas normais das funções de alta ordem
        val somaResult = processaInteiros(3, 5, ::soma)
        val multiplicaResult = processaInteiros(4, 6, ::multiplica)
        val raizQuadradaResult = processaInteiro(16, ::raizQuadrada)

        // 2. Chamadas com expressões lambdas
        val somaLambda = processaInteiros(3, 5) { a, b -> a + b }
        val multiplicaLambda = processaInteiros(4, 6) { a, b -> a * b }
        val raizQuadradaLambda = processaInteiro(16) { numero ->
            for (n in 1..numero) {
                if (n * n == numero)
                    return@processaInteiro n
            }
            -1
        }

        // Concatenando todos os resultados
        val resultadoFinal = """
            Resultado da soma: $somaResult
            Resultado da multiplicação: $multiplicaResult
            Resultado da raiz quadrada: $raizQuadradaResult
            Resultado da soma com lambda: $somaLambda
            Resultado da multiplicação com lambda: $multiplicaLambda
            Resultado da raiz quadrada com lambda: $raizQuadradaLambda
        """.trimIndent()

        // Exibir os resultados no TextView
        textViewResultado.text = resultadoFinal
    }

    // Funções de alta ordem
    fun processaInteiro(i: Int, f: (Int) -> Int): Int {
        return f(i)
    }

    fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int {
        return f(i, j)
    }

    // Funções normais
    fun soma(i: Int, j: Int): Int {
        return i + j
    }

    fun multiplica(i: Int, j: Int): Int {
        return i * j
    }

    fun raizQuadrada(numero: Int): Int {
        for (n in 1..numero) {
            if (n * n == numero)
                return n
        }
        return -1
    }
}