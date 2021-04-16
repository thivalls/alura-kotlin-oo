import bytebank.AdminArea
import bytebank.account.Account
import bytebank.account.SalaryAccount
import bytebank.account.CurrentAccount
import bytebank.company.Director
import bytebank.company.Manager

fun main() {
    val thiago = Director(name = "Thiago Valls Bertolino", document = "32779646802", salary = 5000.0, password = "klapausius", 1.3)
    val andre = Manager(name = "Thiago Valls Bertolino", document = "32779646802", salary = 5000.0, password = "trinity")

    val adminArea = AdminArea()
    adminArea.login(thiago, "klapausius");
    adminArea.login(andre, "trinity1");
}