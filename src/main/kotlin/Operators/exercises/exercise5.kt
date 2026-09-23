package Operators.exercises

fun main(args: Array<String>) {
    println("Enter a number for a variable: ")
    var a = readLine()!!.toInt()
    println("Enter a number for b variable: ")
    var b = readLine()!!.toInt()
    println("Enter a number for c variable: ")
    var c = readLine()!!.toInt()

    var max = if (a > b) a else b
    max = if (max > c) max else c
    println("Maximum value is $max")



}