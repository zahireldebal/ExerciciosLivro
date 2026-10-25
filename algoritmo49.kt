fun main() {
    val nome = lerTexto("Entre com o nome: ")
    println("todo nome: $nome")
    println("primeiro caractere: ${nome.first()}")
    println("último caractere: ${nome.last()}")
    println("do primeiro até o terceiro: ${nome.take(3)}")
    println("quarto caractere: ${nome.getOrNull(3) ?: "não existe"}")
    println("todos menos o primeiro: ${nome.drop(1)}")
    println("os dois últimos: ${nome.takeLast(2)}")
}
