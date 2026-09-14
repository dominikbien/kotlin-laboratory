package variables.exercises

fun main(args: Array<String>) {
    var a: Double?
    var b: Double?

    a = 12.54
    b = 33.77

    println("Variable before reverse")
    println("a: ${a.toInt()}, b: ${b.toInt()}")

   a = a + b
    b = a - b
    a = a - b


    println("Variable after reverse")
    println("a: ${a.toInt()}, b: ${b.toInt()}")

}