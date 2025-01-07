# Final-Project
// Kotlin is a modern programming language known for its conciseness, safety, and interoperability with Java.
// It's widely used in Android development, backend services, and more.

//Code/Coding
//The term 'code' in Kotlin, like in any other language, refers to instructions written to perform specific tasks.
//Coding is the act of writing this code.
//Kotlin code can be written using various code editors or IDEs.
//Popular options include IntelliJ IDEA, Android Studio, and VS Code with Kotlin plugins.

//For our class, we recommend using IntelliJ IDEA Community Edition (free) or replit.com for web-based Kotlin coding.
//Ensure to save your code properly to avoid loss.

//Our First Kotlin Program
fun main() {
    println("Hello World")
}

// Kotlin Comments
//Comments in Kotlin are used to document code and provide explanations.
//Like Python, comments are ignored by the compiler and do not affect program execution.
//Useful for developers to understand the logic and maintain the code.

// Single-line comments start with double slashes.
/* Multi-line comments are enclosed in slash-asterisk pairs. */

// Kotlin does not support triple-quote comments like Python.
// However, multi-line comments can be nested.

//Syntax in Kotlin:
//Kotlin's syntax is concise and expressive, designed to eliminate boilerplate code.
//Unlike Python, Kotlin uses braces {} to indicate code blocks rather than indentation.

//Examples of Kotlin syntax differences:
// Python
// if condition:
//     print("True")

// Kotlin
if (condition) {
    println("True")
}

//Semicolons are optional in Kotlin, except when multiple statements are on the same line.

// Kotlin Variables
//Variables are essential in Kotlin, just like in Python.
//Kotlin supports two types of variable declarations:
// Immutable (read-only) variables: val
// Mutable variables: var

// Example
val name = "Zach"  // Immutable, cannot be reassigned
var age = 10        // Mutable, can be reassigned
age = 11
println("Hello $name, you are $age years old.")

//Kotlin is statically typed, meaning variable types are known at compile time.
//However, Kotlin can infer the type based on the assigned value.

//Explicit type declaration is possible:
val x: Int = 4
val y: String = "Kotlin"

//Kotlin Variable Rules
// Variable names must start with a letter or underscore.
// They cannot start with numbers.
// Variable names are case-sensitive.

/*----------------------------------------------------------------------------*/
// Kotlin Data Types
//In Kotlin, data types are classified into several categories:
// 1. Numbers (Int, Double, Float, Long, Short, Byte)
// 2. Text (String, Char)
// 3. Boolean (true or false)
// 4. Arrays and Collections (List, Set, Map)

//Examples
val a: Int = 1
val b: String = "hi"
val c: Double = 4.4
val d: Boolean = true

//To check the type of a variable, Kotlin uses reflection:
println(a::class.simpleName)

// Kotlin Strings
//Strings in Kotlin are sequences of characters.
//Strings are created by enclosing text in double quotes.
//Kotlin allows for string interpolation and multi-line strings.

//Examples
val greeting = "Hi, my name is \"Zach\"."
val multiline = """This is a
multiline string"""

//Kotlin Numbers
//Numbers in Kotlin are represented by numeric data types.
//They can start with digits (0-9) or a negative sign (-) for negative numbers.

//Examples
val intNum: Int = 10
val floatNum: Float = 5.5f
val negNum: Int = -3

//Boolean Values
//Booleans in Kotlin represent true or false values.
//They are not enclosed in quotes.

println(10 > 9)  // true
println(10 == 9) // false
println(10 < 9)  // false

//Type Conversion (Casting)
val j: Int = 1
val k: Double = 2.8

val w: Double = j.toDouble()  // 1.0
val q: Int = k.toInt()        // 2
val l: String = k.toString()  // "2.8"

println(w)
println(q)
println(l)

//Operators in Kotlin
//Kotlin provides various operators to manipulate data.

//Arithmetic Operators
// + Addition (x + y)
// - Subtraction (x - y)
// * Multiplication (x * y)
// / Division (x / y)
// % Modulus (x % y)
// ** Exponentiation (x.toDouble().pow(y))
// // Floor Division (Kotlin uses (x / y).toInt() for floor division)

println(1 + 3)
println(2 * 3)
println(6 / 2)

//Assignment Operator
// = assigns values to variables
var t = 8

