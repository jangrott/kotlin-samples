package pl.jangrot.kotlin.samples

fun main(args: Array<String>) {
    println(min(2,3))
    println(max(4,1))
}

fun min(a: Int, b: Int): Int {
    if (a < b) {
        return a
    } else {
        return b
    }
}

fun max(a: Int, b: Int) = if (a > b) a else b