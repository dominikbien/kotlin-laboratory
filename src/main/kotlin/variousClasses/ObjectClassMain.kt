package variousClasses

fun main(args: Array<String>) {
    Settings.name = "My App"
    println(Settings.name)

    val screen = Screen()
    screen.changeSetting()
    println(Settings.name)
}
class Screen {
    fun changeSetting() {
        Settings.name = "Screen change settings"
    }
}