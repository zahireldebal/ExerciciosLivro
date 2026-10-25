import kotlin.math.*

fun main() {
    val primeiroTermo = lerDouble("Entre com o 1º termo: ")
    val razao = lerDouble("Entre com a razão: ")
    val quintoTermo = primeiroTermo * razao.pow(4)
    println("O 5º termo da P.G. é: $quintoTermo")
}
