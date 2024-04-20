package com.example.bankaccountprogram

class BankAccount(var accountHolder:String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder Deposited $$amount")
    }
    fun withdraw(amount: Double){
        if(amount<=balance)
        {
            balance -=amount
            transactionHistory.add("$accountHolder Withdrew $$amount")
        }
        else
        {
            println("Insufficient Balance to withdraw $$amount")
        }
    }
    fun displayTransactionHistory(){
        println("Transaction History for $accountHolder")
        for(transaction in transactionHistory){
            println(transaction)
        }
    }
    fun acctBalance():Double{
        return balance
    }
}