fun main() {
    val nome = lerTexto("Digite o nome completo: ")
    val prenome = nome.trim().split(" ").first()
    if (prenome == "JOSE") {
        println(nome)
    }
}
