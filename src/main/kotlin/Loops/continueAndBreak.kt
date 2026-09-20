package Loops

fun main(args: Array<String>) {
    println("CONTINUE")
    for (i in 0..10) {
        if (i == 8)
            continue
        print(i)
    }

    println("\nBREAK")
    for (i in 0..10) {
        if (i == 8)
            break

        print(i)
    }

}