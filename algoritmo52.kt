import kotlin.math.*

fun main() {
    val lado = lerDouble("Entre com o lado: ")
    println("perímetro: ${4 * lado}")
    println("área: ${lado * lado}")
    println("diagonal: ${lado * sqrt(2.0)}")
}
