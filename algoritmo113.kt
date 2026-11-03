fun main() {
    val numero1 = lerDouble("Digite o 1º número: ")
    val numero2 = lerDouble("Digite o 2º número: ")
    if (numero1 < numero2) {
        println("$numero1 $numero2")
    } else {
        println("$numero2 $numero1")
    }
}
