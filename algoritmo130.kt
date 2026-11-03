fun main() {
    val valorCompra = lerDouble("Digite o valor da compra do produto: ")
    val lucro = if (valorCompra < 20) 0.45 else 0.30
    val valorVenda = valorCompra * (1 + lucro)
    println("Valor da venda: R$ ${dinheiro(valorVenda)}")
}
