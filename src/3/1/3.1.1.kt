package `3`.`1`

/*
Write a function to find the maximum of three numbers. The function will have 3 parameters.  The three numbers will be supplied by user in the main body of the program.
 */
fun biggest(a: Int, b: Int, c: Int): Int {
    return if (a > b && a > c) {
        a
    } else if (b > a && b > c) {
        b
    } else {
        c
    }
}

fun main() {
    print("please enter a number: ")
    val a = readLine()?.toIntOrNull() ?: 0

    print("please enter a number: ")
    val b = readLine()?.toIntOrNull() ?: 0

    print("please enter a number: ")
    val c = readLine()?.toIntOrNull() ?: 0

    val ans = biggest(a, b, c)

    println(ans)
}
