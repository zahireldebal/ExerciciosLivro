fun main() {
    val data = lerInt("Digite a data no formato ddmmaaaa: ")
    val dia = data / 1000000
    val mes = data % 1000000 / 10000
    val ano = data % 10000
    val diasNoMes = when (mes) {
        4, 6, 9, 11 -> 30
        2 -> if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) 29 else 28
        1, 3, 5, 7, 8, 10, 12 -> 31
        else -> 0
    }
    if (ano >= 1 && diasNoMes > 0 && dia >= 1 && dia <= diasNoMes) {
        println("DATA VÁLIDA")
    } else {
        println("DATA INVÁLIDA")
    }
}
