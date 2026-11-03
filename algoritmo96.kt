fun main() {
    val numero = lerInt("Digite um número: ")
    if (numero % 3 == 0 && numero % 7 == 0) {
        println("Divisível por 3 e por 7")
    } else {
        println("Não é divisível por 3 e por 7")
    }
}
