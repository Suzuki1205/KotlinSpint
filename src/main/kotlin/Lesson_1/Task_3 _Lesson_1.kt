package org.example.Lesson_1

    fun main() {
        // Год полёта Юрия Гагарина
        val year = 1961

        // Время взлёта: 09:07 (9 часов 7 минут)
        var hour = 9
        var minute = 7

        // Вывод
        println(year)
        println(hour)
        println(minute)
        // Меняем значения на время посадки: 10:55
        hour = 10
        minute = 55
        //задаем нужный формат
        println("$hour:$minute")
    }
