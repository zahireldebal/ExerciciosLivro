fun main() {
    val valor = lerDouble("Entre com o valor do produto: ")
    val novoValor = valor - valor * 9 / 100
    println("Novo valor: R$ ${dinheiro(novoValor)}")
}
