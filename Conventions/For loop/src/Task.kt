class DateRange(val start: MyDate, val end: MyDate):Iterable<MyDate> {
    override fun iterator(): Iterator<MyDate> {
        TODO("Not yet implemented")
    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
fun test(date:MyDate) {}


fun main() {
    test(MyDate(1,2,3))
    iterateOverDateRange(MyDate(1,2,3), MyDate(1,2,4), )
}