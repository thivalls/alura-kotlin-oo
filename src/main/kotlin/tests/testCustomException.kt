package tests

import bytebank.exception.MyCustomException

fun testCustomException() {
    try {
        throw MyCustomException()
    } catch (e: MyCustomException) {
        println("meu erro foi pego no catch")
    }

    println("após exception must not be showed")
}