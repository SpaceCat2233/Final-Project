package `2`.`2`

/*
Create a geometry program Circumference.py that prints the circumference (2(pi)r) of a circle with radius 15 cm. Use the value 3.14 for pi. Verify your program’s calculation manually.
i) Write a program that just displays the calculated answer.
ii) Modify the program so that the answer is printed as:
“The circumference is XX cm”,  where XX is the calculated answer.

 */
//i)
fun main() {
    val radius = 15
    val pi = 3.14
    val circumference = 2 * radius * pi
    println(circumference)
}

//ii)
fun main() {
    val radius = 15
    val pi = 3.14
    val circumference = 2 * radius * pi
    println("The circumference is $circumference cm")
}
