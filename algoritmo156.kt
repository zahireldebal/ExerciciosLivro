fun main() {
    val dia = lerInt("Digite o dia: ")
    val mes = lerInt("Digite o mês: ")
    val ano = lerInt("Digite o ano: ")
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
