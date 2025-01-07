package `2`.`4`

/*
Write a program, scoreAverages.py, that prompts for three scores, then the name of a player. The program then calculates the average of the three scores and displays an appropriate message, for example:
Bianca scored an average of 1.8 goals per game
 */

fun main() {
    print("please enter your score: ")
    val score1 = readLine()?.toIntOrNull() ?: 0

    print("please enter your score: ")
    val score2 = readLine()?.toIntOrNull() ?: 0

    print("please enter your score: ")
    val score3 = readLine()?.toIntOrNull() ?: 0

    print("please enter your name: ")
    val name = readLine() ?: "Unknown"

    val average = (score1 + score2 + score3) / 3.0
    println("$name scored an average of $average goals per game")
}
