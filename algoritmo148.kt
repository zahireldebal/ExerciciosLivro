fun main() {
    val destino = lerInt("Digite 1- Região Norte 2- Região Nordeste 3- Região Centro-Oeste 4- Região Sul: ")
    val viagem = lerInt("Digite 1- Ida 2- Ida e Volta: ")
    val precoIda = when (destino) {
        1 -> 500.0
        2 -> 350.0
        3 -> 350.0
        4 -> 300.0
        else -> null
    }
    val precoIdaVolta = when (destino) {
        1 -> 900.0
        2 -> 650.0
        3 -> 600.0
        4 -> 550.0
        else -> null
    }
    val preco = if (viagem == 1) precoIda else if (viagem == 2) precoIdaVolta else null
    if (preco != null) {
        println("O valor da passagem é: R$ ${dinheiro(preco)}")
    } else {
        println("Opção inexistente")
    }
}
