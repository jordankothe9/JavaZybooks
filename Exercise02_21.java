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
public class Exercise02_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        System.out.println("Enter the number of years: ");
        double nOfYears = input.nextDouble();
        double monthlyInterestRate = annualInterestRate/1200.0;
        double temp = Math.pow((1 + (monthlyInterestRate)), nOfYears*12);
        double futureInvestmentValue = investmentAmount * temp;
        System.out.println("Future value is: " + futureInvestmentValue);
        
    }
}
