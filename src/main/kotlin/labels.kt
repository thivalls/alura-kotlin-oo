fun sub(value1: Double, value2: Double): Double {

    return value1 - value2

}

fun main() {
    // NESTE CASO O NÚMERO VAI DAR NEGATIVO CASO SEJA PASSADO EM ORDEM DIFERENTE POIS OS PARÂMETROS NÃO PODEM MUDAR A ORDEM
    println(sub(2.0, 10.0)) // resultado -8.0


    // MAS EXISTE UMA FORMA DE MANDAR O PARÂMETRO NOMEADOS E AI PODEMOS ALTERAR A ORDEM MANUALMENTE CASO QUEIRAMOS
    println(sub(value2 = 2.0, value1 = 10.0)) // resultado 8.0
}



