fun ex3s(str: String): Boolean {
    val strLower = str.lowercase()

    var countX = 0
    var countO = 0

    var i = 0
    while (i < strLower.length) {
        if (strLower[i] == 'x') {
            countX++
        } else if (str[i] == 'o') {
            countO++
        }
        i++
    }

    return (countX == countO) && (countX != 0)
}

fun main() {
    println(ex3s("xxooox"))
    println(ex3s("xxxxxo"))
    println(ex3s("xxxooo"))
}