package variousClasses

sealed class UserResult {
    class Success : UserResult() {
        fun save() {

        }
    }
    class Failure : UserResult() {
        fun showError() {
            println("Something went wrong")
        }
    }
}
class User {

}