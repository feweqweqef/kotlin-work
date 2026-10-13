// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "My name is Barry Allen"
    
    
    println(text.howMany { it == 'B'})
    println(text.howMany { it.isDigit()})
    println(text.howMany { it.isUpperCase()})
    
}
