package `2`.`4`

/*
Write a program, miniCalculator.py, that prompts for two integers, adds them, then subtracts the first number from the second, then prints out their sum and difference, in two separate messages. Remember to write appropriate prompts and to comment.
Hint: What is an appropriate base to use for the integers?
 */

fun main() {
    print("x: ")
    val x = readLine()?.toIntOrNull() ?: 0

    print("y: ")
    val y = readLine()?.toIntOrNull() ?: 0

    val sum = x + y
    val diff = y - x

    println("sum: $sum")
    println("diff: $diff")
}
