fun main() {
    val tempo = lerDouble("Tempo gasto na viagem (horas): ")
    val velocidadeMedia = lerDouble("Velocidade média (km/h): ")
    val distancia = tempo * velocidadeMedia
    val litrosUsados = distancia / 12
    println("Velocidade média: $velocidadeMedia")
    println("Tempo gasto: $tempo")
    println("Distância percorrida: $distancia")
    println("Litros utilizados: $litrosUsados")
}
