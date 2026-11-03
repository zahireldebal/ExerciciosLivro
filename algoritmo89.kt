fun main() {
    println("Planetas que podem ser analisados:")
    println("1 Mercúrio")
    println("2 Vênus")
    println("3 Marte")
    println("4 Júpiter")
    println("5 Saturno")
    println("6 Urano")
    val opcao = lerInt("Escolha o planeta a ser analisado: ")
    val pesoTerra = lerDouble("Entre com um peso na Terra: ")
    val gravidade = when (opcao) {
        1 -> 0.37
        2 -> 0.88
        3 -> 0.38
        4 -> 2.64
        5 -> 1.15
        6 -> 1.17
        else -> null
    }
    if (gravidade != null) {
        println("Seu peso neste planeta é: ${pesoTerra / 10 * gravidade}")
    } else {
        println("Este planeta não pode ser analisado")
    }
}
