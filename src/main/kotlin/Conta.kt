fun main() {
    println("Bem vindo ao nosso banco")
    val account1 = Account()
    account1.ownerName = "Thiago"
    account1.numberAccount = 1
    account1.balance = 100.0

    val account2 = Account()
    account2.ownerName = "Thalita"
    account2.numberAccount = 2
    account2.balance = 1000.0

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // depositando
    println("........Depositando 100 nas duas contas.......")
    account1.deposit(100.0)
    account2.deposit(100.0)

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // sacando
    println("........Sacando 1000 nas duas contas.......")
    account1.withDraw(1000.0)
    account2.withDraw(1000.0)

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // transferindo
    println("........Transferindo 200 da conta 1 para a conta 2.......")
    account1.transfer(account2, 200.0)
    println("........Transferindo 300 da conta 2 para a conta 1.......")
    account2.transfer(account1, 300.0)

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")
}


class Account {
    var ownerName = ""
    var numberAccount = 0
    var balance = 0.0

    fun deposit(value: Double) {
        balance += value
    }

    fun withDraw(value: Double) {
        if (balance >= value) {
            balance -= value
        } else {
            println("${ownerName} infelizmente seu saldo é insuficiente para realizar este saque")
        }
    }


    fun transfer(account: Account, value: Double) {
        if (balance >= value) {
            balance -= value
            account.balance += value
        } else {
            println("${ownerName} infelizmente seu saldo é insuficiente para realizar esta transferência")
        }
    }
}