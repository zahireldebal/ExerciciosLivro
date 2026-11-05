fun main() {
    val nome = lerTexto("Digite o nome: ")
    val idade = lerInt("Digite a idade: ")
    val valor = when {
        idade <= 10 -> 30.0
        idade <= 29 -> 60.0
        idade <= 45 -> 120.0
        idade <= 59 -> 150.0
        idade <= 65 -> 250.0
        else -> 400.0
    }
    println("Nome: $nome")
    println("Valor do plano: R$ ${dinheiro(valor)}")
}
