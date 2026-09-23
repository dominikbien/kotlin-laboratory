package ExtensionFunctions

fun main(args: Array<String>) {
    5+6
    5.plus(6)
    5 add 6
    val point1 = Point(8, 3)
    val point2 = Point(5, 1)
    val point3 = point1 + point2
    println("x: ${point3.x} y: ${point3.y}")
    println(point1 > point2)

    val point4 = point1 + point2
    val point5 = point1 add point2

}

class Point(var x: Int, var y: Int) {

    operator fun plus(another: Point): Point {
        return Point(this.x + another.x, this.y + another.y)
    }
    operator fun compareTo(another: Point): Int {
        if (this.x != another.x) {
            return this.x - another.x
        }
        else {
            return this.y - another.y
        }
    }

    infix fun add(another: Point): Point {
        return Point(this.x + another.x, this.y + another.y)

    }




}
infix fun Int.add(number: Int): Int = this + number