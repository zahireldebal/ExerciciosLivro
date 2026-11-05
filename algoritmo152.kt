fun main() {
    val peso = lerDouble("Digite o peso em kg: ")
    val idade = lerInt("Digite a idade: ")
    if (peso < 5) {
        println("Não pode tomar o remédio por causa do peso. Consulte um médico.")
    } else {
        val miligramas = if (idade >= 12) {
            if (peso >= 60) 1000 else 875
        } else {
            when {
                peso <= 9 -> 125
                peso <= 16 -> 250
                peso <= 24 -> 375
                peso <= 30 -> 500
                else -> 750
            }
        }
        val gotas = miligramas / 25
        println("Tomar $gotas gotas por dose ($miligramas mg)")
    }
}
