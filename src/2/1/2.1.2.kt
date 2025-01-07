package `2`.`1`

/*
Write a program that initializes an array with the numbers 1 – 5, inclusive.  The program will then prompt the user for a number that can be used to replace the middle element of the array. The program will output the new array.
 */
fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)

    print("please enter a number: ")
    val n = readLine()?.toIntOrNull() ?: 0

    list[2] = n
    println(list)
}
