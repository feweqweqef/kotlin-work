// Task 7.7.2: phone book simulator

import kotlin.io.path.Path
import kotlin.io.path.exists

const val CSV_FILENAME = "phone.csv"

fun main() {
    val db = createDatabase()
    if (Path(CSV_FILENAME).exists()) {
        db.load(CSV_FILENAME)
    }

    while (true) {
        print("Enter a name (blank to quit): ")
        val name = readln().trim()
        if (name.isEmpty()) break

        val number = db[name]
        if (number != null) {
            println("$name: $number")
        } else {
            print("No entry for $name. Enter their phone number: ")
            val newNumber = readln().trim()
            if (newNumber.isNotEmpty() && newNumber.all { it.isDigit() }) {
                db[name] = newNumber
                db.save(CSV_FILENAME)
                println("Saved!")
            } else {
                println("Numbers must be digits only, not saved.")
            }
        }
    }
}