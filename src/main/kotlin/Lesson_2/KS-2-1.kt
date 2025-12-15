const val STUDENT_COUNT = 4
const val DECIMAL_PLACES = 2

fun main() {
    val score1 = 3
    val score2 = 4
    val score3 = 3
    val score4 = 5

    val averageScore = (score1 + score2 + score3 + score4).toDouble() / STUDENT_COUNT

    println(String.format("%.${DECIMAL_PLACES}f", averageScore))
}