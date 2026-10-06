// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3){
        println("Valid temperatures not inputted")
        exitProcess(1)
    }
    
    val inital_temp = args[0].toFloat()
    val max_temp = args[1].toFloat()
    val inc_temp = args[2].toFloat()
    
    var celsius = inital_temp
    
    while (celsius <= max_temp){
        val farenheit = celsius * 1.8 + 32
        println("%.1f".format(celsius).padStart(8) + "%.1f".format(farenheit).padStart(10))
        celsius += inc_temp
        
    }
    
}
