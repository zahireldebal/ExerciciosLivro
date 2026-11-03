fun main() {
    val numero = lerInt("Digite um número de 3 algarismos: ")
    val centena = numero / 100
    if (centena % 2 == 0) {
        println("O algarismo da casa das centenas ($centena) é par")
    } else {
        println("O algarismo da casa das centenas ($centena) é ímpar")
    }
}
