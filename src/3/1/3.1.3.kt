package `3`.`1`

/*
Write a function that takes two parameters: i) a phrase, and ii) a number. The function will print out that phrase as many times as the number provided.

 */
fun printMax(string: String, time: Int) {
    for (i in 0 until time) {
        println(string)
    }
}

fun main() {
    print("please enter a phrase: ")
    val words = readLine() ?: ""

    print("please enter a number: ")
    val number = readLine()?.toIntOrNull() ?: 0

    printMax(words, number)
}
