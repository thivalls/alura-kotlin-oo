package bytebank.company

class Employee(
    name: String,
    document: String,
    salary: Double,
) : Collaborator(
    name,
    document,
    salary,
) {
    override fun bonificacao(): Double {
        return salary * 0.1
    }
}