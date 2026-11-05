import kotlin.math.*

fun main() {
    val graus = lerDouble("Digite o ângulo em graus: ")
    val normalizado = ((graus % 360) + 360) % 360
    val radianos = graus * PI / 180
    val quadrantePar = (normalizado > 90 && normalizado <= 180) || normalizado > 270
    if (quadrantePar) {
        println("Seno: ${sin(radianos)}")
    } else {
        println("Co-seno: ${cos(radianos)}")
    }
}
