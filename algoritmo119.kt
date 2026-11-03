private fun ordenar(a: Double, b: Double, c: Double): Triple<Double, Double, Double> {
    val menor: Double
    val intermediario: Double
    val maior: Double
    if (a < b) {
        if (b < c) {
            menor = a
            intermediario = b
            maior = c
        } else if (a < c) {
            menor = a
            intermediario = c
            maior = b
        } else {
            menor = c
            intermediario = a
            maior = b
        }
    } else {
        if (a < c) {
            menor = b
            intermediario = a
            maior = c
        } else if (b < c) {
            menor = b
            intermediario = c
            maior = a
        } else {
            menor = c
            intermediario = b
            maior = a
        }
    }
    return Triple(menor, intermediario, maior)
}

fun main() {
    val a = lerDouble("Digite o 1º número: ")
    val b = lerDouble("Digite o 2º número: ")
    val c = lerDouble("Digite o 3º número: ")
    val (menor, intermediario, maior) = ordenar(a, b, c)
    println("$maior $intermediario $menor")
}
