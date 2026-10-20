// Task 12.1: program that uses a Point object
// Main.kt
fun main() {
    val p = Point(1.0, 2.0)
    println("x = ${p.x}, y = ${p.y}")

    val origin = Point(0.0, 0.0)
    println("Distance from origin: ${p.distanceTo(origin)}")

    val q = Point(4.5, 7.0)
    println("Distance from (4.5, 7.0): ${p.distanceTo(q)}")
}