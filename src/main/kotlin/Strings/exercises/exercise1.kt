package Strings.exercises

fun main(args: Array<String>) {
    var name: String? = "Dominik"

    if (name == null)
        println("I have a first apple, you have a second apple")
    else
        println("I have a second apple, $name has second apple")
}