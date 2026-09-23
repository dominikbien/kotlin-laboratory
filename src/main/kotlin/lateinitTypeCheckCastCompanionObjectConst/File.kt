package lateinitTypeCheckCastCompanionObjectConst

class File {
    companion object {
        val nameFile: String = "example.txt"

        //public static final String VARIABLE_NAME = "EXAMPLE
        const val VARIABLE_NAME = "EXAMPLE"
    }
}