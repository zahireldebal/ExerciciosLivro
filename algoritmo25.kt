fun main() {
    val data = lerInt("Digite a data no formato ddmmaa: ")
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    println("Dia: $dia")
    println("Mês: $mes")
    println("Ano: $ano")
}
