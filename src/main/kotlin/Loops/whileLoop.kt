package Loops

fun main(args: Array<String>) {
    var i = 0
    println("WHILE")
    while (i < 10) {
        println(i)
        i++
    }
    println("DO WHILE")
    i = 0
    do {
        println(i)
        i++
    }while (i < 10)
}