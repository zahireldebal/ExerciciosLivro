import kotlin.math.*

fun main() {
    val numero = lerDouble("Entre com um número real: ")
    val parteInteira = numero.toInt()
    val parteFracionaria = numero - parteInteira
    val arredondado = numero.roundToInt()
    println("Parte inteira: $parteInteira")
    println("Parte fracionária: $parteFracionaria")
    println("Número arredondado: $arredondado")
}
