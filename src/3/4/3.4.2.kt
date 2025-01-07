package `3`.`4`

/*
A delivery service does not accept packages heavier than 27 kilograms or larger than 0.1 cubic meters (100, 000 cubic centimeters). Create a package_check application that prompts the user for the weight of a package and its dimensions. The program will check the conditions and print an appropriate message, for example, “package meets requirements”, “too large”, “too heavy” or both violation messages.
 */
fun main() {
    print("please enter the weight of the package in kg: ")
    val weight = readLine()?.toIntOrNull() ?: -1

    print("please enter the volume of the package in cubic meters: ")
    val volume = readLine()?.toDoubleOrNull() ?: -1.0

    if (weight > 27) {
        if (volume > 0.1) {
            println("Package is too heavy and too large")
        } else if (volume in 0.0..0.1) {
            println("Package is too heavy")
        }
    } else if (weight in 1..27) {
        if (volume > 0.1) {
            println("Package is too large")
        } else if (volume in 0.0..0.1) {
            println("Package is acceptable")
        }
    } else {
        println("invalid package")
    }
}
