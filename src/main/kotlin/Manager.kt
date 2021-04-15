class Manager(
    val name: String,
    val document: String,
    val salary: Double,
    val password: String
) {
    fun bonificacao(): Double {
        return salary * 0.1
    }

    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }
}