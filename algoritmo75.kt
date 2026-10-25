fun main() {
    val peso = lerInt("Entre com seu peso (só a parte inteira): ")
    val pesoGramas = peso * 1000
    val novoPeso = pesoGramas * 1.12
    println("Peso em gramas: $pesoGramas")
    println("Novo peso em gramas: $novoPeso")
}
