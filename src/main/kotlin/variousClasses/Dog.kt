package variousClasses

class Dog(name: String) : CivilAnimal(name ) {
    override var sounds: String = "Hau hau"

    override fun giveAVoice() {
        println("$name sounds: $sounds")
    }
}