package bytebank.company

abstract class CollaboratorAdmin(
    val name: String,
    val document: String,
    val salary: Double,
    val password: String
) {
    abstract fun bonificacao(): Double

    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }
}