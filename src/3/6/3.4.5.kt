package `3`.`6`

/*
Write a program for the College of Pokemon Trainers that calculates the admission fee for Prospective Trainers (PTs), based on a number of factors. PTs must 16 years old or older. PTs are rated according to their experience using the codes N, E and M, respectively, for New, Experienced and Master level experience. The program will determine the admission fee charged to PTs according to the following table:

Age
Experience
Fee
16 – 25, inclusive
N
$2.00
“
E
$1.50
“
M
$1.00
26 – 60, inclusive
N
$1.50
“
E
$1.00
“
M
$0.75
greater than 60
N
$0.90
“
E, M
$0.75


Use compound boolean expressions.
Any age less than 16 should result in a message indicating the applicant is ineligible for the program.
 */
fun main() {
    print("Enter your age: ")
    val age = readLine()?.toIntOrNull() ?: 0

    print("Enter your level of education (N/E/M): ")
    val level = readLine()?.uppercase() ?: "N"

    var fee = 0.0

    if (age < 16) {
        println("You are not old enough to become a pokemon trainer")
    } else if (age in 16..25) {
        fee = when (level) {
            "N" -> 2.00
            "E" -> 1.50
            "M" -> 1.00
            else -> fee
        }
    } else if (age in 26..60) {
        fee = when (level) {
            "N" -> 1.50
            "E" -> 1.00
            "M" -> 0.75
            else -> fee
        }
    } else if (age > 60) {
        fee = when (level) {
            "N" -> 0.90
            "E", "M" -> 0.75
            else -> fee
        }
    }

    println(fee)
}