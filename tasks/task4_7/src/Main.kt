// Task 4.7: finding the longest line in a file
import kotlin.system.exitProcess
import java.io.File

fun main (args: Array <String>){
    if (args.size != 1){
        println("Please provide one file path")
        exitProcess(1)
        
    }
    val file = File(args[0])
    if (!file.exists()){
        println("File not found: ${args[0]}")
        exitProcess(1)
    }
    
    var longestLength = 0
    var longestLineNumber = 0
    var lineNumber = 0
    
    for (line in file.readLines()){
        lineNumber++
        if(line.length > longestLength){
            longestLength = line.length
            longestLineNumber = lineNumber
        }
    }
    println("Line $longestLineNumber is the longest (length = $longestLength)")
}