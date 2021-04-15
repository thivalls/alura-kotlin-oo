fun main() {
    val thiago = Collaborator("Thiago", "323232", 1000.0, 3)
    println("Funcionário ${thiago.name}")
    println("_______________________________________")
    println("Bonificação de : ${thiago.bonificacao(3)}")
}