package com.example.bankaccountprogram

fun main(){
    val denisesBankAccount = BankAccount("Denis Panjute",1235.34)

    denisesBankAccount.deposit(200.00)
    denisesBankAccount.deposit(450.98)
    denisesBankAccount.withdraw(10.34)
    denisesBankAccount.withdraw(180.94)
    denisesBankAccount.displayTransactionHistory()
    println("\n${denisesBankAccount.accountHolder}'s Account Balance is $${denisesBankAccount.acctBalance()}\n")


    val SarahBankAccount = BankAccount("Sarah",0.00)
    SarahBankAccount.deposit(100.00)
    SarahBankAccount.withdraw(10.00)
    SarahBankAccount.deposit(300.00)
    SarahBankAccount.displayTransactionHistory()
    println("\n${SarahBankAccount.accountHolder}'s Account Balance is $${SarahBankAccount.acctBalance()}\n")

}