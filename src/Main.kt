// Kotlin Guess the Number Game
// Author: Joel Ndiba Mwaura
// Date: July 2025
// Description: Classic console guess game where user tries to guess a random number.

package org.kotlinlang.play

import kotlin.random.Random
import kotlin.system.exitProcess

/**
 * Entry point of the program
 */
fun main() {
    println("Welcome to the Kotlin Guess The Number Game!")
    println("------------------------------------------------")

    // Instructions
    println("I will pick a random number between 1 and 100.")
    println("Try to guess it! Type 'exit' anytime to quit.")

    // Initialize variables
    val numberToGuess = Random.nextInt(1, 101)
    var attempts = 0

    // Keep asking until guessed or exited
    while (true) {
        print("\nEnter your guess: ")
        val userInput = readLine()

        // Check if user wants to quit
        if (userInput == null) {
            println("Invalid input. Please try again.")
            continue
        } else if (userInput.lowercase() == "exit") {
            println("Goodbye! Thanks for playing.")
            exitProcess(0)
        }

        val guess = userInput.toIntOrNull()
        if (guess == null) {
            println("Please enter a valid number.")
            continue
        }

        attempts++

        when {
            guess < numberToGuess -> println("Too low! Try again.")
            guess > numberToGuess -> println("Too high! Try again.")
            else -> {
                println("\n🎉 Congratulations! You guessed it in $attempts tries.")
                break
            }
        }
    }

    // Ask if they want to play again
    playAgain()
}

/**
 * Function to ask user if they want to play again
 */
fun playAgain() {
    print("\nWould you like to play again? (yes/no): ")
    val answer = readLine()

    if (answer != null && answer.lowercase() == "yes") {
        main() // Restart game
    } else {
        println("Thank you for playing. Goodbye!")
        exitProcess(0)
    }
}

// -------------------- Additional Functions ------------------------

/**
 * Example helper function: Validate input
 */
fun validateInput(input: String?): Boolean {
    if (input == null) return false
    if (input.lowercase() == "exit") return true
    return input.toIntOrNull() != null
}

/**
 * Example test function
 */
fun testValidation() {
    println(validateInput("50"))  // true
    println(validateInput("abc")) // false
    println(validateInput("exit")) // true
}
