package Operators.exercises

fun main(args: Array<String>) {
    var isEnoughMoney = true
    var isVolkswagen = true
    var isRed = true

    var result = isEnoughMoney && isRed || !isVolkswagen
    println(result)

}