//Comparison Operators
// == equals (x == y)
// != not equals (x != y)
// > greater than (x > y)
// < less than (x < y)
// >= greater than, equal to (x >= y)
// <= less than, equal to (x <= y)
println(10 != 8)
println(12 >= 3)
println(5 <= 5)

//Types of Errors
//Syntax Errors (Compile-time Errors)
// val area = 15 x 17  // Error
// println("area is " + area)

//Logic Errors (Run-time Errors)
val areaOfRectangle = 15 / 17
println("area is ", areaOfRectangle)

/*------------------------------------------------------------------------*/
// Input
//In Kotlin, reading input from the user is done using the readLine() function.
//The input is always of type String, so it needs to be converted for arithmetic operations.
//You should store the input in a variable for future use.

//Example 1
print("What is the price? ")
val price = readLine()
println(price)

//Example 2
print("Enter a number: ")
val x = readLine()!!.toInt()
print("Enter another number: ")
val y = readLine()!!.toInt()
println(x)
println(y)

// Type
println(x::class.simpleName)
println(y::class.simpleName)

// Floor Division (Integer division)
val result = x / y  // No need to explicitly cast as Kotlin infers types
println("$x divided by $y gives us $result")

// Modulus
val result1 = x % y
println("$x divided by $y gives us $result with a remainder of $result1")

// Math Functions
// maxOf(x, y, z, ....) - returns the largest value
// minOf(x, y, z, ....) - returns the smallest value
// round(x) - rounds the value to the nearest integer

// Additional Math Functions
import kotlin.math.*
// ceil(x) - returns the smallest integer greater than or equal to x
// floor(x) - returns the largest integer less than or equal to x
// pow(x, y) - returns x raised to the power y
// PI - returns the mathematical constant π

// Formatting Numbers
//Numbers in Kotlin can be formatted using string templates or String.format().

//Example
val username = "Zach"
println("Hello $username")

//Example with calculations
val unitPrice = 49.99
val quantity = 30
println("Subtotal: \$${quantity * unitPrice}")

// Formatting with precision and commas
println("Subtotal: \$${"%.2f".format(quantity * unitPrice)}")

// Formatting percent numbers
val salesTaxRate = 0.065
println("Sales Tax Rate: ${"%.2f".format(salesTaxRate * 100)}%")

// Escape Characters
/*
- new line*/
// 	 - tab
// \  - backslash
// '  - single quote
// "  - double quote

//Example
println("Ms.\nZach says \"You will get 90\\100\"\tI\'m hoping that she's right!")

// Multiline format strings
val output = """
hello
my name is Zach
"""
println(output)

// Formatting width and alignment
val subtotal = quantity * unitPrice
val salesTax = salesTaxRate * subtotal
val total = subtotal + salesTax

val formattedOutput = """
Sales Tax Rate: ${"%.2f".format(salesTaxRate * 100)}%
Subtotal:       \$${String.format("%,.2f", subtotal)}
Sales Tax:      \$${String.format("%,.2f", salesTax)}
Total:          \$${String.format("%,.2f", total)}
"""
println(formattedOutput)
/*-----------------------------------------------------------*/
// Statements
// A statement in Kotlin is an instruction that can be executed by the program.
// We've seen assignment statements (val x = 4). Other examples include loops and if statements.

// Expression
// An expression is a combination of values, variables, operators, and function calls.
// Expressions need to be evaluated.
// If you print an expression, Kotlin evaluates it and displays the result.

// Evaluation of an Expression
// The result of evaluating an expression produces a value.
// A value alone is a simple expression, and so is a variable.
// Evaluating a variable gives the value it refers to.

// Comparison Operators
// == equals (x == y)
// != not equals (x != y)
// > greater than (x > y)
// < less than (x < y)
// >= greater than or equal to (x >= y)
// <= less than or equal to (x <= y)
// These return true or false.
// Commonly used in if-statements and loops.

// If-Statements
// 'if' is used to make decisions in Kotlin programs.
// Syntax:
// if (condition) {
//    // do this
// }

// Indentation is not mandatory, but code inside braces is part of the block.

// Example:
val a = 33
val b = 200
if (b > a) {
    println("b is greater than a")
}
println("This runs regardless of the if condition.")

// Else
// The 'else' block runs when the 'if' condition is false.

