package statements

fun main(args: Array<String>) {
    //if shorter
    var name: String? = "Dominik"
    var initial: Char

    initial = name?.first() ?: ' '

    println(initial)

}