// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.isEmpty()){
        println("No filename provided")
        exitProcess(1)
    }
    
    val filename = args[0]
    
    try {
        
        val data = readData(filename)
        val result = variance(data)
        
        println("Size: ${data.size}")
        println("Variance: %.5f".format(result))
    } catch (e: Exception){
        println("Error: ${e::class.simpleName}: ${e.message}")
        exitProcess(1)
    }
}
