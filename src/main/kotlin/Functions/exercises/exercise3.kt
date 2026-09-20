package Functions.exercises

fun main(args: Array<String>) {
    println(leapYear(2028))
    println(leapYear(2026))
}
fun leapYear(year: Int): Boolean = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)
