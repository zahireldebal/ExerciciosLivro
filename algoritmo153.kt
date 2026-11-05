fun main() {
    val indice = lerDouble("Digite o índice de poluição: ")
    if (indice >= 0.5) {
        println("Suspender as atividades das indústrias dos grupos 1, 2 e 3")
    } else if (indice >= 0.4) {
        println("Suspender as atividades das indústrias dos grupos 1 e 2")
    } else if (indice >= 0.3) {
        println("Suspender as atividades das indústrias do grupo 1")
    } else {
        println("Índice de poluição aceitável para todos os grupos")
    }
}
