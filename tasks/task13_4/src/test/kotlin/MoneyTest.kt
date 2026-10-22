// Task 13.4: unit tests for Money class

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : FreeSpec({
    // Write your unit tests here
    
    "€1.50 + €1.00 is €2.50" {
    Money(1, 50) + Money(1, 0) shouldBe Money(2, 50) 
}

"€1.50 + €2.00 is €3.50" {
    Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
}

"€2.99 + €0.01 is €3.00" {
    Money(2, 99) + Money(0, 1) shouldBe Money(3, 0)
}
})
