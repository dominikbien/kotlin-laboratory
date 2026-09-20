package Functions

fun main(args: Array<String>) {

    //single expression function

    fun add(a: Int, b: Int): Int = a + b
    fun writeToScreen(text: String = "Default text") = println(text)


    fun isPersonAdult(age: Int): Boolean = if (age < 18) true else false

}