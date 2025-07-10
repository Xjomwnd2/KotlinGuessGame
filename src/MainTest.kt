// src/MainTest.kt

// Copy the checkGuess function from Main.kt for testing
fun checkGuess(guess: Int, target: Int): String {
    return when {
        guess < target -> "Too low!"
        guess > target -> "Too high!"
        else -> "Correct!"
    }
}

fun testCheckGuess() {
    println("Running tests for checkGuess function...")
    
    // Test 1: Guess too low
    val result1 = checkGuess(50, 60)
    assert(result1 == "Too low!") { "Test 1 failed: expected 'Too low!', got '$result1'" }
    println("✓ Test 1 passed: Low guess")
    
    // Test 2: Guess too high
    val result2 = checkGuess(70, 60)
    assert(result2 == "Too high!") { "Test 2 failed: expected 'Too high!', got '$result2'" }
    println("✓ Test 2 passed: High guess")
    
    // Test 3: Correct guess
    val result3 = checkGuess(60, 60)
    assert(result3 == "Correct!") { "Test 3 failed: expected 'Correct!', got '$result3'" }
    println("✓ Test 3 passed: Correct guess")
    
    println("All tests passed! ✅")
}

fun main() {
    testCheckGuess()
}