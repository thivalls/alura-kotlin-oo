package bytebank.company

class Director(
    name: String,
    document: String,
    salary: Double,
    password: String,
    val plr: Double
): CollaboratorAdmin(name, document, salary, password) {
    override fun bonificacao(): Double {
        return (salary * 0.1) + salary + calcPlr()
    }

    fun calcPlr(): Double {
        return salary * plr
    }
}