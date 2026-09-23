package Functions.exercises

fun main(args: Array<String>) {

    displayNumbers(5, 10)
}

fun displayNumbers(start: Int, end: Int) {
    for (i in start..end) {
        print("$i ")
    }
}
