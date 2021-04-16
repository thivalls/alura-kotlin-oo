package tests

import bytebank.company.AdminArea
import bytebank.company.Director
import bytebank.company.Manager

fun testAuthentication() {
    val thiago = Director(name = "Thiago Valls Bertolino", document = "32779646802", salary = 5000.0, password = "klapausius", 1.3)
    val andre = Manager(name = "Thiago Valls Bertolino", document = "32779646802", salary = 5000.0, password = "trinity")

    val adminArea = AdminArea()
    adminArea.login(thiago, "klapausius")
    adminArea.login(andre, "trinity")
}