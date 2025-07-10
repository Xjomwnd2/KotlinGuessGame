// src/Main.kt

fun main() {
    val secretNumber = (1..100).random()
    println("Welcome to Guess The Number!")
    println("I'm thinking of a number between 1 and 100. Can you guess it?")

    while (true) {
        print("Enter your guess: ")
        val guess = readLine()?.toIntOrNull()

        if (guess == null) {
            println("Please enter a valid number!")
            continue
        }

        when {
            guess < secretNumber -> println("Too low! Try again.")
            guess > secretNumber -> println("Too high! Try again.")
            else -> {
                println("Correct! The number was $secretNumber.")
                break
            }
        }
    }
}
