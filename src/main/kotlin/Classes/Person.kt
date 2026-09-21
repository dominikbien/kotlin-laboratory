package Classes


//primary contructor
class Person(var name: String? = null,var surname: String? = null ){
//       var surname: String? = null
//    init {
//    surname = "$name $surname"
//    }

//    var  name: String? = null
//var surname: String? = null



    fun introductYourself() {
        println("I am $name $surname")
    }
}
fun main() {
    var person = Person("Micheal", "Smith")
    person.name = "John"
    person.surname = "Cena"
    person.introductYourself()
}