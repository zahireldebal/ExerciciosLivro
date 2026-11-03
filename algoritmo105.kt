fun main() {
    val sigla = lerTexto("Digite a sigla do estado: ")
    when (sigla.uppercase()) {
        "RJ" -> println("carioca")
        "SP" -> println("paulista")
        "MG" -> println("mineiro")
        else -> println("outros estados")
    }
}
