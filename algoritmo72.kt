fun main() {
    val deposito = lerDouble("Valor do depósito: ")
    val taxa = lerDouble("Taxa de juros (%): ")
    val rendimento = deposito * taxa / 100
    val total = deposito + rendimento
    println("Rendimento: R$ ${dinheiro(rendimento)}")
    println("Total depois do rendimento: R$ ${dinheiro(total)}")
}
