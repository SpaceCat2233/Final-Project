package `5`.`3`

/*
Modify Example 3 above so that it will prompt a user for a horizontal and vertical measure, and which prints out a rectangle of “*” to those dimensions.
 */
fun main() {
    print("please enter a width: ")
    val width = readLine()?.toIntOrNull() ?: 0

    print("please enter a height: ")
    val height = readLine()?.toIntOrNull() ?: 0

    for (i in 0 until height) {
        var line = " "
        for (j in 0 until width) {
            line += "*"
        }
        println(line)
    }
}
