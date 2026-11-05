import kotlin.math.*

fun main() {
    val a = lerInt("Entre com o valor de a: ").toDouble()
    val b = lerInt("Entre com o valor de b: ").toDouble()
    val c = lerInt("Entre com o valor de c: ").toDouble()
    if (a == 0.0) {
        println("Não é equação do segundo grau")
    } else {
        val delta = b * b - 4 * a * c
        if (delta >= 0) {
            val raizDelta = sqrt(delta)
            val x1 = (-b + raizDelta) / (2 * a)
            val x2 = (-b - raizDelta) / (2 * a)
            println("X1 = $x1")
            println("X2 = $x2")
        } else {
            println("Não há raízes reais")
        }
    }
}
