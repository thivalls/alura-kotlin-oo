package bytebank.company

import bytebank.company.CollaboratorAdmin

class AdminArea {

    fun login(gerente: AuthInterface, password: String) {
        if(gerente.auth(password)) {
            println("You are welcome!!!")
        } else {
            println("Something wrong. Try again...")
        }
    }
}