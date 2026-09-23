package lateinitTypeCheckCastCompanionObjectConst

class Note {

    //lateinit - can in class
    //can use with var
    //without getter and setter
    //no null
    //no primary data type (Int, Double etc)
   lateinit var text: String

    fun saveNote(information: String) {
        text = information
    }

}

fun main(args: Array<String>) {
    var note = Note()
    note.saveNote("Hello World")
    println(note.text)
}