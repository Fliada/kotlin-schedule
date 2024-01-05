package com.example.kotlin_schedule

import com.example.kotlin_schedule.item.DayItem
import com.example.kotlin_schedule.item.LessonItem

object DayDataStorage {

    val daysFirstWeek = listOf(
        DayItem(
            dayNumber = 2,
            listOf(
                LessonItem(
                    accountNumber = 5,
                    lessonName = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ЛЕК.)",
                    teacherName = "ТКАЧ Е.С",
                    audience = "АУД. 221 (Л.З.) (2 корпус)"
                ),
                LessonItem(
                    accountNumber = 7,
                    lessonName = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    teacherName = "БАРАБАНЩИКОВ И.В.",
                    audience = "АУД. 413"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ЛЕК.)",
                    teacherName = "БАРАБАНЩИКОВ И.В.",
                    audience = "АУД. 413"
                ),
            )
        ),
        DayItem(
            dayNumber = 3,
            listOf(
                LessonItem(
                    accountNumber = 7,
                    lessonName = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ",
                    teacherName = "Андрей и Влад",
                    audience = "АУД. 200"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ",
                    teacherName = "Андрей и Влад",
                    audience = "АУД. 200"
                ),
            )
        ),
        DayItem(
            dayNumber = 4,
            listOf(
                LessonItem(
                    accountNumber = 6,
                    lessonName = "АНАЛИЗ ДАННЫХ (ЛЕК.)",
                    teacherName = "АЛЮКОВ С.В",
                    audience = "А-13"
                ),
                LessonItem(
                    accountNumber = 7,
                    lessonName = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    teacherName = "БАРАБАНЩИКОВ И.В",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    teacherName = "БАРАБАНЩИКОВ И.В",
                    audience = "АУД. 132"
                ),
            )

        ),
        DayItem(
            dayNumber = 5,

            listOf(
                LessonItem(
                    accountNumber = 8,
                    lessonName = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    teacherName = "ПАВЛИЧЕНКОВ Е.А",
                    audience = "АУД. 132"
                ),
            )
        ),
        DayItem(
            dayNumber = 6,

            listOf(
                LessonItem(
                    accountNumber = 2,
                    lessonName = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ЛЕК.)",
                    teacherName = "ВЕРИГИН Н.В.",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 3,
                    lessonName = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    teacherName = "ВЕРИГИН Н.В.",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 4,
                    lessonName = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    teacherName = "ВЕРИГИН Н.В.",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 5,
                    lessonName = "ТЕХНОЛОГИИ ПРИКЛАДНОГО ПРОГРАММИРОВАНИЯ (ПР.)",
                    teacherName = "ВЕРИГИН Н.В.",
                    audience = "АУД. 132"
                ),
            )
        ),
    )

    val daysSecondWeek = listOf(
        DayItem(
            dayNumber = 2,

            listOf(
                LessonItem(
                    accountNumber = 6,
                    lessonName = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    teacherName = "ТКАЧ Е.С",
                    audience = "АУД. 304(2 корпус)"
                ),
                LessonItem(
                    accountNumber = 7,
                    lessonName = "ЭКОНОМИКА ПРОГРАММНОЙ ИНЖЕНЕРИИ (ПР.)",
                    teacherName = "ТКАЧ Е.С",
                    audience = "АУД. 304(2 корпус)"
                ),
            )
        ),
        DayItem(
            dayNumber = 3,

            listOf(
                LessonItem(
                    accountNumber = 7,
                    lessonName = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ЛЕК.)",
                    teacherName = "Андрей и Влад",
                    audience = "АУД. 200"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "УПРАВЛЕНИЕ ИТ-ПРОЕКТАМИ И ЖИЗНЕННЫМ ЦИКЛОМ ПО (ПР.)",
                    teacherName = "Андрей и Влад",
                    audience = "АУД. 200"
                ),
            )
        ),
        DayItem(
            dayNumber = 4,

            listOf(
                LessonItem(
                    accountNumber = 6,
                    lessonName = "АНАЛИЗ ДАННЫХ (ПР.)",
                    teacherName = "АЛЮКОВ С.В",
                    audience = "АУД. 132Б"
                ),
                LessonItem(
                    accountNumber = 7,
                    lessonName = "АНАЛИЗ ДАННЫХ (ПР.)",
                    teacherName = "АЛЮКОВ С.В",
                    audience = "АУД. 132Б"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "БАЗЫ И ХРАНИЛИЩА ДАННЫХ (ПР.)",
                    teacherName = "БАРАБАНЩИКОВ И.В",
                    audience = "АУД. 132А"
                ),
            )

        ),
        DayItem(
            dayNumber = 5,

            listOf(
                LessonItem(
                    accountNumber = 7,
                    lessonName = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ЛЕК.)",
                    teacherName = "ПАВЛИЧЕНКОВ Е.А",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 8,
                    lessonName = "РАЗРАБОТКА ИНТЕРНЕТ-ПРИЛОЖЕНИЙ (ПР.)",
                    teacherName = "ПАВЛИЧЕНКОВ Е.А",
                    audience = "АУД. 132"
                ),
            )

        ),
        DayItem(
            dayNumber = 6,

            listOf(
                LessonItem(
                    accountNumber = 2,
                    lessonName = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    teacherName = "БУЛАВИН Р.С",
                    audience = "АУД. 132"
                ),
                LessonItem(
                    accountNumber = 3,
                    lessonName = "ТЕСТИРОВАНИЕ ПРОГРАММНОГО ОБЕСПЕЧЕНИЯ (ПР.)",
                    teacherName = "БУЛАВИН Р.С",
                    audience = "АУД. 132"
                ),
            )
        ),
    )
}