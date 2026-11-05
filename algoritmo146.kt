fun main() {
    val tipo = lerTexto("Digite o tipo de carro (A/B/C): ")
    val percurso = lerDouble("Digite o percurso em quilômetros: ")
    val quilometrosPorLitro = when (tipo.uppercase()) {
        "A" -> 8.0
        "B" -> 9.0
        "C" -> 12.0
        else -> null
    }
    if (quilometrosPorLitro != null) {
        println("Consumo estimado em litros: ${"%.2f".format(percurso / quilometrosPorLitro)}")
    } else {
        println("Modelo inexistente")
    }
}
