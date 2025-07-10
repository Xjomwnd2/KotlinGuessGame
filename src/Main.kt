// src/Main.kt

fun checkGuess(guess: Int, target: Int): String {
    return when {
        guess < target -> "Too low!"
        guess > target -> "Too high!"
        else -> "Correct!"
    }
}

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

        val result = checkGuess(guess, secretNumber)
        println(result)

        if (result == "Correct!") {
            break
        }
    }
}
