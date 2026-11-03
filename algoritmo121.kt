fun main() {
    val a = lerInt("Digite o 1º número: ")
    val b = lerInt("Digite o 2º número: ")
    val c = lerInt("Digite o 3º número: ")
    val d = lerInt("Digite o 4º número: ")
    val e = lerInt("Digite o 5º número: ")
    println("Maior valor: ${maxOf(a, b, c, d, e)}")
    println("Menor valor: ${minOf(a, b, c, d, e)}")
}
