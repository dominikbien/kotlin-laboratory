package statements

fun main(args: Array<String>) {

    var number = 4
    when (number) {
        0 -> println("zero")
        1 -> println("one")
        2 -> println("two")
        3 -> {
            println("My favourite number....")
            println("3!!!!!!!!!!!!!!")
        }
        in 4..9 -> println("Number is between 4 and 9")
        else -> println("I do not know")
    }

    var numberInWord = when (number) {
        1 -> "zero"
        2 -> "one"
        3 -> "two"
        -1,-2,-3 -> "Negative number"
        else -> "I do not know"
    }
    println(numberInWord)

    var a = 5
    var b =10
    when {
        a > b -> println("a is greater than b")
        a < b -> println("a is less than b")
        else -> println("a is equal to b")
    }

}