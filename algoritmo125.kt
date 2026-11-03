fun main() {
    val idade = lerInt("Digite a idade: ")
    if (idade > 65) {
        println("Maior de 65 anos")
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}
