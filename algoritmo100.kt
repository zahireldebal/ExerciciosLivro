fun main() {
    val numero = lerInt("Digite um número de 4 algarismos: ")
    val formado = numero / 100
    if (formado % 4 == 0) {
        println("$formado é múltiplo de 4")
    } else {
        println("$formado não é múltiplo de 4")
    }
}
