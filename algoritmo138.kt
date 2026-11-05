fun main() {
    val meses = listOf(
        "janeiro", "fevereiro", "março", "abril", "maio", "junho",
        "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
    )
    val numero = lerInt("Digite um número entre 1 e 12: ")
    if (numero >= 1 && numero <= 12) {
        println("Mês: ${meses[numero - 1]}")
    } else {
        println("Não existe mês com este número")
    }
}
