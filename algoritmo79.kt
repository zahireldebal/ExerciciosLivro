import kotlin.math.*

fun main() {
    val aplicacao = lerDouble("Digite o valor da aplicação mensal: ")
    val taxa = lerDouble("Digite a taxa (ex.: 0.01): ")
    val meses = lerInt("Digite o número de meses: ")
    val acumulado = aplicacao * ((1 + taxa).pow(meses) - 1) / taxa
    println("Valor acumulado: R$ ${dinheiro(acumulado)}")
}
