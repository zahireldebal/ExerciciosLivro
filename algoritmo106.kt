fun main() {
    val nome = lerTexto("Digite um nome: ")
    if (nome.startsWith("A", ignoreCase = true)) {
        println(nome)
    }
}
