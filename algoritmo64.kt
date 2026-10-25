fun main() {
    val celsius = lerDouble("Entre com a temperatura em graus centígrados: ")
    val fahrenheit = (9 * celsius + 160) / 5
    println("Temperatura em Fahrenheit: $fahrenheit")
}
