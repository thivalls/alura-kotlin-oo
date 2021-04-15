class Employee(
    val name: String,
    val document: String,
    val salary: Double,
) {
    fun bonificacao(): Double {
        return salary * 0.1
    }
}