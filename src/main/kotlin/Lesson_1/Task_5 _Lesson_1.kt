package org.example.Lesson_1

fun main() {
    // Количество секунд, которые Гагарин провел в космосе
    val totalSeconds = 6480  // 108 минут = 6480 секунд

    // Переводим в часы, минуты и секунды
    val hours = totalSeconds / 3600
    val minutes = (totalSeconds % 3600) / 60
    val seconds = totalSeconds % 60

    // Форматируем в двухзначный формат
    val timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)

    // Вывод в консоль
    println(timeFormatted)
}