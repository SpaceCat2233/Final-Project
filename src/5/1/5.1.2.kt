package `5`.`1`

/*
Write a program that accepts as input, 4 numbers, then displays the result of multiplying the 4 numbers together.
Note: Decide what statements can be repeated, and what are the initial conditions, and any end calculations. Do not use 4 separate variables to hold the 4 values.
 */
fun main() {
    print("please enter a number: ")
    var ans = readLine()?.toIntOrNull() ?: 1

    for (i in 0 until 3) {
        print("please enter a number: ")
        val mid = readLine()?.toIntOrNull() ?: 1
        ans *= mid
    }

    println(ans)
}

