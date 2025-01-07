package `3`.`6`

/*
Write a program number_sorter that accepts a number between 1 and 100, inclusive, and which distinguishes number by the following criteria, to be testing in order:
a) number is divisible by 10, print a message stating “Criteria A”
b) number is divisible by 5 or is strictly less than 40, print “Criteria B”
c) number is less strictly less than 60, print “Criteria C”
d) otherwise, print “Does not match any Criteria”
Use only 1 “if…elif” statement and compound Boolean expressions
 */
fun main() {
    print("please enter a number between 1 and 100: ")
    val number = readLine()?.toIntOrNull() ?: 0

    when {
        number % 10 == 0 -> println("Criteria A")
        number % 5 == 0 && number < 40 -> println("Criteria B")
        number < 60 -> println("Criteria C")
        else -> println("Does not match any Criteria")
    }
}