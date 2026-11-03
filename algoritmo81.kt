fun main() {
    val conta = lerInt("Digite o número da conta (3 dígitos): ")
    val inverso = conta.toString().reversed().toInt()
    val soma = conta + inverso
    val total = soma.toString().mapIndexed { indice, digito -> digito.digitToInt() * (indice + 1) }.sum()
    println("Dígito verificador: ${total % 10}")
}
