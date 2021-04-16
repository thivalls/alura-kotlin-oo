import bytebank.account.Account
import bytebank.account.Client
import bytebank.account.CurrentAccount

fun main() {
    println("Bytebank")

    val client = Client(name = "Thiago", document = "12121", password = "blabla")
    val account = CurrentAccount(
        client,
        1
    )

    println(account)
}