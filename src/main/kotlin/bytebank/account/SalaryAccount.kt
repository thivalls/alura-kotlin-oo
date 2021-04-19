package bytebank.account

import bytebank.exception.InsufficientBalanceException

class SalaryAccount(
    client: Client,
    numberAccount: Int
) : Account(client, numberAccount) {

    override fun withDraw(value: Double): InsufficientBalanceException? {
        if (balance < value) throw InsufficientBalanceException("Insufficient balance for this operation")
            balance -= value
            return null
    }
}