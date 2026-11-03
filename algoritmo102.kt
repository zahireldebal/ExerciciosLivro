fun main() {
    val numero = lerDouble("Digite um número: ")
    if (numero > 20) {
        println("Maior do que 20")
    } else if (numero == 20.0) {
        println("Igual a 20")
    } else {
        println("Menor do que 20")
    }
}
