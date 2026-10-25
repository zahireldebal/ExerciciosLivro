import kotlin.math.*

fun main() {
    val a = lerDouble("Entre com o lado a: ")
    val b = lerDouble("Entre com o lado b: ")
    val c = lerDouble("Entre com o lado c: ")
    println("diagonal: ${sqrt(a * a + b * b + c * c)}")
}
