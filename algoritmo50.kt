import kotlin.math.*

fun main() {
    val base = lerDouble("Entre com a base: ")
    val altura = lerDouble("Entre com a altura: ")
    println("perímetro: ${2 * (base + altura)}")
    println("área: ${base * altura}")
    println("diagonal: ${sqrt(base * base + altura * altura)}")
}
