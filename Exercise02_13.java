package Chapter2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Exercise02_13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Monthly Deposit: ");
        int monthlyDeposit = input.nextInt();
        double monthlyInterest = .05/12;
        double currentBalance = 0;
        
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        System.out.println("After the first month, the account value is $" + currentBalance);
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        System.out.println("After the second month, the account value is $" + currentBalance);
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        System.out.println("After the third month, the account value is $" + currentBalance);
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        //System.out.println("After the fourth month, the account value is $" + currentBalance);
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        //System.out.println("After the fifth month, the account value is $" + currentBalance);
        currentBalance = (monthlyDeposit + currentBalance) * (1 + monthlyInterest);
        System.out.println("After the sixth month, the account value is $" + currentBalance);
        
    }
}
