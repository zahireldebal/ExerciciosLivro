fun main() {
    val numero1 = lerDouble("Digite o 1º número: ")
    val numero2 = lerDouble("Digite o 2º número: ")
    if (numero1 < numero2) {
        println("Menor número: $numero1")
    } else {
        println("Menor número: $numero2")
    }
}
