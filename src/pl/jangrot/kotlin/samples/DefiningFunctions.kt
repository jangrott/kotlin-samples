package pl.jangrot.kotlin.samples

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int): Unit {
    println(a +b)
}

fun sub(a: Int, b: Int) = a - b

fun printSub(a: Int, b: Int) {
    println(a - b)
}

fun main(args: Array<String>) {
    println(sum(2, 4))
    println(sub(3, 1))

    printSum(1, 1)
    printSub(6, 1)
}