package bytebank.calculator

import bytebank.Collaborator
import bytebank.Director
import bytebank.Employee
import bytebank.Manager

class Calculator {
    var total = 0.0
        private set

    fun regiter(collaborator: Collaborator) {
        total += collaborator.bonificacao()
    }

//    fun regiter(manager: Manager) {
//        total += manager.bonificacao()
//    }
//
//    fun regiter(director: Director) {
//        total += director.bonificacao()
//    }
}