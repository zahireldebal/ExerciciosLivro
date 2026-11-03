import kotlin.math.*

fun main() {
    val numero = lerDouble("Digite um número: ")
    if (numero > 0) {
        println("Raiz quadrada: ${sqrt(numero)}")
    } else {
        println("Quadrado: ${numero * numero}")
    }
}
