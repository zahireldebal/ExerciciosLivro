fun main() {
    val a = lerDouble("Digite o 1º número: ")
    val b = lerDouble("Digite o 2º número: ")
    val c = lerDouble("Digite o 3º número: ")
    var maior = a
    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }
    println("Maior número: $maior")
}
