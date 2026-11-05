fun main() {
    val produto = lerTexto("Digite o nome do produto: ")
    val valorCompra = lerDouble("Digite o valor da compra: ")
    val lucro = when {
        valorCompra < 10 -> 0.70
        valorCompra < 30 -> 0.50
        valorCompra < 50 -> 0.40
        else -> 0.30
    }
    val valorVenda = valorCompra * (1 + lucro)
    println("Produto: $produto")
    println("Valor da venda: R$ ${dinheiro(valorVenda)}")
}
