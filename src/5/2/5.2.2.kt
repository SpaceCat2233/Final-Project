package `5`.`2`

/*
Write a program that calculates the average of a set of numbers entered by the user. The number of numbers that will be entered is unknown. The user will indicate they are done entering numbers by entering zero.
For example, a user could enter the set 2  5  12  6  0. The program adds up 2 + 5 + 12 + 6 then divides the sum by 4.
 */
fun main() {
    var mid = 0.0
    var count = 0

    print("please enter a number: ")
    var a = readLine()?.toIntOrNull() ?: 0

    while (a != 0) {
        count++
        mid += a
        print("please enter a number: ")
        a = readLine()?.toIntOrNull() ?: 0
    }

    if (count > 0) {
        val average = mid / count
        println("Average: $average")
    } else {
        println("No numbers were entered.")
    }
}
