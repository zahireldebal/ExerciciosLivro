fun main() {
    val placa = lerTexto("Digite a placa do carro: ").trim()
    val mes = when (placa.lastOrNull()) {
        '1' -> "janeiro"
        '2' -> "fevereiro"
        '3' -> "março"
        '4' -> "abril"
        '5' -> "maio"
        '6' -> "junho"
        '7' -> "julho"
        '8' -> "agosto"
        '9' -> "setembro"
        '0' -> "outubro"
        else -> "opção inválida"
    }
    println(mes)
}
