// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>){
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    
    val arg_1 = args[0].toDouble()
    val arg_2 = args[1].toDouble()
    val arg_3 = args[2].toDouble()
    
    val a = (arg_1 + arg_2 + arg_3) / 2
    
    val area = Math.sqrt(a * (a-arg_1) * (a-arg_2)* (a-arg_3))
    println("Area = %.5f".format(area))
    
}