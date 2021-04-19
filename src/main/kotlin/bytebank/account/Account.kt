package bytebank.account

var counter: Int = 0;

abstract class Account(
    var owner: Client,
    val numberAccount: Int,
) {
    init {
        counter++
    }

    var balance = 0.0
        protected set

    fun deposit(value: Double) {
        balance += value
    }

    abstract fun withDraw(value: Double): Boolean

    fun transfer(toAccount: Account, value: Double): Boolean {
        if(toAccount.numberAccount == numberAccount) return false;

        if (balance >= value) {
            balance -= value
            toAccount.deposit(value)
            return true
        }
        return false
    }
}