package ClassesAndInheritance

class Programmer(
    name: String,
    surname: String,
    duties: String,
    salary: Double,
    var programmingLanguage: String
) : Employee(
    name,
    surname,
    duties,
    salary
) {
    override var localisation: String = "remote"

    override fun introductYourself() {
        super.introductYourself()
        println("my programming language: $programmingLanguage")
    }

}