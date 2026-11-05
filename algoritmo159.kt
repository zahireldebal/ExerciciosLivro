import kotlin.math.*

fun main() {
    val x = lerDouble("Digite o valor de x: ")
    if (x > 4 || x < -4) {
        println("f(x) = ${(5 * x + 3) / sqrt(x * x - 16)}")
    } else {
        println("NÃO PODE SER FEITA")
    }
}
