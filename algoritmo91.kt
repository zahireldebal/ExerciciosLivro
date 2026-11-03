fun main() {
    val numero1 = lerInt("Digite o 1º número: ")
    val numero2 = lerInt("Digite o 2º número: ")
    val soma = numero1 + numero2
    if (soma > 10) {
        println("Soma: $soma")
    }
}
