fun main() {
    val a = lerDouble("Digite o 1º lado: ")
    val b = lerDouble("Digite o 2º lado: ")
    val c = lerDouble("Digite o 3º lado: ")
    if (a < b + c && b < a + c && c < a + b) {
        if (a == b && a == c) {
            println("Triângulo equilátero")
        } else if (a == b || a == c || b == c) {
            println("Triângulo isósceles")
        } else {
            println("Triângulo escaleno")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}
