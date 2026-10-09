import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        rollDie()
    } else if (args.size == 1) {
        val sides = args[0].toIntOrNull()
        if (sides == null) {
            println("Sides must be a whole number")
            exitProcess(1)
        }
        rollDie(sides)
    } else {
        println("Please provide at most one number")
        exitProcess(1)
    }
}