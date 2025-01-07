package `5`.`2`

/*
Write a program that prompts the user for two numbers. The program will then print out all the numbers between these numbers, including the last number. Assume the first number entered is larger than the second number.
 */
fun main() {
    print("please enter a number: ")
    var a = readLine()?.toIntOrNull() ?: 0

    print("please enter a number: ")
    val b = readLine()?.toIntOrNull() ?: 0

    print("please enter a number: ")
    val c = readLine()?.toIntOrNull() ?: 1

    while (a in a until b) {
        println(a)
        a += c
    }
}