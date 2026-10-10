// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{
    val arg_1 = triangle.first
    val arg_2 = triangle.second
    val arg_3 = triangle.third
    
    return arg_1 < arg_2 + arg_3 && arg_2 < arg_1 + arg_3 && arg_3 < arg_1 + arg_2
    
    
}

fun triangleArea(triangle: Triangle): Double{
    val arg_1 = triangle.first
    val arg_2 = triangle.second
    val arg_3 = triangle.third
    
    val a = (arg_1 + arg_2 + arg_3) / 2
    
    return sqrt(a * (a-arg_1) * (a-arg_2)* (a-arg_3))
}
