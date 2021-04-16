package studies

import bytebank.company.Director
import bytebank.company.Employee
import bytebank.company.Manager
import bytebank.calculator.Calculator

fun main() {
    val thiago = Director("Thiago", "323232", 5000.0, "zup", 1.3)
    println("Funcionário ${thiago.name}")
    println("Bonificação de : ${thiago.bonificacao()}")
    if (thiago.auth("zup")) {
        println("Authenticated")
    } else {
        println("Non authenticated")
    }
    println("Participação de luco: ${thiago.calcPlr()}")

    println("_______________________________________")

    val andre = Manager("Andre", "323232", 1000.0, "zup")
    println("Funcionário ${andre.name}")
    println("Bonificação de : ${andre.bonificacao()}")
    if (andre.auth("zup")) {
        println("Authenticated")
    } else {
        println("Non authenticated")
    }

    println("_______________________________________")

    val amanda = Employee("Amanda", "323232", 2000.0)
    println("Funcionário ${amanda.name}")
    println("Bonificação de : ${amanda.bonificacao()}")

    println("_______________________________________")
    println("Calculando total de gastos com premiações entre funcionarios")
    val calculator = Calculator();
    calculator.regiter(thiago)
    calculator.regiter(andre)
    calculator.regiter(amanda)
    println(calculator.total)
}