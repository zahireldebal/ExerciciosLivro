fun main() {
    val salario = lerDouble("Digite o salário: ")
    val percentual = when {
        salario <= 600 -> 0.0
        salario <= 1200 -> 20.0
        salario <= 2000 -> 25.0
        else -> 30.0
    }
    if (percentual == 0.0) {
        println("Isento de desconto do INSS")
    } else {
        val desconto = salario * percentual / 100
        println("Desconto do INSS ($percentual%): R$ ${dinheiro(desconto)}")
    }
}
