// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 1){
        println("Enter 1 number as the limit")
        exitProcess(1)
    }
    
    val limit = args[0].toInt()
    var sum = 0
    
    for (i in 1..limit step 2){
        sum += 1
    }
    
    println("Sum of odd integers up to $limit: $sum")
}
