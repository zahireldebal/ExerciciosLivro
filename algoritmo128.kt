fun main() {
    val verbo = lerTexto("Digite um verbo no infinitivo: ").trim().lowercase()
    if (verbo.length < 2 || !verbo.endsWith("r")) {
        println("O verbo não está no infinitivo")
    } else {
        when (verbo[verbo.length - 2]) {
            'a' -> println("Verbo da 1ª conjugação")
            'e', 'o' -> println("Verbo da 2ª conjugação")
            'i' -> println("Verbo da 3ª conjugação")
            else -> println("Não existe verbo com essa terminação")
        }
    }
}
