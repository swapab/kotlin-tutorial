// exmaple.kt

package foo

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

        val outer = Outer()

        println("Nested class is visible: $outer")
        println("Nested().e is visible: $outer.Nested().e()")
    }
}

fun main() {
    Subclass().print()
}
