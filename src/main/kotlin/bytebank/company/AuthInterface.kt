package bytebank.company

interface AuthInterface {
    fun auth(password: String): Boolean
}