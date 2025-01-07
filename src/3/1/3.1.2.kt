package `3`.`1`

/*
Write a function that determines if a number is in the range of two other numbers.

 */
fun inRange(a: Int, b: Int, c: Int): Boolean {
    return b < a && a < c
}

fun main() {
    print("please enter a number: ")
    val a = readLine()?.toIntOrNull() ?: 0

    print("please enter the left border: ")
    val b = readLine()?.toIntOrNull() ?: 0

    print("please enter the right border: ")
    val c = readLine()?.toIntOrNull() ?: 0

    val ans = inRange(a, b, c)
    println(ans)
}
