// src/MainTest.kt

fun testCheckGuess() {
    fun checkGuess(guess: Int, target: Int): String {
        return when {
            guess < target -> "Too low!"
            guess > target -> "Too high!"
            else -> "Correct!"
        }
    }

    assert(checkGuess(50, 60) == "Too low!") { "Test 1 failed!" }
    assert(checkGuess(70, 60) == "Too high!") { "Test 2 failed!" }
    assert(checkGuess(60, 60) == "Correct!") { "Test 3 failed!" }

    println("All tests passed!")
}

fun main() {
    testCheckGuess()
}