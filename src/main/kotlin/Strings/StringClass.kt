package Strings

fun main(args: Array<String>) {
    var text: String = "Text variable"
    var textLong = "Longer text variable"
    var textTogether = text + " " + textLong
    var number = 100


    println(textTogether + " " + number)
    println("Text length : " + text.length)
    println("Text substring(1,3): " + text.substring(1, 3))
    println("Text startsWith(A) " + text.startsWith("A"))
    println("Text[2]: ${text[2]}")


    for (charater in text) {
    println(charater)
    }
}