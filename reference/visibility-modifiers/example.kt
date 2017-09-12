// exmaple.kt
// complie: kotlinc example.kt -d example.jar
// run: kotlin -classpath example.jar ExampleKt

private fun foo() {} // visible inside example.kt

public var bar: Int= 5 // visible everywhere
    private set        // setter visible only in example.kt

internal val baz = 6 // visible inside the same module

open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    protected class Nested {
        public val e: Int = 5
    }
}

class Subclass: Outer() {
    fun print(){
        println("[a is not visible]")
        println("[b is visible] b: $b")
        println("[c is visible] c: $c")
        println("[d is visible] d: $d")

        val e = Outer.Nested().e

        println("Nested().e is visible: $e")
    }
}

fun main(args: Array<String>) {
    Subclass().print()
}
