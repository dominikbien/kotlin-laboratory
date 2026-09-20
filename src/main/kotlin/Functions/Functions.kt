package Functions

import kotlin.math.sqrt

fun main(args: Array<String>) {
    var result = add(6,7)
    println(result)
    writeToScreen("I have a pen")
    writeToScreen(add(13, 4).toString())
    writeToScreen()
    var velocity = calculateFreeFall(2.0, 9.81)
    println("Velocity: $velocity")
    drawTriangle()
    drawTriangle(10)
}

fun add(a: Int, b: Int): Int {
    return a + b
}
fun writeToScreen(text: String = "Default text"): Unit {
    println(text)
}
fun calculateFreeFall(h: Double, g: Double = 10.0): Double {
    return sqrt(2 * h * g)
}
fun drawTriangle(levels: Int = 5) {
    for ( i in 1..levels) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}