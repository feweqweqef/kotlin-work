// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.isEmpty()){
        println("Usage: ./kotlin run temp.csv")
    }
    
    val data = fetchData(args[0])
    
    val coldest =  data.minBy { it.second }
    val warmest = data.maxBy { it.second }
    
    println("Coldest: ${coldest.first} at ${coldest.second}") 
    println("Warmest: ${warmest.first} at ${warmest.second}")   
    
    println("Average: %.2f".format(data.sumOf { it.second } / data.size))
}
