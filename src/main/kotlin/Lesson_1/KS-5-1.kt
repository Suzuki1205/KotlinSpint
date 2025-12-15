package org.example.Lesson_1

    const val secondsPerMinute = 60
    const val secondsPerHour = 3600
    const val minutesPerHour = 60

    fun main() {
        val totalSeconds = 6480

        val hours = totalSeconds / secondsPerHour
        val minutes = (totalSeconds % secondsPerHour) / secondsPerMinute
        val seconds = totalSeconds % secondsPerMinute
        val timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds)
        println(timeFormatted)
    }
