fun main() {
    val numero = lerDouble("Digite um número: ")
    if (numero == 5.0) {
        println("Igual a 5")
    } else if (numero == 200.0) {
        println("Igual a 200")
    } else if (numero == 400.0) {
        println("Igual a 400")
    } else if (numero >= 500 && numero <= 1000) {
        println("Está no intervalo entre 500 e 1000, inclusive")
    } else {
        println("Fora dos escopos anteriores")
    }
}
