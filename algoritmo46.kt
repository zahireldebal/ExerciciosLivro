fun main() {
    val saldo = lerDouble("Entre com o saldo da aplicação: ")
    val novoSaldo = saldo * 1.01
    println("Novo saldo: R$ ${dinheiro(novoSaldo)}")
}
