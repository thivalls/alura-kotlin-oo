class Collaborator(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: Int // 1 operador, 2 gerente, 3 diretor
) {
    fun bonificacao(type: Int): Double {
        when(type) {
            1 -> {
                return salary * 0.1
            }
            2 -> {
                return salary * 0.2
            }
            3 -> {
                return salary * 0.3
            }
            else -> {
                return salary * 0.1
            }
        }
    }
}