package Operators

fun main(args: Array<String>) {
    var a = 5
    var b = 10


    //relational operations
    println("$a == $b = ${a == b}")
    println("$a != $b = ${a != b}")
    println("$a < $b = ${a < b}")
    println("$a > $b = ${a > b}")
    println("$a <= $b = ${a <= b}")
    println("$a >= $b = ${a >= b}")

    //7 in a . . b
    println(7 in a..b)

    //logic operations

    var age = 30
    println((age > 18) and (age <= 30))
    println(18 <= age && age <= 70)

    println(age <= 30 || 65 <= age)

    var isBeautiful: Boolean = true
    var isClever: Boolean = true

    var result = isBeautiful and isClever
    println(result)
    result = isBeautiful or isClever
    println(result)


    //arithmetic operations
    var c = 10
    var d = 20
    var resultArythmetic: Int

    resultArythmetic =  a + b
    resultArythmetic = a.plus(b)
    resultArythmetic = a - b
    resultArythmetic = a.minus(b)
    resultArythmetic = a * b
    resultArythmetic = a.times(b)
    resultArythmetic = a / b
    resultArythmetic = a.div(b)
    resultArythmetic = a % b
    resultArythmetic = a.mod(b)

    a += 5
    b -= 10
    c *= 120
    d /= 23
    a %= 3





}