import kotlin.math.*

fun main() {
    val pr1 = lerDouble("Digite a nota da PR1: ")
    val pr2 = lerDouble("Digite a nota da PR2: ")
    val media = (pr1 + pr2) / 2
    println("Média truncada: ${media.toInt()}")
    println("Média arredondada: ${media.roundToInt()}")
}
