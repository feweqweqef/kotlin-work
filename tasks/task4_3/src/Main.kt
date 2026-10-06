    // Task 4.3: grade calculation using a when expression
    import kotlin.math.roundToInt
    import kotlin.system.exitProcess

    fun main(args: Array<String>){
        if(args.size != 3){
            println("Invalid option")
            exitProcess(1)
        }
        
        val mark1 = args[0].toInt()
        val mark2 = args[1].toInt()
        val mark3 = args[2].toInt()
        
        val average = ((mark1 + mark2 + mark3) / 3.0).roundToInt()
        
        println("Average: $average")
        
        when (average){
            in 0..39 -> println("Fail")
            in 40..69 -> println("Pass")
            in 70..100 -> println("Distinction")
        }
        
        
        }
    


