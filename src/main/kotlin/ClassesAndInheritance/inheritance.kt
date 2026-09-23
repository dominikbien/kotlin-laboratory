package ClassesAndInheritance

fun main(args: Array<String>) {
var employee = Employee(
    "Jan",
    "Kowalski",
    "Helpdesk",
    5000.0)
var programmer = Programmer(
    "Adam",
    "Nowak",
    "Programming applications",
    8000.0,
    "Kotlin")

employee.introductYourself()
programmer.introductYourself()

}