package variables

fun main(args: Array<String>) {

        var variable: Int
        variable = 123
        println(variable)

        var intVariable: Int = 1034 //camelCase
        var sum = variable + intVariable
        println(sum)

        var byteVariable: Byte = 1
        println("Byte variable $byteVariable")

        var longVariable: Long = 123L
        println("Long variable $longVariable")

        var floatVariable: Float = 0.123f
        println("Float variable $floatVariable")

        var doubleVariable: Double = 12.34
        println("Double variable $doubleVariable")

        var booleanVariable: Boolean = true
        println("Boolean variable $booleanVariable")

        var charVariable: Char = 'c'
        println("Char variable $charVariable")

        var varVariable = 123
        println("Var variable $varVariable")

        var stringVariable: String = "Hello world"
        println("String variable $stringVariable")

        //Convert
        println("Conversion")
        intVariable = 555
        longVariable = intVariable.toLong()
        doubleVariable = intVariable.toDouble()
        println("Double variable $doubleVariable")
        println("Long variable $longVariable")

        //var vs val
        var mutableVariable: Int = 3
        mutableVariable = 4
        println("Mutable variable $mutableVariable")

        val immutableVariable: Int = 7
        // immutableVariable = 8 you can't change variable

        //in projects => val
        //in learn app (tests solutions) => var

        //null and nullable?
        // var nullVariable: Int = null you can not this
        var nullableVariable: Int? = 5
        println("Nullable variable $nullableVariable")
        nullableVariable = null
        println("Nullable variable $nullableVariable")
        // nullableVariable.minus(2) you can not
        nullableVariable = 6
        nullableVariable?.minus(2)
        println("Nullable variable $nullableVariable")
        nullableVariable = null
        println("Nullable variable ${nullableVariable?.minus(2)}")

        //non-null
        var number: Int? = null
        number!!.minus(2) //NullPointerException





}