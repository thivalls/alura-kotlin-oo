package tests

fun testIfWhenExpression() {
    var valorRecebido: Double = 0.0
//    val valorComTaxa: Double? = if (valorRecebido != null) {
//        valorRecebido + 0.1
//    } else {
//        null
//    }

    val valorComTaxa: Double? = when {
        valorRecebido != null -> {
            valorRecebido + 0.1
        }
        else -> {
            null
        }
    }

    println("Valor recebi foi $valorComTaxa")
}