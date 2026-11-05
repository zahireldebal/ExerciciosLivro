fun main() {
    val idade = lerInt("Digite a idade: ")
    val classe = when {
        idade < 16 -> "Não-eleitor"
        idade < 18 -> "Eleitor facultativo"
        idade <= 65 -> "Eleitor obrigatório"
        else -> "Eleitor facultativo"
    }
    println(classe)
}
