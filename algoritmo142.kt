fun main() {
    val p1 = lerInt("Digite os pontos do 1º jogador: ")
    val p2 = lerInt("Digite os pontos do 2º jogador: ")
    val p3 = lerInt("Digite os pontos do 3º jogador: ")
    val ordenados = listOf(p1, p2, p3).sortedDescending()
    println("Pontos em ordem decrescente: ${ordenados[0]} ${ordenados[1]} ${ordenados[2]}")
    val soma = p1 + p2 + p3
    if (soma > 100) {
        println("Média: ${"%.2f".format(soma / 3.0)}")
    } else {
        println("Equipe desclassificada")
    }
}
