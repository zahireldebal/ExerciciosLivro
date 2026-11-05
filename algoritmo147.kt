fun main() {
    println("Pratos: 1- Vegetariano 2- Peixe 3- Frango 4- Carne")
    val prato = lerInt("Escolha o prato: ")
    println("Sobremesas: 1- Abacaxi 2- Sorvete diet 3- Mousse diet 4- Mousse de chocolate")
    val sobremesa = lerInt("Escolha a sobremesa: ")
    println("Bebidas: 1- Chá 2- Suco de laranja 3- Suco de melão 4- Refrigerante diet")
    val bebida = lerInt("Escolha a bebida: ")
    val caloriasPrato = when (prato) {
        1 -> 180
        2 -> 230
        3 -> 250
        4 -> 350
        else -> null
    }
    val caloriasSobremesa = when (sobremesa) {
        1 -> 75
        2 -> 110
        3 -> 170
        4 -> 200
        else -> null
    }
    val caloriasBebida = when (bebida) {
        1 -> 20
        2 -> 70
        3 -> 100
        4 -> 65
        else -> null
    }
    if (caloriasPrato == null || caloriasSobremesa == null || caloriasBebida == null) {
        println("Opção inválida")
    } else {
        println("Total de calorias: ${caloriasPrato + caloriasSobremesa + caloriasBebida}")
    }
}
