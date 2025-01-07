package `5`.`3`

/*
Write a program that prints outs a word 5 times. But in between each of these lines, it prints out a second word 3 times in a sequence. For example:
	Good 1
	Dog 1
	Dog 2
	Dog 3
	Good 2
 */
fun main() {
    for (i in 1..5) {
        println("good $i")
        for (j in 1..3) {
            println("dog $j")
        }
    }
}
