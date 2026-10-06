// Task 5.1.2: main program

/*fun main(){
    println(rollDie(6))
    println(rollDie(10))
    println(rollDie(7))
}*/
import kotlin.system.exitProcess

    
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide the number of sides")
        exitProcess(1)
    }

    val sides = args[0].toIntOrNull()
    if (sides == null) {
        println("Sides must be a whole number")
        exitProcess(1)
    }

    val result = rollDie(sides)
    if (result > 0) {
        println("Rolling a d$sides... you rolled $result")
    }
}