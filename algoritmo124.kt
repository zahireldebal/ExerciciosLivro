fun main() {
    val a = lerDouble("Digite o 1º lado: ")
    val b = lerDouble("Digite o 2º lado: ")
    val c = lerDouble("Digite o 3º lado: ")
    if (a < b + c && b < a + c && c < a + b) {
        val quadradoMaior: Double
        val quadradoOutros: Double
        if (a > b && a > c) {
            quadradoMaior = a * a
            quadradoOutros = b * b + c * c
        } else if (b > c) {
            quadradoMaior = b * b
            quadradoOutros = a * a + c * c
        } else {
            quadradoMaior = c * c
            quadradoOutros = a * a + b * b
        }
        if (quadradoMaior == quadradoOutros) {
            println("Triângulo retângulo")
        } else if (quadradoMaior > quadradoOutros) {
            println("Triângulo obtusângulo")
        } else {
            println("Triângulo acutângulo")
        }
    } else {
        println("As medidas não formam um triângulo")
    }
}
