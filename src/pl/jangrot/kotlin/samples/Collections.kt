package pl.jangrot.kotlin.samples

fun main(args: Array<String>) {

    val values: Array<String> = arrayOf("B", "C", "A")

    if ("A" in values) {
        println("values contains A")
    }

    values.filter { it in arrayOf("A", "C") }
            .sortedBy { it }
            .map { it.toLowerCase() }
            .forEach { println(it) }
}