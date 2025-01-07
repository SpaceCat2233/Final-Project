package `3`.`3`

/*
Printing prices are typically based on the number of copies to be printed. For example:

Number range
0 – 499
500 – 749
750 – 999
1000 or more
Price per copy ($)
0.30
0.28
0.27
0.25


Create a printing_prices program that prompts the user for the number of copies to print and then, when executing, displays the price per copy and the total price, tax not included.
Note: When working with ranged applications, carefully test the boundaries of the ranges, for example, 499 copies, 500 copies and 501 copies.
 */
fun main() {
    print("please enter the copies you need: ")
    val copies = readLine()?.toIntOrNull() ?: 0
    var price = 0.0
    var pricePerCopy = 0.0

    pricePerCopy = when {
        copies < 500 -> 0.30
        copies < 750 -> 0.28
        copies < 1000 -> 0.27
        else -> 0.25
    }

    price = copies * pricePerCopy
    println("price is: $price")
}
