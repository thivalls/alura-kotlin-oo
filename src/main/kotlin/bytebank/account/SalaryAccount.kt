package bytebank.account

class SalaryAccount(
    client: Client,
    numberAccount: Int
) : Account(client, numberAccount) {

    override fun withDraw(value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            return true
        }
        return false
    }
}