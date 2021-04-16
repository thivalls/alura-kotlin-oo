package bytebank.company

class Manager(
    name: String,
    document: String,
    salary: Double,
    password: String
): CollaboratorAdmin(name, document, salary, password), AuthInterface {
    override fun bonificacao(): Double {
        return (salary * 0.1) + salary
    }
}