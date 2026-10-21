// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person("jOhN", LocalDate(2000, 5, 15))

    println(p1.name)
}