// Task 6.3: unit tests for grade()

import kotlin.test.Test
import kotlin.test.assertEquals

class GradeTest {
    // Write tests here
    @Test
    fun `Mark of 55 gives a Pass`() {
        assertEquals("Pass", grade(55))
    }
    @Test
    fun `Mark of 39 gives a Fail`(){
        assertEquals("Fail", grade(39))
    }
}
