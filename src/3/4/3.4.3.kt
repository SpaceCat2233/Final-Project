package `3`.`4`

/*
Modify 03.03.02 so that users can be designated a Prime user. If the order is from a Prime user, and the order is for 900 copies or more, then they are entitled to a 10% discount on their final price.
 */
fun main() {
    print("please enter the copies you need: ")
    val copies = readLine()?.toIntOrNull() ?: 0

    print("Are you a prime user (Y/N): ")
    val prime = readLine()?.uppercase() ?: "N"

    var price = 0.0
    val pricePerCopy: Double = when {
        copies < 500 -> 0.30
        copies < 750 -> 0.28
        copies < 1000 -> 0.27
        else -> 0.25
    }

    price = copies * pricePerCopy

    if (prime == "Y" && copies > 900) {
        price *= 0.9
    }

    println("price is: $price")
}
