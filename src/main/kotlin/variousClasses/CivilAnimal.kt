package variousClasses

abstract class CivilAnimal(var name: String) {

    abstract var sounds: String
    abstract fun giveAVoice()


    fun call() {
        println("come up $name")
    }

}