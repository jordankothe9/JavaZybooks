package Chapter5;

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
public class Exercise05_30 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly deposit: ");
        double dMonthlyDeposit = input.nextDouble();
        System.out.print("Enter the annual interest rate Ex. 5 for 5% ");
        double dInterestRate = input.nextDouble();
        dInterestRate *= .01;
        double dMonthlyInterestRate = dInterestRate / 12;
        System.out.print("Enter the number of months: ");
        int iMonths = input.nextInt();
        
        
        double dTotal = dMonthlyDeposit * (1 + dMonthlyInterestRate);
        for (int i = 1; i < iMonths; i++) {
            dTotal = (dMonthlyDeposit + dTotal) * (1 + dMonthlyInterestRate);
        }
        System.out.println("Amount of Money in Savings after " + iMonths + " is " + dTotal);
    }
}
