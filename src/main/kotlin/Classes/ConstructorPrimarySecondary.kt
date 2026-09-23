package Classes

class ConstructorPrimarySecondary(var name: String, var surname: String) {

    var age: Int? = null
    var address: String? = null
    constructor(name: String, surname: String, age: Int) : this(name, surname) {
        this.age = age
    }
    constructor(name: String, surname: String, age: Int, address: String) : this(name, surname, age){
        this.address = address
    }

}