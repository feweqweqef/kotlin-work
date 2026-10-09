import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Please provide a dice spec like 3d8")
        exitProcess(1)
    }

    val parts = args[0].split("d")
    val count = parts[0].toIntOrNull()
    val sides = parts.getOrNull(1)?.toIntOrNull()

    if (parts.size != 2 || count == null || sides == null) {
        println("Dice spec must look like 3d8")
        exitProcess(1)
    }

    rollDice(sides = sides, count = count)
}