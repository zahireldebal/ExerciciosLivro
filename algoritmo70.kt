fun main() {
    val gasto = lerDouble("Valor gasto no restaurante: ")
    val total = gasto * 1.10
    println("Valor total com a gorjeta: R$ ${dinheiro(total)}")
}
