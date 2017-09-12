interface MyInterface {
    val prop : Int

    val propertyWithImplementation: String
    get() = "foo"

    fun foo(){
        print(prop)
        println()
    }
}

class Child : MyInterface {
    // override val prop : Int = 30
}

fun main(args: Array<String>){
    Child().foo()
    println(Child().propertyWithImplementation)
}
