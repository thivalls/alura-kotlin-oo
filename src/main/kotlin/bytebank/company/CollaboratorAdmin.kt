package bytebank.company

abstract class CollaboratorAdmin (
    name: String,
    document: String,
    salary: Double,
    val password: String
): Collaborator(name, document, salary) {
    fun auth(password: String): Boolean {
        if(this.password == password) return true
        return false
    }
}