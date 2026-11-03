fun main() {
    println("*************")
    println("*CALCULADORA*")
    println("*************")
    println("+ para somar")
    println("- para subtrair")
    println("* para multiplicar")
    println("/ para dividir")
    val opcao = lerTexto("Digite a opção: ")
    if (opcao == "+" || opcao == "-" || opcao == "*" || opcao == "/") {
        val a = lerDouble("Digite o 1º número: ")
        val b = lerDouble("Digite o 2º número: ")
        when (opcao) {
            "+" -> println("SOMA: ${a + b}")
            "-" -> println("SUBTRAÇÃO: ${a - b}")
            "*" -> println("MULTIPLICAÇÃO: ${a * b}")
            "/" -> println("DIVISÃO: ${a / b}")
        }
    } else {
        println("OPÇÃO NÃO DISPONÍVEL!")
    }
}
