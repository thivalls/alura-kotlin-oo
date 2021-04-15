package bytebank.account

import bytebank.Account

class SalaryAccount(
    ownerName: String,
    numberAccount: Int
) : Account(ownerName, numberAccount) {

    override fun withDraw(value: Double): Boolean {
        if (balance >= value) {
            balance -= value
            return true
        }
        return false
    }
}