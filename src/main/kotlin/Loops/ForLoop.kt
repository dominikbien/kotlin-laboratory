package Loops

fun main(args: Array<String>) {
    //java syntax: for (int i = 0; i <= 5; i++) {}

    for(i in 1..5) {
        print("$i ")
    }
    println("\nNEXT For option: until")
    for(i in 1 until 5) {
        print("$i ")
    }
    println("\nNEXT For option: step")
    for (i in 0..5 step 2) {
    print("$i ")
    }
    println("\nNEXT For option: downTo")
    for (i in 5 downTo 0) {
        print("$i ")
    }
}