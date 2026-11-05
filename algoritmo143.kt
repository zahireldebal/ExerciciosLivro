fun main() {
    val palavra = lerTexto("Digite uma palavra: ").trim()
    val tamanho = palavra.length
    if (tamanho == 0) {
        println("Palavra vazia")
    } else if (tamanho % 2 == 0) {
        val centrais = palavra.substring(tamanho / 2 - 1, tamanho / 2 + 1)
        if (centrais == "rr" || centrais == "ss") {
            println("É rr ou ss")
        } else {
            println("Não é rr nem ss")
        }
    } else {
        val central = palavra[tamanho / 2]
        if (central in "aeiou") {
            println("É vogal")
        } else {
            println("Não é vogal")
        }
    }
}
