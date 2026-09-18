package Operators.exercises

fun main(args: Array<String>) {

    println("Enter a number for a variable: ")
    var a = readLine()!!.toInt()
    println("Enter a number for b variable: ")
    var b = readLine()!!.toInt()
    println("Enter a number for c variable: ")
    var c = readLine()!!.toInt()

    println("a variable: $a")
    println("b variable: $b")
    println("c variable: $c")
    println("Now we check if addiction 2 variables is equal to ten")
    if ((a + b == 10) || (a + c == 10) || (b+c == 10) )
        println("YES")
    else
        println("NO")



}