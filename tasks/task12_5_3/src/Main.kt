// Task 12.5.3: demo program for class with custom setter

import kotlinx.datetime.LocalDate

fun main() {
    val p1 = Person("John", LocalDate(2000, 5, 15))

    p1.name = ""
}