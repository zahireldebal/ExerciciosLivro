import kotlin.math.*

fun main() {
    val cateto1 = lerDouble("Entre com o 1º cateto: ")
    val cateto2 = lerDouble("Entre com o 2º cateto: ")
    println("Hipotenusa: ${sqrt(cateto1 * cateto1 + cateto2 * cateto2)}")
}
