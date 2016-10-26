/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

/**
 *
 * @author Befkadu Degefa
 */
public class Account
{
    // Magnus testar 2
    private double balance;
    private String accountType;
    private double interestRate = 2;    
    private static int accountID = 1000;
    private double depositIntrest = 1;
    private int counter=0;
   
    /**
     * Default constructor
     */
    public Account()  { }
 
    public Account(String accountType, double interestRate)
    {
        
        //this.balance = balance;
        this.accountType = accountType;
        this.interestRate=interestRate;
        accountID++;
        
       
    }
 
    public double getBalance()
    {
        return balance;
    }
 
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
 
   
    public String getAccountType()
    {
        return accountType;
    }
 
    public int getAccountID()
    {
        return accountID;
    }
 
    public void setAccountID(int accountID)
    {
        this.accountID = accountID;
    }
   
   
    public void deposit(double depositAmount)
    {
        balance = depositAmount + balance +(depositIntrest * depositAmount/100) ;
    }  
   
    public void withdraw(double withdrawAmount)
    {
        //balance = balance -withdrawAmount;
        if(counter == 0)
            {
            balance = balance - withdrawAmount;
            counter++;
            }
            
        else if(counter>0)
            {
                balance = balance - withdrawAmount-(withdrawAmount*interestRate)/100;
            }
    }
    public double getInterestRate()
    {
        return interestRate;
    }
 
    public void setInterestRate(double interestRate)
    {
        this.interestRate = interestRate;
    }
 
    @Override
    public String toString()
    {
        return "InterestRate=" + interestRate +  ", Balance: " + getBalance()+ ", Account number " +
                accountID + ", Account type: " + accountType;
    }
}