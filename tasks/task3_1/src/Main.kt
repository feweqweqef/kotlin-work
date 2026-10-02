// Task 3.1: command line arguments

import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.isEmpty()){
        println("Please provide a command-line argument")
    }else{
        println("Hello, ${args[0]}!")
        exitProcess(1)
    }
}