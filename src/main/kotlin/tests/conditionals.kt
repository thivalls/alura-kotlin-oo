fun main() {
    var saldo = 100.0
    saldo += 221.02
    saldo = -10.0

//    if (saldo > 0.0) {
//        println("Conta positiva")
//    } else if (saldo == 0.0) {
//        println("Conta zerada")
//    } else {
//        println("conta negativa")
//    }

    when {
        saldo > 0.0 -> {
            println("Conta positiva")
        }
        saldo == 0.0 -> {
            println("Conta zerada")
        }
        else -> {
            println("conta negativa")
        }
    }
}