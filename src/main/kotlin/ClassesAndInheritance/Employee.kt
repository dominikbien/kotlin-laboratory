package ClassesAndInheritance

open class Employee(var name: String, var surname: String, var duties: String, var salary: Double) {

   open var localisation: String = "Warsaw"

   open fun introductYourself() {
        println("I am $name $surname. My dutie is: $duties and my salary: $salary")
    }
}