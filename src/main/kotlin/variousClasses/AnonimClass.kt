package variousClasses

fun main(args: Array<String>) {

    val match = object {
        var points: Int = 0
        fun countPoints() {

        }
    }
    match.points = 20
    match.countPoints()

    val myListener = object : Listener {
        override fun onClick() {
            println("I am clicked")
        }
    }
}

interface Listener {
    fun onClick()
}