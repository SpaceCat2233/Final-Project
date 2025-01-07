package `3`.`4`

/*
Create a computer_trouble_shooting program that prompts the user if an ailing computer beeps on startup and if the hard drive spins. If it beeps and the drive spins, print “Contact tech support”. If it beeps and the drive does not spin, print “Check drive contacts”. If it does not beep and the drive does not spin, print “Bring computer to repair center”. Finally, if it does not beep and the drive spins, print “Check the speaker connections”.
Draw a flow diagram first, before coding.
Organize your program into sections as per the Organization of Programs convention. Include a header.
Hint: Can use a table to organize the possibilities. This would be written during the analysis part of writing programs.
 */
fun main() {
    print("Is the computer beeping (Y/N): ")
    val beep = readLine()?.uppercase()

    print("Is the drive spinning (Y/N): ")
    val spin = readLine()?.uppercase()

    if (beep == "Y") {
        if (spin == "Y") {
            println("Contact tech support")
        } else if (spin == "N") {
            println("Check drive contacts")
        }
    } else if (beep == "N") {
        if (spin == "Y") {
            println("Check the speaker connections")
        } else if (spin == "N") {
            println("Bring computer to repair center")
        }
    }
}