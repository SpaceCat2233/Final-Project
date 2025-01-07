package `2`.`4`

/*
Write a program, numberSystems.py, that displays the name of the program, followed by a description of its operation. The program will accept a base (eg 2, 7, etc).Then the program will accept a number in that base representation. The program will then display the number converted to denary.
Allow for a blank lines for spacing, Allow for a space between prompts and where the cursor appears, while waiting for input.

Example:
Number Systems
Convert to Base 10
This program will accept a number in a non-base 10
representation, and convert it to its base 10 equivalent.

Base 2
Number 1001
Number (denary) 9
 */

fun main() {
    println("Base converter")
    println("Convert to base 10")
    println("This base converter accepts a number in a non-base 10 representation and converts it to its base 10 equivalent\n")

    print("base: ")
    val base = readLine()?.toIntOrNull() ?: 10

    print("number: ")
    val numInput = readLine()

    val num = try {
        numInput?.toInt(base) ?: 0
    } catch (e: NumberFormatException) {
        println("Invalid number for base $base")
        return
    }

    println("number: $num")
}
