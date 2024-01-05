package com.example.kotlin_schedule

public class LessonHelper {
    companion object {
        public fun getLessonStartTime(accountNumber: Int): String {
            return when (accountNumber) {
                1 -> "8:00"
                2 -> "9:40"
                3 -> "11:20"
                4 -> "13:15"
                5 -> "15:00"
                6 -> "16:40"
                7 -> "18:20"
                8 -> "19:55"
                else -> "Неверный номер урока"
            }
        }

        public fun getLessonEndTime(accountNumber: Int): String {
            return when (accountNumber) {
                1 -> "9:30"
                2 -> "11:10"
                3 -> "12:50"
                4 -> "14:45"
                5 -> "16:30"
                6 -> "18:10"
                7 -> "19:50"
                8 -> "21:25"
                else -> "Неверный номер урока"
            }
        }
    }
}