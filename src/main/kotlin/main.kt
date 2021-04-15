fun main() {
    val thiago = Director("Thiago", "323232", 5000.0, "zup")
    println("Funcionário ${thiago.name}")
    println("Bonificação de : ${thiago.bonificacao()}")
    if(thiago.auth("zup")) {
        println("Authenticated")
    } else {
        println("Non authenticated")
    }
    println("Participação de luco: ${thiago.plr()}")

    println("_______________________________________")

    val andre = Manager("Andre", "323232", 2000.0, "zup")
    println("Funcionário ${andre.name}")
    println("Bonificação de : ${andre.bonificacao()}")
    if(andre.auth("zup")) {
        println("Authenticated")
    } else {
        println("Non authenticated")
    }

    println("_______________________________________")

    val amanda = Employee("Amanda", "323232", 2000.0)
    println("Funcionário ${amanda.name}")
    println("Bonificação de : ${amanda.bonificacao()}")
}