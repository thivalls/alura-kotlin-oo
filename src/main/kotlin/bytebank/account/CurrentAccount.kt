package bytebank.account

class CurrentAccount(
    client: Client,
    numberAccount: Int
) : Account(client, numberAccount) {

    override fun withDraw(value: Double): Boolean {
        if (balance >= value) {
            balance -= (value + 0.10)
            return true
        }
        return false
    }
}