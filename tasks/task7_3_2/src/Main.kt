fun main() {
    val numbers = mutableListOf(9, 3, 6, 2, 8, 5)

    println(numbers)
    println(numbers[0])
    println(numbers.slice(2..4))
    println(numbers.first())
    println(numbers.last())

    numbers.add(1)
    println(numbers)
    numbers.add(0, 7)
    println(numbers)
    numbers.addAll(listOf(4, 4))
    numbers.remove(4)
    println(numbers)

    numbers.removeAt(0)
    println(numbers)

    numbers[1] = 10
    println(numbers)

    numbers.sort()
    println(numbers)

    numbers.reverse()
    println(numbers)

    numbers.clear()
    println(numbers)
}