package ExtensionFunctions

fun main(args: Array<String>) {
    val wall = Wall()
    wall.paint()
    wall.destroy()

    val text = "Hello World!"
//    println(removeFirstLetter(text))
    println(text.removeFirstLetter())
    wall.showText("Hello Kotlin")
}
fun Wall.showText(text: String) {
    println(text)
}

fun Wall.destroy() {
    println("BOOM")
}

//fun removeFirstLetter(text: String): String {
//    return text.substring(1)
//}
fun String.removeFirstLetter() : String {
    return this.substring(1)
}