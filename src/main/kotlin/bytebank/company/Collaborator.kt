package bytebank.company

abstract class Collaborator(
    val name: String,
    val document: String,
    val salary: Double,
) {
    abstract fun bonificacao(): Double
}