package Loops

fun main(args: Array<String>) {

    var table1 = intArrayOf(590, 67, 23, 122, 33541, 23)
    for (element in table1) {
    print("$element ")
    }
    println("\nOption: table index")
    for (i in 0 until table1.size)
        print("${table1[i]} ")

    println("\nOption: table.indices")
    for (i in table1.indices) {
        print("${table1[i]} ")
    }

}