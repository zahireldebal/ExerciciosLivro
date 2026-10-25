fun main() {
    val quantidade = lerInt("Digite a quantidade de fitas: ")
    val valorAluguel = lerDouble("Digite o valor do aluguel: ")
    val faturamentoAnual = quantidade / 3.0 * valorAluguel * 12
    val multasMensais = quantidade / 3.0 / 10 * valorAluguel * 0.1
    val quantidadeFinal = quantidade - quantidade * 0.02 + quantidade / 10.0
    println("Faturamento anual: R$ ${dinheiro(faturamentoAnual)}")
    println("Multas mensais: R$ ${dinheiro(multasMensais)}")
    println("Quantidade de fitas no final do ano: $quantidadeFinal")
}
