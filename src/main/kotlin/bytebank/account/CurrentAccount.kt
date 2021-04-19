package bytebank.account

import bytebank.exception.InsufficientBalanceException

class CurrentAccount(
    client: Client,
    numberAccount: Int
) : Account(client, numberAccount) {

    override fun withDraw(value: Double): InsufficientBalanceException? {
        if(balance < (value + 0.10)) {
            throw InsufficientBalanceException("Insufficient balance for this operation")
        }
        balance -= value + 0.10
        return null
    }
}