package `5`.`1`

/*
Write a program that has starts with a number and subtracts 20 from it 3 times. Your program receives the starting number as input. Print out the result.
 */
fun main() {
    print("please enter a number: ")
    var number = readLine()?.toIntOrNull() ?: 0

    for (i in 0 until 3) {
        number -= 20
    }

    println(number)
}
