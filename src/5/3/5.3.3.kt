package `5`.`3`

/*
Write a program that counts how many ways 2 6-sided dice can add up to the numbers 3, 4, and 12. Order counts. For example, in trying to add up to 8, the pairs 2,6 and 6,2 count as 2 ways, while 4, 4 counts as 1 way. Must display all the ways that add up to 3, 4, and 12.
 */
fun main() {
    var ans3 = 0
    var ans4 = 0
    var ans12 = 0

    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 3) {
                ans3++
            }
        }
    }

    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 4) {
                ans4++
            }
        }
    }

    for (i in 1..6) {
        for (j in 1..6) {
            if (i + j == 12) {
                ans12++
            }
        }
    }

    println(ans3)
    println(ans4)
    println(ans12)
}
