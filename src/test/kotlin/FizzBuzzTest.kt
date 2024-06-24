import kotlin.test.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun testFizzBuzzOnOneReturnsOne() {
        val fizzBuzz = FizzBuzz()
        assertEquals("1", fizzBuzz.fizzBuzz(1))
        assertEquals("2", fizzBuzz.fizzBuzz(2))
        assertEquals("Fizz", fizzBuzz.fizzBuzz(3))
        assertEquals("Buzz", fizzBuzz.fizzBuzz(5))
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15))
    }
}