package org.example.Lesson_1

fun main() {
    val length: Long = 40_868_600_000        // Int не помещает, нужен Long
    val age: Byte = 27                       // помещается в Byte
    val partOfDay: Float = 0.075f            // хватает точности Float
    val seconds: Short = 6480                // помещается в Short
    val partOfYear: Double = 2.0547945205479453E-4  // нужна высокая точность → Double
    val apogee: Int = 327_000                // помещается в Int

    // вывод с новой строки!
    println(length)
    println(age)
    println(partOfDay)
    println(seconds)
    println(partOfYear)
    println(apogee)
}
