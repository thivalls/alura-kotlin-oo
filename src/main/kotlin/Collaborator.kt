open class Collaborator(
    val name: String,
    val document: String,
    val salary: Double,
) {
    open fun bonificacao(): Double {
        return salary * 0.1
    }
}