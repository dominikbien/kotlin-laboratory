package variousClasses

fun main(args: Array<String>) {

}
fun handlerUserResponse(userResult: UserResult) {
    when (userResult) {
        is UserResult.Success -> userResult.save()
        is UserResult.Failure -> userResult.showError()

    }
}