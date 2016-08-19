package pl.jangrot.kotlin.samples

fun main(args: Array<String>) {
    val objString: Any = "someString"
    val objInt: Any = 4

    getInfo(objString)
    getInfo(objInt)
}

private fun getInfo(obj: Any) {
    when (obj) {
        is String -> println("$obj has length ${obj.length}")
        is Int -> println("$obj is a number")
    }
}