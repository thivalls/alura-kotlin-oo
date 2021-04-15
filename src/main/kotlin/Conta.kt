class Account(
    var ownerName: String,
    val numberAccount: Int,
) {
    var balance = 0.0
        private set

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