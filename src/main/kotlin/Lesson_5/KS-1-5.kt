fun main() {
    val number1 = (1..10).random()
    val number2 = (1..10).random()
    val correctAnswer = number1 + number2
    println("Prove you're not a bot!")
    println("Solve the example: $number1 + $number2 = ?")
    print("Your Answer: ")
    val userAnswer = readLine()?.toIntOrNull()
    if (userAnswer == correctAnswer) {
        println("You are wellcome!")
    } else {
        println("Go to Home.")
    }
}