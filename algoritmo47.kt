fun main() {
    val numero = lerInt("Entre com um número de 3 dígitos: ")
    val centena = numero / 100
    val dezena = numero % 100 / 10
    val unidade = numero % 10
    val invertido = unidade * 100 + dezena * 10 + centena
    println("número: $numero")
    println("invertido: $invertido")
}
