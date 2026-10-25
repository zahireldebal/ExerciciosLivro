fun main() {
    val salarioMinimo = lerDouble("Entre com o valor do salário mínimo: ")
    val salario = lerDouble("Entre com o valor do salário: ")
    println("Quantidade de salários mínimos: ${salario / salarioMinimo}")
}
