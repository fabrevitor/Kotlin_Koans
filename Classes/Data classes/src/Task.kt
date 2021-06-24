class Person(val name: String, val age: Int){
    override fun toString(): String {
        return "$name -> $age"
    }
}

   fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}

fun comparePeople(): Boolean {
    val p1 = Person("Alice", 29)
    val p2 = Person("Alice", 29)
    return p1 == p2  // should be true
}

fun main() {
    println(comparePeople())
    println(getPeople().toString())
}