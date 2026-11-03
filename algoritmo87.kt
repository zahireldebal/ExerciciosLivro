fun main() {
    val resposta = lerTexto("Qual a capital do Brasil? ")
    if (resposta == "BRASÍLIA" || resposta == "Brasília") {
        println("PARABÉNS!")
    } else if (resposta.lowercase() == "brasília" || resposta.lowercase() == "brazília") {
        println("CERTO! Mas atenção para grafia: Brasília ou BRASÍLIA")
    } else {
        println("ERRADO! ESTUDE MAIS!")
    }
}
