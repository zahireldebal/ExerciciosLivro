fun main() {
    val finalistas = mutableListOf<Pair<String, Int>>()
    for (i in 1..3) {
        val nome = lerTexto("Digite o nome do ${i}º finalista: ")
        val pontos = lerInt("Digite os pontos de $nome: ")
        finalistas.add(Pair(nome, pontos))
    }
    val classificacao = finalistas.sortedByDescending { it.second }
    println("Vencedor: ${classificacao[0].first} ${classificacao[0].second} ptos")
    println("Segundo colocado: ${classificacao[1].first} ${classificacao[1].second} ptos")
    println("Terceiro colocado: ${classificacao[2].first} ${classificacao[2].second} ptos")
}
