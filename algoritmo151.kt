fun main() {
    val nome = lerTexto("Digite o nome do paciente: ")
    val peso = lerDouble("Digite o peso em kg: ")
    val altura = lerDouble("Digite a altura em metros: ")
    val imc = peso / (altura * altura)
    val faixa = when {
        imc < 20 -> "abaixo do peso"
        imc <= 25 -> "normal"
        imc <= 30 -> "excesso de peso"
        imc <= 35 -> "obesidade"
        else -> "obesidade mórbida"
    }
    println("Paciente: $nome")
    println("Faixa de risco: $faixa")
}
