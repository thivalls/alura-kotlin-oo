package bytebank.account

import bytebank.exception.InsufficientBalanceException
import bytebank.exception.MyCustomException

abstract class Account(
    var owner: Client,
    val numberAccount: Int,
) {
    init {
        Counter.total++
    }

    companion object Counter {
        var total: Int = 0
            private set
    }

    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        balance += value
    }

    abstract fun withDraw(value: Double): InsufficientBalanceException?

    fun transfer(toAccount: Account, value: Double): InsufficientBalanceException? {
        if(balance < value) throw InsufficientBalanceException("Insufficient balance to transfer")

        balance -= value
        toAccount.deposit(value)

        return null
    }
}