fun main() {
    val salarioBruto = lerDouble("Digite o salário bruto: ")
    val prestacao = lerDouble("Digite o valor da prestação: ")
    if (prestacao <= salarioBruto * 0.30) {
        println("Empréstimo pode ser concedido")
    } else {
        println("Empréstimo não pode ser concedido")
    }
}
