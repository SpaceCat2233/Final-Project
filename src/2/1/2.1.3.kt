package `2`.`1`

/*
Write a program that accepts 15 integers that the user will input.  The program will then prompt to
    i) replace the nth position element from the front with another number . The user will be entering the position, then the integer to use for replacement. The program will then print the full array for confirmation
    ii) similar asi) but write a separate program that will replace the nth element from the back of the array, using the negative indices

 */
//i)
fun main() {
    val list = mutableListOf<Int>()

    for (i in 0 until 15) {
        print("enter a number: ")
        val n = readLine()?.toIntOrNull() ?: 0
        list.add(n)
    }

    print("please enter a number for position: ")
    val pos = readLine()?.toIntOrNull() ?: 0

    print("please enter a number you want to replace: ")
    val num = readLine()?.toIntOrNull() ?: 0

    if (pos in list.indices) {
        list[pos] = num
    } else {
        println("Invalid position")
    }

    println(list)
}

//ii)
fun main() {
    val list = mutableListOf<Int>()

    for (i in 0 until 15) {
        print("enter a number: ")
        val n = readLine()?.toIntOrNull() ?: 0
        list.add(n)
    }

    print("please enter a number for position: ")
    var pos = readLine()?.toIntOrNull() ?: 0

    print("please enter a number you want to replace: ")
    val num = readLine()?.toIntOrNull() ?: 0

    pos -= list.size

    if (pos in list.indices) {
        list[pos] = num
    } else {
        println("Invalid position")
    }

    println(list)
}
