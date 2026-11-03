import kotlin.math.*

fun main() {
    val numero1 = lerDouble("Digite o 1º número: ")
    val numero2 = lerDouble("Digite o 2º número: ")
    val menor = if (numero1 < numero2) numero1 else numero2
    val maior = if (numero1 < numero2) numero2 else numero1
    println("Quadrado do menor: ${menor * menor}")
    if (maior >= 0) {
        println("Raiz quadrada do maior: ${sqrt(maior)}")
    } else {
        println("Não é possível calcular a raiz quadrada do maior")
    }
}
