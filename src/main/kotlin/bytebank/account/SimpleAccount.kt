package bytebank.account

class SimpleAccount(
    ownerName: String,
    numberAccount: Int
) : Account(ownerName, numberAccount) {

    override fun withDraw(value: Double): Boolean {
        if (balance >= value) {
            balance -= (value + 0.10)
            return true
        }
        return false
    }
}