package variousClasses

class Cat(name: String) : CivilAnimal(name) {
    override var sounds: String = "Miau miau"


    override fun giveAVoice() {
        println("$name sounds: $sounds")
    }
}