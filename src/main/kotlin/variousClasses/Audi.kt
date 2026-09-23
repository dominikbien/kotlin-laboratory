package variousClasses

class Audi : Car, Combusion {

    var isStarted: Boolean = true
    override fun start() {
        isStarted = true
        println("Audi is starting...")
    }

    override fun stop() {
    isStarted = false
    println("Audi is stopping...")
    }

    override fun fuellUp(amount: Double) {
        TODO("Not yet implemented")
    }
}