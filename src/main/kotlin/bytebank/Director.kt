package bytebank

class Director(
    name: String,
    document: String,
    salary: Double,
    val password: String,
    val plr: Double
): Collaborator(name, document, salary) {
    override fun bonificacao(): Double {
        return super.bonificacao() + salary + calcPlr()
    }

    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }

    fun calcPlr(): Double {
        return salary * plr
    }
}