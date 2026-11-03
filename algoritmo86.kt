fun main() {
    val numero = lerDouble("Digite um número: ")
    if (numero > 0) {
        println("POSITIVO")
    } else if (numero < 0) {
        println("NEGATIVO")
    } else {
        println("NULO")
    }
}
