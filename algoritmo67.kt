fun main() {
    val valor = lerDouble("Valor da prestação: ")
    val taxa = lerDouble("Taxa de juros (%): ")
    val tempo = lerDouble("Tempo de atraso: ")
    val prestacao = valor + (valor * (taxa / 100) * tempo)
    println("Valor da prestação em atraso: R$ ${dinheiro(prestacao)}")
}
