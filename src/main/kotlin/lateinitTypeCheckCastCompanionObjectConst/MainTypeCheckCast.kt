package lateinitTypeCheckCastCompanionObjectConst

fun main(args: Array<String>) {
    var apple: Apple
    apple = Apple()
    take(apple)

    var variable: Any
    variable = "Hello World"
    checkVariable(variable)

    casting(5)

    casting(null)

    casting("Tekst")

}

fun casting(any: Any?) {
    var number: Int? = any as? Int
    println("Casting: $number")

}


fun take(fruit: Fruit) {
    if (fruit is Apple)
        fruit.eat()
    else
        println("I don't like another fruits")

}
fun checkVariable(variable: Any) {
//    if (variable is Fruit) {
//        variable.eat()
//    }
//    else if (variable is String) {
//        println(variable.uppercase())
//    }
//    else {
//        println(I can not handle variable :(  )
//    }
//
    when(variable) {
        is Fruit -> variable.eat()
        is String -> variable.uppercase()
        else -> println("I can not handle variable :(  ")
    }
}