package Loops.exercises

fun main(args: Array<String>) {
    val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)

    //insertion sort
    var n = tab.size
    for (i in 1 until n) {
        val key = tab[i]
        var j = i - 1
        while (j >= 0 && tab[j] > key) {
            tab[j + 1] = tab[j]
            j--
        }
        tab[j + 1] = key
    }

    for (element in tab.indices) {

        print("${tab[element]} ")

    }

}