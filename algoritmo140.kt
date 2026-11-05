fun main() {
    val nome = lerTexto("Digite o primeiro nome: ").trim()
    val conta = lerDouble("Digite o valor da conta: ")
    val inicial = if (nome.isEmpty()) ' ' else nome[0].uppercaseChar()
    if (inicial == 'A' || inicial == 'D' || inicial == 'M' || inicial == 'S') {
        println("$nome, valor da conta com desconto: R$ ${dinheiro(conta * 0.7)}")
    } else {
        println("Que pena. Nesta semana o desconto não é para seu nome; mas continue nos prestigiando que sua vez chegará")
    }
}
