fun main() {
    val nome1 = lerTexto("Digite o 1º nome: ")
    val nome2 = lerTexto("Digite o 2º nome: ")
    if (nome1.compareTo(nome2, ignoreCase = true) <= 0) {
        println(nome1)
        println(nome2)
    } else {
        println(nome2)
        println(nome1)
    }
}
