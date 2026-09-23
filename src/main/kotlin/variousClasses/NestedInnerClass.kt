package variousClasses

//class OuterClass {
//    var field: String? = null
//
//    inner class InnerClass {
//        fun function() {
//            println(field)
//        }
//    }
//}
fun main() {
    var amoled = SamsungPhone(150.0, 73.0).Amoled()
}
class SamsungPhone(val height: Double, val weight: Double) {
    var thicknessCase: Double = 2.0
    inner class Amoled {
    val lengthA = height - thicknessCase
    val lengthB = weight - thicknessCase
    }
}