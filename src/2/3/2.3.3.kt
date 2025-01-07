package `2`.`3`
/*
Write a program that displays the following message:

My favourite animal is the _______ because they are _______

where you create a variable that contains the name of an animal, and a second variable with a trait of that animal and use those variables in a print statement to output the above message.
Then change the contents of the two variables and print the new message.
 */
fun main() {
    var animalName = "cat"
    var animalTrait = "cats give us attention, relieve our loneliness, provide comfort"
    println("My favourite animal is the $animalName because they are $animalTrait")

    animalName = "bat"
    animalTrait = "we like batman"
    println("My favourite animal is the $animalName because they are $animalTrait")
}
