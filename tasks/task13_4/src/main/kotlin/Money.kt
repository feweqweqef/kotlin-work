// Task 13.4: Money class
class Money(euros: Int, cents: Int) {
    val euros = 1
    val cents = 50
}

class Money(euros: Int, cents: Int) {
    val euros = euros
    val cents = cents
}

class Money(val euros: Int, val cents: Int)

data class Money(val euros: Int, val cents: Int)

operator fun plus(other: Money) = Money(2, 50)
operator fun plus(other: Money) = Money(euros + other.euros, 50)

