fun main() {
    val palavra = lerTexto("Digite uma palavra: ").trim()
    if (palavra.isEmpty()) {
        println("Palavra vazia")
    } else if (palavra.startsWith("l", ignoreCase = true) || palavra.startsWith("d", ignoreCase = true)) {
        println("Nova palavra: ${palavra.take(2) + palavra.last()}")
    } else {
        println("Nova palavra: ${palavra.drop(1)}")
    }
}
