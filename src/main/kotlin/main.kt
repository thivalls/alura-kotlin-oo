import bytebank.company.AdminArea
import bytebank.company.Client
import bytebank.company.Manager

fun main() {
    val client = Client(name = "André Bertolino", document = "32779646802", password = "klapausius")
    val manager = Manager(name = "Thiago Valls Bertolino", document = "32779646802",5000.0,  password = "klapausius")

    val adminArea = AdminArea()
    adminArea.login(client, "klapausius")
    adminArea.login(manager, "klapausius")
}