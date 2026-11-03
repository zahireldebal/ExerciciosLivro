fun main() {
    val nome = lerTexto("Digite o nome do aluno: ")
    val pr1 = lerDouble("Digite a nota da PR1: ")
    val pr2 = lerDouble("Digite a nota da PR2: ")
    val media = (pr1 + pr2) / 2
    val situacao = when {
        media >= 7 -> "Aprovado"
        media < 3 -> "Reprovado"
        else -> "em Prova Final"
    }
    println("Nome: $nome")
    println("Nota da PR1: $pr1")
    println("Nota da PR2: $pr2")
    println("Média: $media")
    println("Situação: $situacao")
}
