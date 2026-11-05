fun main() {
    val altura = lerDouble("Entre com a altura: ")
    val sexo = lerTexto("Entre com o sexo (M/F): ")
    if (sexo.lowercase() == "m") {
        println("Peso ideal: ${72.7 * altura - 58}")
    } else if (sexo.lowercase() == "f") {
        println("Peso ideal: ${62.1 * altura - 44.7}")
    } else {
        println("Sexo inválido")
    }
}
