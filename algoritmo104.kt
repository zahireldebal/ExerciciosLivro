fun main() {
    val nome = lerTexto("Digite o nome: ")
    val sexo = lerTexto("Digite o sexo (F/M): ")
    val idade = lerInt("Digite a idade: ")
    if ((sexo == "F" || sexo == "f") && idade < 25) {
        println("$nome ACEITA")
    } else {
        println("$nome NÃO ACEITA")
    }
}
