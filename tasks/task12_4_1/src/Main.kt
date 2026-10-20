// Task 12.4.1: main program
fun main() {
    val circle = Circle(Point(0.0, 0.0), 5.0)

    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.perimeter()}")

    val inside = Point(3.0, 4.0)    // distance from centre = 5.0
    val outside = Point(6.0, 0.0)   // distance from centre = 6.0

    println("Contains (3, 4)? ${circle contains inside}")
    println("Contains (6, 0)? ${circle.contains(outside)}")
}