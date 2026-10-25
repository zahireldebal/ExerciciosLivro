fun main() {
    val salarioMinimo = lerDouble("Entre com o salário mínimo: ")
    val quilowatts = lerDouble("Entre com a quantidade de quilowatts gasta: ")
    val valorQuilowatt = salarioMinimo / 7 / 100
    val valorPagar = valorQuilowatt * quilowatts
    val valorComDesconto = valorPagar * 0.9
    println("Valor de cada quilowatt: R$ ${dinheiro(valorQuilowatt)}")
    println("Valor a ser pago: R$ ${dinheiro(valorPagar)}")
    println("Valor com desconto de 10%: R$ ${dinheiro(valorComDesconto)}")
}
