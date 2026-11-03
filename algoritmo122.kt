fun main() {
    val a = lerDouble("Digite o 1º lado: ")
    val b = lerDouble("Digite o 2º lado: ")
    val c = lerDouble("Digite o 3º lado: ")
    if (a < b + c && b < a + c && c < a + b) {
        println("Os valores podem ser lados de um triângulo")
    } else {
        println("Os valores não podem ser lados de um triângulo")
    }
}
