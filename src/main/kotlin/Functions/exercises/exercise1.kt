package Functions.exercises

fun main(args: Array<String>) {

    println(retrieveNextEvenNumber(12))
    println(retrieveNextEvenNumber(21))

}

fun retrieveNextEvenNumber(evenNumber: Int): Int {
    if (evenNumber % 2 == 0)
        return evenNumber + 2
    else
        return evenNumber + 1
}