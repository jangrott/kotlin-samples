package pl.jangrot.kotlin.samples

fun main(args: Array<String>) {

    // string templates
    val name: String = "Tom"

    println("Hello $name!")

    // nullable value and checking for null
    println(parseInt("32")) // 32
    println(parseInt("NaN")) // null

    // type checks and automatic casts
    val objString: Any = "someString"
    println(getStringLength(objString))
    val objInt: Any = 4
    println(getStringLength(objInt))

    // for loop
    val values: IntArray = intArrayOf(2,1,3,4,5)

    for (value in values) {
        println(value)
    }

    for (i in values.indices) {
        println(values[i])
    }

    // while loop
    var i = 0

    while(i < values.size) {
        println(values[i++])
    }

    // ranges
    val x: Int = 4

    if (x in 1..10) {
        println("In range")
    }

    for (i in 1..3) {
        println(i)
    }
}

fun parseInt(value: String): Int? {
    if (value == null) return null
    try {
        return value.toInt()
    } catch (e: NumberFormatException) {
        return null
    }
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}
