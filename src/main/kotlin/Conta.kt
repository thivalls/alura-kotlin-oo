fun main() {
    println("Bem vindo ao nosso banco")
    val account1 = Account("Thiago", 1)
    val account2 = Account("Thalita", 2)

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // depositando
    println("........Depositando 100 nas duas contas.......")
    account1.deposit(100.0)
    account2.deposit(1000.0)

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // sacando
    println("........Sacando 1000 nas duas contas.......")

    if (!account1.withDraw(1000.0)) {
        println("${account1.ownerName} infelizmente seu saldo é insuficiente para realizar este saque")
    }

    if (!account2.withDraw(1000.0)) {
        println("${account2.ownerName} infelizmente seu saldo é insuficiente para realizar este saque")
    }

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // transferindo
    println("........Transferindo 200 da conta 1 para a conta 2.......")
    if (!account1.transfer(account2, 100.0)) {
        println("${account1.ownerName} infelizmente seu saldo é insuficiente para realizar esta transferência")
    }
    println("........Transferindo 300 da conta 2 para a conta 1.......")
    if (!account2.transfer(account1, 100.0)) {
        println("${account2.ownerName} infelizmente seu saldo é insuficiente para realizar esta transferência")
    }

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")
}


class Account(
    var ownerName: String,
    val numberAccount: Int,
) {
    var balance = 0.0
        private set

//    QUANDO FOR NECESSÁRIO EXECUTAR ALGUMA AÇÃO NO MOMENTO DA CONSTRUÇÃO DO OBJETO
//    init {
//        println("Estou testando o método init")
//    }

    fun deposit(value: Double) {
        balance += value
    }

    fun withDraw(value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            return true
        }
        return false
    }


    fun transfer(toAccount: Account, value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            toAccount.deposit(value)
            return true
        }
        return false
    }
}