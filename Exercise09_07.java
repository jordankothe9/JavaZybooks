
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise09_07 {
    public static void main(String[] args) {
        Account JordansAccount = new Account(1122, 20000, 4.5);
        JordansAccount.withdraw(2500);
        JordansAccount.deposit(3000);
        
        
        System.out.println(JordansAccount);
    }
}

class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    
    public Account(int newID, double NewBalance, double NewInterestRate){
        id = newID;
        balance = NewBalance;
        annualInterestRate = NewInterestRate;
        dateCreated = new Date();
    }
    
    public int getID(){
        return id;
    }
    
    public void setID(int newID){
        id = newID;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double newBalance){
        balance = newBalance;
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double newRate){
        if(newRate > 0.0 && newRate < 100.0)
            annualInterestRate = newRate;
    }
    
    public Date dateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return (annualInterestRate/12.0) / 100.0;
    }
    
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()* balance;
    }
    
    public void withdraw(double amountToWithdraw){
        if(amountToWithdraw<=balance)
            balance -= amountToWithdraw;
    }
    
    public void deposit(double amountToDeposit){
        if(amountToDeposit>=0)
            balance += amountToDeposit;
    }
    
    public String toString(){
        return "Balance: $" + balance + "\n" +
                "Monthly interest: $" + getMonthlyInterest() + "\n" +
                "Date created: " + dateCreated();
    }
}
