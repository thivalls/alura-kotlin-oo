package bytebank.calculator

import bytebank.company.Collaborator
import bytebank.company.CollaboratorAdmin

class Calculator {
    var total = 0.0
        private set

    fun regiter(collaborator: Collaborator) {
        total += collaborator.bonificacao()
    }

    fun regiter(collaborator: CollaboratorAdmin) {
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