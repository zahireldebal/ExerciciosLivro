import kotlin.math.*

fun main() {
    val graus = lerDouble("Entre com o ângulo em graus: ")
    val radianos = graus * PI / 180
    println("seno: ${sin(radianos)}")
    println("co-seno: ${cos(radianos)}")
    println("tangente: ${tan(radianos)}")
    println("secante: ${1 / cos(radianos)}")
    println("co-secante: ${1 / sin(radianos)}")
    println("co-tangente: ${1 / tan(radianos)}")
}
