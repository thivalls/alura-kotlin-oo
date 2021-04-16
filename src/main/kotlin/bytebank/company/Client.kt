package bytebank.company

class Client(
    val name: String,
    val document: String,
    private val password: String
): AuthInterface {
    override fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }
}