// Example:
val x = 200
val y = 33
if (y > x) {
    println("y is greater than x")
} else {
    println("x is greater than y")
}

// Elif (else if)
// 'else if' in Kotlin allows checking multiple conditions.
// Syntax: if...else if...else

// Example:
if (y > x) {
    println("y is greater than x")
} else if (x == y) {
    println("x and y are equal")
} else {
    println("x is greater than y")
}

// Kotlin Logical Operators
// 'and' (&&) - returns true if both conditions are true.
// 'or' (||) - returns true if at least one condition is true.
// 'not' (!) - reverses the result.

// Example using 'and':
val c = 500
if (x > y && c > x) {
    println("both conditions are true")
}

// Example using 'or':
if (x > y || c > x) {
    println("at least one condition is true")
}

// Example using 'not':
if (!(x > y && c > x)) {
    println("both conditions are false")
} else if (!(x > y || c > x)) {
    println("one condition is false")
}

// Nested Ifs
// Kotlin allows if-statements within if-statements.

// Example:
val z = 41
if (z > 10) {
    println("Above 10")
    if (z > 20) {
        println("Above 20")
    } else {
        println("but not above 20")
    }
} else {
    println("Not above 10")
}
/*--------------------------------------------------------------------*/
// LOOPS
// Decision-making is essential in programming. However, sometimes tasks need to repeat.
// Loops allow repetition of code blocks.
// In Kotlin, we have 'while' loops and 'for' loops.

// WHILE LOOPS
// Executes as long as the condition is true.

// Example
var i = 1
while (i < 6) {
    println(i)
    i++
}
println("The while loop is done")

// 'break' statement
// Exits the loop before the condition becomes false.

// Example
var j = 1
while (j < 6) {
    if (j == 3) {
        break
    }
    println(j)
    j++
}
println("The while loop is done")

// 'continue' statement
// Skips to the next iteration of the loop.

// Example
var k = 1
while (k < 6) {
    if (k == 3) {
        k++
        continue
    }
    println(k)
    k++
}
println("The while loop is done")

// 'else' block
// Runs when the loop condition is no longer true.

// Example
var m = 1
while (m < 6) {
    println(m)
    m++
} else {
    println("m is no longer less than 6")
}

// FOR LOOPS
// Iterates over a sequence, such as ranges, lists, or strings.

// Example 1
for (x in 0..6) {
    println(x)
}
println("All done")

// Example 2
for (x in 1 until 10) {
    println(x)
}
println("All done")

// Example 3 - Looping through a string
val fruit = "banana"
for (x in fruit) {
    println(x)
}
println("Done")

// 'break' statement
// Stops the loop early.

// Example
for (x in 1..100) {
    if (x == 42) {
        println("is the meaning of life")
        break
    }
    println(x)
}
println("The for loop is done")

// 'continue' statement
// Skips the current iteration and continues with the next.

// Example
for (x in 1..100) {
    if (x == 42) {
        println("is the meaning of life")
        continue
    }
    println(x)
}
println("The for loop is done")

// 'else' block with for loop
// Runs after the loop finishes.

// Example
for (x in 0..5) {
    println(x)
} else {
    println("finally finished")
}

// Nested Loops
// A loop inside another loop.

// Example
for (outer in 0 until 20) {
    for (inner in 1..4) {
        println("$outer, $inner")
    }
    println("The inner loop is done")
}
println("The outer loop is done")
/*-----------------------------------------------------------------------------------*/
// Functions
// Functions in Kotlin help organize code into reusable blocks.
// A function is a block of code that runs when called.
// Functions can accept parameters and return results.

// Creating a Function
// In Kotlin, functions are defined using the 'fun' keyword.

fun myFunction() {
    println("Hello from inside myFunction()")
}

println("Hello, I'm outside myFunction()")  // This line is outside the function

myFunction()  // Calling the function

// Functions should not be defined within other functions.

// Correct way
fun functionOne() {
    println("Yes")
}

fun functionTwo() {
    functionOne()
    println("Absolutely yes")
}

// Parameters and Arguments
// Parameters are variables listed in the function definition.
// Arguments are the values passed to those parameters.

fun greetUser(name: String) {
    println("Hi $name")
}

greetUser("Zach")  // Argument passed to the function
greetUser("Bernice")
greetUser("Tom")

