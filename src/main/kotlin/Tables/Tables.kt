package Tables

fun main(args: Array<String>) {
    //java syntax: int[] tableInt = new int[3]

    var tableInt: IntArray = IntArray(3)
    tableInt[0] = 1
    tableInt[1] = 2
    tableInt[2] = 3

    println(tableInt[2])

    //java syntax: ArrayInt = {5, 15, -2};
    var ArrayInt: IntArray = intArrayOf(5, 12, 33, 1902)

    println(ArrayInt.size)

    ArrayInt.set(2, 123)
    println(ArrayInt[2])
    println(ArrayInt.get(3))

    var ArrayObjects: Array<String> = arrayOf("One", "Two", "Three")

    println(ArrayObjects[0])
    println(ArrayObjects[1])
    println(ArrayObjects[2])

    // multidimensional tables

    var table1 = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(8, 9, 10),
        intArrayOf(10, 11, 12),
    )

    println(table1[0][0])
    println(table1[1][2])
    println(table1[3][1])
    println(table1[2][2])




}