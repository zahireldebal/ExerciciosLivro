fun main() {
    val anoAtual = lerInt("Entre com o ano atual: ")
    val anoNascimento = lerInt("Entre com o ano de nascimento: ")
    if (anoNascimento > anoAtual) {
        println("Ano de nascimento inválido")
    } else {
        println("Idade: ${anoAtual - anoNascimento}")
    }
}
