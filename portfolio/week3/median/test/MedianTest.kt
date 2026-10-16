// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Median of 1 element is that element"{
        median(listOf(7.0f)) shouldBe (7.0f plusOrMinus tolerance)
    }
    
    "Median of 2 elements is their average"{
        median(listOf(2.0f, 7.0f)) shouldBe (4.5f plusOrMinus tolerance)
    }
    
    "Median of 3 elements is the middle one"{
        median(listOf(1.0f, 5.0f, 2.0f)) shouldBe (2.0f plusOrMinus tolerance)
    }
    
    "Median of 4 elements should be the average of the middle 2 elements"{
        median(listOf(2.0f, 6.0f, 1.0f, 3.0f)) shouldBe (2.5f plusOrMinus tolerance)
    }
    
})
