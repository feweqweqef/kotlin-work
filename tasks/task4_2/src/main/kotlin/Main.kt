// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU: ")
    println("a. pepperoni")
    println("b. cheese")
    println("c. margherita")
    println("d. vegetarian")
    
    print("Choose your pizza(a-d): ")
    val input = readln().lowercase()
    
    if (input.length == 1){
        val choice = input[0]
        
        if (choice in 'a'..'d'){
            println("Order sent!")
        }else{
            println("Invalid option chosen")
        }
    }else{
        println("Invalid")
    }
    
    
    
}
