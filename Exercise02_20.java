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
public class Exercise02_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double interest = balance * (annualInterestRate/1200);
        interest = (double)Math.round(interest * 100d)/100d;
        System.out.println("The interest for the next month is: " + interest);
        
    }
}
