fun main() {
    println("LOOPS!!!")
    myPrintLn()

    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }

    myPrintLn()

    val items1 = listOf("apple", "banana", "kiwifruit")
    for (index in items1.indices) {
        println("item at $index is ${items[index]}")
    }

    myPrintLn()

    val items2 = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items2.size) {
        println("item at $index is ${items2[index]}")
        index++
    }

    myPrintLn()

    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }



}

fun myPrintLn() {
    println(" ---------------------------------- ")
}