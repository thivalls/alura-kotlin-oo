import bytebank.account.Account
import bytebank.account.SalaryAccount
import bytebank.account.SimpleAccount

fun main() {
    println("Bem vindos ao Bytebank!!!")

    // Creating accounts
    val andre: Account = SimpleAccount("Andre", 1000);
    val thiago: Account = SalaryAccount("Thiago", 1001);
    println("Conta de ${andre.ownerName} criada com sucesso")
    println("Conta de ${thiago.ownerName} criada com sucesso")


    // Depositar
    andre.deposit(1000.0)
    thiago.deposit(1000.0)

    // Mostrar saldo após depósito
    println("${andre.ownerName} seu depósito foi realizado com sucesso. \nSaldo atual: ${andre.balance}")
    println("${thiago.ownerName} seu depósito foi realizado com sucesso. \nSaldo atual: ${thiago.balance}")

    // Sacar
    if (andre.withDraw(100.0)) {
        println(".......Saque realizado com sucesso \n Saldo atual: ${andre.balance}")
    } else {
        println("### >>> Seu saldo é insuficiente")
    }

    if (thiago.withDraw(100.0)) {
        println(".......Saque realizado com sucesso \n Saldo atual: ${thiago.balance}")
    } else {
        println("xxxxxxx >>> Seu saldo é insuficiente")
    }

    // transferindo
    if (andre.transfer(thiago, 200.0)) {
        println(".......Transferência realizada com sucesso. \nSaldo atual: ${andre.balance}")
    } else {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
    }

    if (thiago.transfer(andre, 50.0)) {
        println(".......Transferência realizada com sucesso. \n Saldo atual: ${thiago.balance}")
    } else {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
    }

    // testando erro de mesma titularidade
    if (thiago.transfer(thiago, 50.0)) {
        println(".......Transferência realizada com sucesso.")
    } else {
        println("xxxxxxx >>> Saldo insuficiente ou transferência entre mesma titularidade")
    }
}