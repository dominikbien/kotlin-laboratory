package statements

fun main(args: Array<String>) {
    var number = 100

    if (number > 0)
        println("Positive number")
    else if (number == 0)
        println("number is zero")
    else
        println("Negative number")

    var isEven: Boolean
    isEven = if (number % 2 == 0) true else false
    println(isEven)

    isEven = if (number % 2 == 0)
    {
        println("Even number")
        true
    }
    else {
        println("Odd number")
        false
    }



}