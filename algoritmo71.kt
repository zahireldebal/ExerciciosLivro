fun main() {
    val hora = lerInt("Entre com a hora atual: ")
    val minuto = lerInt("Entre com os minutos: ")
    val totalMinutos = hora * 60 + minuto
    println("Até agora se passaram: $totalMinutos minutos")
}
