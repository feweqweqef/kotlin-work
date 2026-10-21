// Task 12.8.1: demo program for Day enum class
fun main(){
    println("Enter a day: ")
    val name = readln()
    
    try {
        val day = Day.valueOf(name)
        println("You entered $day")
    }catch (e: IllegalArgumentException){
        println("Invalid Day!")
        println("Valid options: ${Day.entries.joinToString()}")
    }
}