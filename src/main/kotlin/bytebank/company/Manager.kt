package bytebank.company

class Manager(
    name: String,
    document: String,
    salary: Double,
    val password: String
): Collaborator(name, document, salary) {
    override fun bonificacao(): Double {
        return (salary * 0.1) + salary
    }

    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }
}