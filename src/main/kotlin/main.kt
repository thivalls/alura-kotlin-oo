import bytebank.company.AdminArea
import bytebank.company.Client

fun main() {
    val client = Client(name = "Thiago Valls Bertolino", document = "32779646802", password = "klapausius")

    val adminArea = AdminArea()
    adminArea.login(client, "klapausius")
}