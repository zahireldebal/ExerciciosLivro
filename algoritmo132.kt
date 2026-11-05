fun main() {
    val reais = lerDouble("Digite o valor em reais a ser convertido: ")
    val moeda = lerTexto("Digite f - franco suíço, l - libra esterlina, d - dólar, m - marco alemão: ")
    when (moeda.lowercase()) {
        "f" -> {
            val cotacao = lerDouble("Digite o valor de um franco suíço em reais: ")
            println("Total de francos suíços: ${reais / cotacao}")
        }
        "l" -> {
            val cotacao = lerDouble("Digite o valor de uma libra esterlina em reais: ")
            println("Total de libras esterlinas: ${reais / cotacao}")
        }
        "d" -> {
            val cotacao = lerDouble("Digite o valor de um dólar em reais: ")
            println("Total de dólares: ${reais / cotacao}")
        }
        "m" -> {
            val cotacao = lerDouble("Digite o valor de um marco alemão em reais: ")
            println("Total de marcos alemães: ${reais / cotacao}")
        }
        else -> println("Moeda desconhecida")
    }
}
