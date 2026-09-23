package Operators.exercises

fun main(args: Array<String>) {
    val x = false
    val y = true
    val z = false

    val result = !(x and y) || z
    println("Result is $result")
}