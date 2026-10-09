// Task 7.7.1: program to compute stats for a numeric dataset
import kotlin.system.exitProcess
fun main(args: Array<String>){
    if (args.size != 1){
        println("Please provide the name of the data file")
    }
    
    val data = readData(args[0])
    displayStats(data)
}