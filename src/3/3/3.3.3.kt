package `3`.`3`

/*
Create a grades program that allows the user to enter a letter grade (A, B, C, D or E), which then displays the range of marks associated with that letter. Use the following range:
	A	80 – 100
	B	70 – 79
	C	60 – 69
	D	50 – 59
	E	0 – 49
If the user enters anything else, an error message should appear, for example, “Invalid letter grade”.
 */
fun main() {
    print("please enter your grade: ")
    val grade = readLine()?.uppercase()

    when (grade) {
        "A" -> println("your grade is in the range of 80 - 100")
        "B" -> println("your grade is in the range of 70 - 79")
        "C" -> println("your grade is in the range of 60 - 69")
        "D" -> println("your grade is in the range of 50 - 59")
        "E" -> println("your grade is in the range of 0 - 49")
        else -> println("invalid letter grade")
    }
}
