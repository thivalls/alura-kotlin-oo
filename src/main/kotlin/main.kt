fun main() {
    val thiago = Manager("Thiago", "323232", 5000.0, "zup")
    println("Funcionário ${thiago.name}")
    println("Bonificação de : ${thiago.bonificacao()}")
    if(thiago.auth("zup1")) {
        println("Authenticated")
    } else {
        println("Non authenticated")
    }

    println("_______________________________________")

    val amanda = Employee("Amanda", "323232", 2000.0)
    println("Funcionário ${amanda.name}")
    println("Bonificação de : ${amanda.bonificacao()}")
}