class Director(
    name: String,
    document: String,
    salary: Double,
    val password: String
): Collaborator (name, document, salary) {
    override fun bonificacao(): Double {
        return salary * 0.4
    }

    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }

    fun plr(): Double {
        return salary * 1.3
    }
}