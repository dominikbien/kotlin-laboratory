package Classes

class User(var name: String, var surname: String) {

    var fullname: String? = null
        get() {
            return "$name - $surname"
        }


    var budget: Double = 0.0
        set(value) {
         field += value
        }


    fun introductYourself() {
        println("I am $name $surname")
    }
}

fun main() {
    var user = User("Jan", "Kowalski")
    println(user.fullname)

    user.budget = 1203.22
    user.budget = 503.22
    println(user.budget)
}