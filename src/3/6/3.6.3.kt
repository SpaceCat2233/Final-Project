package `3`.`6`

/*
Rewrite exercise 3.04.01 replacing the nested “if”s with compound Boolean expressions
 */
fun main() {
    print("Is the computer beeping (Y/N): ")
    val beep = readLine()?.uppercase() ?: "N"

    print("Is the drive spinning (Y/N): ")
    val spin = readLine()?.uppercase() ?: "N"

    when {
        beep == "Y" && spin == "Y" -> println("Contact tech support")
        beep == "Y" && spin == "N" -> println("Check drive contacts")
        beep == "N" && spin == "Y" -> println("Check the speaker connections")
        beep == "N" && spin == "N" -> println("Bring computer to repair centre")
        else -> println("Invalid input")
    }
}
