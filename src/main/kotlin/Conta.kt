fun main() {
    println("Bem vindo ao nosso banco")
    val account1 = Account();
    account1.ownerName = "Thiago"
    account1.numberAccount = 1;
    account1.balance = 100.0;

    val account2 = Account();
    account2.ownerName = "Thalita"
    account2.numberAccount = 2;
    account2.balance = 1000.0;

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")

    // depositando
    println("........Depositando 100 nas duas contas.......")
    deposit(account1, 100.0);
    deposit(account2, 100.0);

    println("Titular ${account1.ownerName} tem saldo de ${account1.balance}")
    println("Titular ${account2.ownerName} tem saldo de ${account2.balance}")
}

fun deposit(account: Account, value: Double) {
    account.balance += value;
}

class Account {
    var ownerName = ""
    var numberAccount = 0
    var balance = 0.0
}