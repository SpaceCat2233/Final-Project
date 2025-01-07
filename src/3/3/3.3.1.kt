package `3`.`3`

/*
What is printed after the following statements execute? Does the message reflect what was intended? If not, how should the statements be rewritten to produce the intended results?

score = 2

if (score >= 100):
print( “You Won!”)
elif (score < 100):
print (“Good try”)
elif (score < 50):
print (“Practice More”)

No, it should print “Practice More”. It should rewritten to the following code:
 */
fun main() {
    val score = 2

    if (score >= 100) {
        println("You Won!")
    } else if (score in 50 until 100) {
        println("Good try")
    } else if (score < 50) {
        println("Practice More")
    }
}
