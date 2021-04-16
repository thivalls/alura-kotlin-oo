package bytebank.account

abstract class Account(
    var client: Client,
    val numberAccount: Int,
) {
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