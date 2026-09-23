package lateinitTypeCheckCastCompanionObjectConst

fun main(args: Array<String>) {
    val anonymous  = object {

    }
    val inheritanceAnon = object : Runnable {
        override fun run() {}
    }
}
object Singleton {

}

class ClassWithStatic {
    companion object {
        val STATIC_FIELD = 67
    }
}