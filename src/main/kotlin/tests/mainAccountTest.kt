import bytebank.account.*
import bytebank.exception.InsufficientBalanceException

fun mainAccountTest() {
    println("Bem vindos ao Bytebank!!!")

    // Creating accounts
    val andre: Account = CurrentAccount(Client("Thiago", "","blabla", ClientAddress("qualquer rua", "qualquer cidade", "123")), 1000);
    val thiago: Account = SalaryAccount(Client("Andre", "","blabla", ClientAddress("qualquer rua", "qualquer cidade", "123")), 1001);
    println("Conta de ${andre.owner.name} criada com sucesso")
    println("Conta de ${thiago.owner.name} criada com sucesso")


    // Depositar
    andre.deposit(1000.0)
    thiago.deposit(1000.0)

    // Mostrar saldo após depósito
    println("${andre.owner.name} seu depósito foi realizado com sucesso. \nSaldo atual: ${andre.balance}")
    println("${thiago.owner.name} seu depósito foi realizado com sucesso. \nSaldo atual: ${thiago.balance}")

    // Sacar
    try {
        andre.withDraw(100.0)
        println(".......Saque realizado com sucesso \n Saldo atual: ${andre.balance}")
    } catch (e: InsufficientBalanceException) {
        println("### >>> Seu saldo é insuficiente")
        //e.printStackTrace()
    }


    try {
        thiago.withDraw(100.0)
        println(".......Saque realizado com sucesso \n Saldo atual: ${thiago.balance}")
    } catch (e: InsufficientBalanceException) {
        println("xxxxxxx >>> Seu saldo é insuficiente")
        //e.printStackTrace()
    }

    // transferindo
    try {
        andre.transfer(thiago, 4200.0)
        println(".......Transferência realizada com sucesso. \nSaldo atual: ${andre.balance}")
    } catch(e: InsufficientBalanceException) {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
        //e.printStackTrace()
    }

    try {
        thiago.transfer(andre, 50.0)
        println(".......Transferência realizada com sucesso. \n Saldo atual: ${thiago.balance}")
    } catch(e: InsufficientBalanceException) {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
       // e.printStackTrace()
    }

    // testando erro de mesma titularidade
    try {
        thiago.transfer(thiago, 50.0)
        println(".......Transferência realizada com sucesso.")
    } catch (e: InsufficientBalanceException) {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
        e.printStackTrace()
    }

}