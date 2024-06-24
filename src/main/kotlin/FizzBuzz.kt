class FizzBuzz {
    fun fizzBuzz(number: Int): String {
        return if (number % 3 == 0 && number % 5 == 0) { "FizzBuzz" }
        else if (number % 5 == 0) { "Buzz" }
        else if (number % 3 == 0) { "Fizz" }
        else number.toString()
    }
}