package test

fun main() {
    val objA = Derived("A")
    val complex = UnsafeComplex(objA)
    val instance: Base<Any> = complex.instance
    instance.confirmOrFail()
    println("All tests green")
}

fun Base<Any>.confirmOrFail() {
    require(this is Derived)
    println("message is `$instance`")
}
