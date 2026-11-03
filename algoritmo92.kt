fun main() {
    val numero1 = lerDouble("Digite o 1º número: ")
    val numero2 = lerDouble("Digite o 2º número: ")
    val soma = numero1 + numero2
    if (soma > 20) {
        println("Soma: ${soma + 8}")
    } else {
        println("Soma: ${soma - 5}")
    }
}
