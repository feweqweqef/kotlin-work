import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person("Joe", LocalDate(1997, 8, 23))
    println("${p1.name}, born ${p1.birth}, married: ${p1.isMarried}")

    val p2 = Person("Joe", "1997-08-23").apply {
        isMarried = true
    }
    println("${p2.name}, born ${p2.birth}, married: ${p2.isMarried}")
}