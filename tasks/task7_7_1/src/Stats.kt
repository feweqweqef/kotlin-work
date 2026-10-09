// Task 7.7.1: statistics functions
fun median(values: List<Float>): Float{
    val sorted = values.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1){
        sorted[mid]
        
    } else{
        (sorted[mid-1] + sorted[mid]) / 2
    }
    
}
fun displayStats(values: List<Float>) {
    println("Count:  ${values.size}")
    println("Min:    ${values.min()}")
    println("Max:    ${values.max()}")
    println("Mean:   ${values.average()}")
    println("Median: ${median(values)}")
}