package `2`.`1`

/*
Write a program that contains an array of 10 floating point numbers of your choosing. The array will be initialized in the program. Have the program then print out each element of the array, one per line. Use only 1 print statement ie do not have 10 separate print() statements.

 */
fun main() {
    val list = listOf(1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8, 1.9, 2.1)

    for (i in list) {
        println(i)
    }
}
