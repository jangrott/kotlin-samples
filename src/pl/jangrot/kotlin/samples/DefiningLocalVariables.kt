package pl.jangrot.kotlin.samples

fun main(args: Array<String>) {
    // assign-once (read-only)
    val a = 65
    val b: Int = 66
    val c: Int
    c = 67

    // mutable
    var d = 69
    d = 68

    println("$a, $b, $c, $d") // 65, 66, 67, 68
}