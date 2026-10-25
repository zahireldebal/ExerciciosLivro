fun main() {
    val dividendo = lerInt("Entre com o dividendo: ")
    val divisor = lerInt("Entre com o divisor: ")
    println("dividendo: $dividendo")
    println("divisor: $divisor")
    println("quociente: ${dividendo / divisor}")
    println("resto: ${dividendo % divisor}")
}
