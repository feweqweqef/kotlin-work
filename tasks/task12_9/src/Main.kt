// Task 12.9: demo program for class implementing Static Factory Method
import kotlinx.datetime.LocalDate

fun main(){
    val p = Person.create("Sarah", LocalDate(2005, 7, 16))
    
    //val p2 = Person.create("Sarah", LocalDate(2000, 1, 1))
}