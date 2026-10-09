// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(sides: Int = 6, count: Int = 1){
    if (sides !in setOf(4,6,8,10,12,20)){
        println("Error: cannot have $sides-sided die")
        return 
    }
    
    var total = 0
    for (i in 1..count){
        total += Random.nextInt(1, sides +1)
    }
    println("Rolling ${count}d$sides... total is $total")
}