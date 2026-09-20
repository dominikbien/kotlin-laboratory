package Strings

fun main(args: Array<String>) {
    var text1 = "Text2"
    var text2 = "Text2"
    var text3 = text1 + text2
    println(text3)

    println("Text templates")
    var textTemplate =  "${text1}${text2}"
    println(textTemplate)

}