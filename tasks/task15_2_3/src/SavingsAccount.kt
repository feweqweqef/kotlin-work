// Task 15.2.3: SavingsAccount class

open class SavingsAccount(holder:String, val rate: Double) : BankAccount(holder){
    init{
        require(rate > 0){ "Interest rate must not be zero" }
        
        
    }
    
    fun applyInterest(){
            val interest =  (balance * rate / 100).toInt()
                        
            deposit(interest)
        }
}