fun main() {
    val a = lerDouble("Digite o 1º número: ")
    val b = lerDouble("Digite o 2º número: ")
    val c = lerDouble("Digite o 3º número: ")
    if (a > b && a > c) {
        println("Maior número: $a")
    } else if (b > c) {
        println("Maior número: $b")
    } else {
        println("Maior número: $c")
    }
}
