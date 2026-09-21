package Classes.model
//for class: public,private, internal, no modificator
 class User  constructor(var login: String, private var password: String) {
    //JAVA: public / protected /private /no modificator
    public var publicField: String? = null
    protected var protectedField: String? = null //
    private var privateField: String? = null //range - only private class
    var fieldWithoutModificator: String? = null //public
    internal var internalField: String? = null //range: moduels
}
fun main() {
    var user = User("witcher1", "12345")
    user.login = "switcher1"



}