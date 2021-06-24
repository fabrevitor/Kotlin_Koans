import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR; }


operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + (YEAR * 2) + (WEEK * 3) + (DAY * 5)
}

fun main() {
    println(task1(MyDate(2021,6, 17)))
}
/*

Não consegui criar a lógica, travei fazer após o .plus funcionar,
para criar o .times, necessário criar uma nova classe (RepeatedTimeInterval(timeInterval:TimeInterval, number:Int)
depois alterar a lógica e o plus

*/