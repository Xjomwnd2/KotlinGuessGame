// src/Main.kt

fun main() {
    val numberToGuess = (1..100).random()
    var guess: Int?
    println("Welcome to Guess the Number!")
    println("I am thinking of a number between 1 and 100.")

    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()
        if (guess == null) {
            println("Please enter a valid number.")
        } else if (guess < numberToGuess) {
            println("Too low!")
        } else if (guess > numberToGuess) {
            println("Too high!")
        } else {
            println("Correct! You guessed the number!")
        }
    } while (guess != numberToGuess)
}
