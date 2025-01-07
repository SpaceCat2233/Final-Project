package `5`.`2`

/*
Write a Guessing Game program. The program will generate a random number between 1 and 50, inclusive. The user is to enter guesses of that number. If the user’s guess is too high, print a message that says, “Too high”. If the user’s guess is too low, print a message that says, “Too low”. If the guess is correct, print a message that says, “You guessed correctly!”.
 */
import kotlin.random.Random

fun main() {
    val number = Random.nextInt(1, 50)
    var guessNumber = 0

    while (guessNumber != number) {
        print("guess a number between 1 and 50: ")
        guessNumber = readLine()?.toIntOrNull() ?: 0

        when {
            guessNumber < number -> println("too low")
            guessNumber > number -> println("too high")
            else -> println("you guessed correctly!")
        }
    }
}
