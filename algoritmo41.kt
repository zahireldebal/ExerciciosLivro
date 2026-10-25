fun main() {
    val a = lerDouble("Entre com o 1º número: ")
    val b = lerDouble("Entre com o 2º número: ")
    val c = lerDouble("Entre com o 3º número: ")
    val d = lerDouble("Entre com o 4º número: ")
    val mediaPonderada = (a * 1 + b * 2 + c * 3 + d * 4) / 10
    println("Média ponderada: $mediaPonderada")
}
