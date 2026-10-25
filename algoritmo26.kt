fun main() {
    val data = lerInt("Digite a data no formato ddmmaa: ")
    val dia = data / 10000
    val mes = data % 10000 / 100
    val ano = data % 100
    val novaData = mes * 10000 + dia * 100 + ano
    println("Data no formato mmddaa: ${"%06d".format(novaData)}")
}
