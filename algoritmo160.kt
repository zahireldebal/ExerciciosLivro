fun main() {
    val x = lerDouble("Digite o valor de x: ")
    val y = if (x <= 1) {
        1.0
    } else if (x <= 2) {
        2.0
    } else if (x <= 3) {
        x * x
    } else {
        x * x * x
    }
    println("Valor de f(x): $y")
}
