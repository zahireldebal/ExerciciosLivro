fun main() {
    val raio = lerDouble("Entre com o raio da lata: ")
    val altura = lerDouble("Entre com a altura da lata: ")
    val volume = 3.14159 * raio * raio * altura
    println("Volume da lata: $volume")
}
