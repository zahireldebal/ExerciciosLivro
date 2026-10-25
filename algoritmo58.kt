import kotlin.math.*

fun main() {
    val xnum1 = lerDouble("Entre com o 1º valor: ")
    val xnum2 = lerDouble("Entre com o 2º valor: ")
    val xnum3 = lerDouble("Entre com o 3º valor: ")
    val x = xnum1 + xnum2 / (xnum3 + xnum1) + 2 * (xnum1 - xnum2) + ln(64.0) / ln(2.0)
    println("X = $x")
}
