package Loops.exercises

fun main(args: Array<String>) {
    val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
    var count = 0

    for (element in tab) {
        if (element %2 == 0)
        {
            count++
            continue
        }
    }
    println("Amount of even numbers: $count")

}