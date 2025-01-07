/*
02.03.02 Calculating costs
Write a program that calculates the total price of a purchase using the following formula:
	Total price = price + sales tax, where sales tax is 13% of the initial price

Use appropriate variables and constant(s) for:
total price
price
sales tax

Calculate and display the total price for two purchases: i) $5, ii) $25.00
 */
//i)
fun main() {
    val price = 5
    val saleTax = 0.13
    val totalPrice = price + price * saleTax
    println("total price: $totalPrice")
}

//ii)
fun main() {
    val price = 25
    val saleTax = 0.13
    val totalPrice = price + price * saleTax
    println("total price: $totalPrice")
}

