fun main() {
    val municipio = lerTexto("Digite o nome do município: ")
    val eleitores = lerInt("Digite o número de eleitores aptos: ")
    val votos = lerInt("Digite o número de votos do candidato mais votado: ")
    if (eleitores > 20000 && votos * 2 <= eleitores) {
        println("$municipio terá segundo turno")
    } else {
        println("$municipio não terá segundo turno")
    }
}
