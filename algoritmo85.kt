fun main() {
    val a = lerDouble("Digite o 1º número: ")
    val b = lerDouble("Digite o 2º número: ")
    val c = lerDouble("Digite o 3º número: ")
    val maior = if (a > b) {
        if (a > c) a else c
    } else {
        if (b > c) b else c
    }
    println(maior)
}
