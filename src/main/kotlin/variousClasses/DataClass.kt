package variousClasses

fun main() {
    val person1 = Person("Jan", "Kowalski")
    val person2 = Person("Jan", "Kowalski")

    println(person1)
    println(person1 == person2)
}
data class Person(val name: String, val surname: String)