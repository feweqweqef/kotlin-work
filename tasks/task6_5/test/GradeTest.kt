// Task 6.5: unit tests for grade()

import io.kotest.assertions.assertSoftly
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe


@Suppress("unused")
class GradeTest : FreeSpec({
    // Write your tests in here
    "Mark of 55 gives a Pass"{
        grade(55) shouldBe "Pass"
    } 
    
    "Mark of 70 gives a Distintion"{
        grade(70) shouldBe "Distinction"
    }
    
    "Mark of 39 gives a Fail"{
        grade(39) shouldBe "Fail"
    }
})
