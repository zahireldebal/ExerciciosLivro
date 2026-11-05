fun main() {
    val saldoMedio = lerDouble("Digite o saldo médio: ")
    val credito = when {
        saldoMedio < 501 -> 0.0
        saldoMedio < 1001 -> saldoMedio * 0.3
        saldoMedio < 3001 -> saldoMedio * 0.4
        else -> saldoMedio * 0.5
    }
    if (credito > 0) {
        println("Como seu saldo médio era de R$ ${dinheiro(saldoMedio)}, seu crédito será de R$ ${dinheiro(credito)}")
    } else {
        println("Como seu saldo médio era de R$ ${dinheiro(saldoMedio)}, você não terá nenhum crédito")
    }
}
