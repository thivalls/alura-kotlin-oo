package bytebank.exception

class InsufficientBalanceException(
    override val message: String = ""
): Exception(message) {
}