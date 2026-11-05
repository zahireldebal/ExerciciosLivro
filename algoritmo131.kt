fun main() {
    val nome = lerTexto("Digite o nome do aluno: ").trim()
    if (nome.isEmpty()) {
        println("NOME INVÁLIDO")
    } else {
        when (nome[0].uppercaseChar()) {
            in 'A'..'K' -> println("$nome - sala 101 - bloco F")
            in 'L'..'N' -> println("$nome - sala 102 - bloco F")
            in 'O'..'Z' -> println("$nome - sala 103 - bloco F")
            else -> println("NOME INVÁLIDO")
        }
    }
}
