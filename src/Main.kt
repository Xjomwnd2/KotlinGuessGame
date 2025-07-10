// src/Main.kt

fun checkGuess(guess: Int, target: Int): String {
    return when {
        guess < target -> "Too low!"
        guess > target -> "Too high!"
        else -> "Correct!"
    }
}

fun main() {
    val numberToGuess = (1..100).random()
    println("Welcome to Guess the Number!")
    println("I am thinking of a number between 1 and 100.")
    
    var guess: Int?
    do {
        print("Enter your guess: ")
        guess = readLine()?.toIntOrNull()
        
        when {
            guess == null -> println("Please enter a valid number.")
            guess < 1 || guess > 100 -> println("Please enter a number between 1 and 100.")
            else -> {
                val result = checkGuess(guess, numberToGuess)
                println(result)
            }
        }
    } while (guess != numberToGuess)
    
    println("Thanks for playing!")
}