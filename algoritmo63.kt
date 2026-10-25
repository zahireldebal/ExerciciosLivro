fun main() {
    val valorHoraAula = lerDouble("Valor da hora aula: ")
    val aulas = lerInt("Número de aulas dadas no mês: ")
    val percentualInss = lerDouble("Percentual de desconto do INSS: ")
    val salarioBruto = valorHoraAula * aulas
    val desconto = salarioBruto * percentualInss / 100
    val salarioLiquido = salarioBruto - desconto
    println("Salário líquido: R$ ${dinheiro(salarioLiquido)}")
}
