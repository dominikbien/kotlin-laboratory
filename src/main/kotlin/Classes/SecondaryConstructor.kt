package Classes

class SecondaryConstructor() {
    var name: String? = null
    var surname: String? = null
    var age: Int? = null
    constructor(name: String?, surname: String?) : this() {
        this.name = name
        this.surname = surname
    }
    constructor(surname: String?) : this() {
        this.surname = surname
    }
    constructor(name: String?, surname: String?, age: Int?) : this(name, surname) {
        this.age = age
    }

}
fun main() {
    var secondaryConstructor = SecondaryConstructor("John", "Cena", 50)

}