package tests

import bytebank.account.*

fun testObjects() {
    val address = ClientAddress(street = "qualquer rua", city = "São Carlos", number = "999")
    val client = Client(name = "Thiago", document = "12121", password = "blabla", address)
    val client1 = Client(name = "Thomas", document = "12121", password = "blabla", address)
    val account = CurrentAccount(
        client,
        1
    )

    val account1 = SalaryAccount(
        client1,
        1
    )

    println("Cidade do cliente: ${client.address.city}")
    println("Contas criadas no dia: ${Account.Counter.total}")
}