// Parameters inside a function are local to that function.
// This is known as local scope. Variables outside remain unaffected.

// Number of Arguments
// Functions must be called with the correct number of arguments.
// Mismatch leads to errors.

// Keyword Arguments
// Kotlin supports named arguments.
// The order of arguments does not matter when using named arguments.

fun youngestChild(child1: String, child2: String, child3: String) {
    println("The youngest child is $child3")
}

youngestChild(child1 = "Nikhil", child2 = "Rand", child3 = "Maya")

// Default Parameter Value
// Parameters can have default values.

fun displayCountry(country: String = "Canada") {
    println("I am from $country")
}

displayCountry("Sweden")
displayCountry("Brazil")
displayCountry("USA")
displayCountry()  // Uses default value

// Return Values
// A function can return a value using the 'return' statement.

fun multiplyByFive(x: Int): Int {
    return 5 * x
}

println(multiplyByFive(3))
println(multiplyByFive(7))
println(multiplyByFive(10))

// Recursion (Advanced)
// Recursion is when a function calls itself.
// Use recursion carefully to avoid infinite loops.

fun triRecursion(k: Int): Int {
    return if (k > 0) {
        val result = k + triRecursion(k - 1)
        println(result)
        result
    } else {
        0
    }
}

triRecursion(6)
/*--------------------------------------------------------------------*/
// Kotlin Collections
// In programming, sometimes you work with single items, but often you need to manage groups of data.
// Kotlin provides several collection types to handle data sets.

// Kotlin Collection Types
// Kotlin has four main types of collections:
// List - Ordered and mutable, allows duplicates.
// Set - Unordered and unique, no duplicate entries.
// Map - Key-value pairs, unordered but changeable, keys are unique.
// Array - Fixed size and type, supports primitive types and objects.

// Lists
// A list in Kotlin is an ordered collection that allows duplicates.
// Lists can store multiple values and access them by index.

val myList = mutableListOf<String>()  // Empty mutable list
val animals = mutableListOf("cat", "dog", "fish", "bird")  // List of strings
val numbers = mutableListOf(1, 7, 64, 873)  // List of numbers

// Accessing Elements
println(animals[0])  // cat
println(numbers[1])  // 7

// Negative indexing is not supported, but 'last()' and 'takeLast()' can help.
println(animals.last())  // bird
println(numbers.takeLast(2))  // [64, 873]

// Modifying Lists
// Lists are mutable by default and can be modified.
animals[3] = "hamster"  // Change an element
animals.add("squirrel")  // Add a new element
animals.removeAt(2)  // Remove element by index

// Tuples (in Kotlin, use Pair or Triple)
// Tuples store multiple values in a single object.

val weekdays = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday")

// Sets
// A set is a collection of unique elements.
val animalSet = mutableSetOf("cat", "dog", "goldfish", "bird", "cat")
println(animalSet)  // Duplicates are automatically removed

// Dictionaries (Maps)
// Maps store key-value pairs.
val marbles = mutableMapOf("red" to 34, "green" to 30, "brown" to 31, "yellow" to 29)
val student = mutableMapOf("name" to "Rand", "age" to 15)

println("Rand" in student.values)  // true

// Arrays
// Arrays have fixed sizes and types.
val fruits = arrayOf("apple", "banana", "cherry")
println(fruits.size)  // 3

// Accessing a Range of Values
println(fruits.sliceArray(1..2).joinToString())  // banana, cherry

// Modifying Arrays
fruits[1] = "pear"
println(fruits.joinToString())

// Insert and Remove
val newFruits = fruits.toMutableList()
newFruits.add(3, "apple")  // Insert
newFruits.remove("cherry")  // Remove by value

// Joining Collections
val moreFruits = listOf("kiwi", "peach")
newFruits.addAll(moreFruits)
println(newFruits.joinToString())

// Loops with Collections
for (fruit in newFruits) {
    println(fruit)
}

// Nested Loops
val adjectives = listOf("red", "big", "tasty")
for (adj in adjectives) {
    for (fruit in newFruits) {
        println("$adj $fruit")
    }
}

// Checking for Item Existence
if ("apple" in newFruits) {
    println("Yes, apple is in the fruits list")
}
/*-----------------------------------------------------------------------------*/
