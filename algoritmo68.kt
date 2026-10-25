fun main() {
    var a = lerInt("Digite o valor de A: ")
    var b = lerInt("Digite o valor de B: ")
    val auxiliar = a
    a = b
    b = auxiliar
    println("A = $a")
    println("B = $b")
}
