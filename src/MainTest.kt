// src/MainTest.kt

// src/MainTest.kt

/**
 * Simple function to check a guess against the target number.
 */
fun checkGuess(guess: Int, target: Int): String {
    return when {
        guess < target -> "Too low!"
        guess > target -> "Too high!"
        else -> "Correct!"
    }
}

/**
 * Basic unit tests for the checkGuess function.
 */
fun testCheckGuess() {
    assert(checkGuess(50, 60) == "Too low!") { "Test 1 failed! Expected 'Too low!'" }
    assert(checkGuess(70, 60) == "Too high!") { "Test 2 failed! Expected 'Too high!'" }
    assert(checkGuess(60, 60) == "Correct!") { "Test 3 failed! Expected 'Correct!'" }

    println("✅ All tests passed successfully!")
}

fun main() {
    println("Running unit tests for checkGuess...")
    testCheckGuess()
}
