fun main() {
    val numero = lerInt("Digite um número entre 0 e 60: ")
    println("Sucessor: ${(numero + 1) % 61}")
}
