fun main() {
    val numero = lerInt("Digite um número: ")
    when {
        numero % 10 == 0 -> println("Divisível por 10")
        numero % 5 == 0 -> println("Divisível por 5")
        numero % 2 == 0 -> println("Divisível por 2")
        else -> println("Não é divisível por 10, 5 nem 2")
    }
}
