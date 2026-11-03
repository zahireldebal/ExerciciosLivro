import kotlin.math.*

fun main() {
    val numero = lerDouble("Digite um número: ")
    if (numero > 0) {
        println("Inverso: ${1 / numero}")
    } else {
        println("Valor absoluto: ${abs(numero)}")
    }
}
