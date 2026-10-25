fun main() {
    val primeiroTermo = lerDouble("Entre com o 1º termo: ")
    val razao = lerDouble("Entre com a razão: ")
    val decimoTermo = primeiroTermo + 9 * razao
    println("O 10º termo da P.A. é: $decimoTermo")
}
