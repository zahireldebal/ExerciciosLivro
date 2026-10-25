fun main() {
    val lados = lerInt("Quantos lados tem o polígono? ")
    val diagonais = lados * (lados - 3) / 2
    println("Número de diagonais: $diagonais")
}
