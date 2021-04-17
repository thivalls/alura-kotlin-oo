import bytebank.account.Account
import bytebank.account.Client
import bytebank.account.ClientAddress
import bytebank.account.CurrentAccount

fun main() {
    println("Bytebank")

    val address = ClientAddress(street = "qualquer rua", city = "São Carlos", number = "999")
    val client = Client(name = "Thiago", document = "12121", password = "blabla", address)
    val account = CurrentAccount(
        client,
        1
    )

    println("Cidade do cliente: ${client.address.city}")
}