
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investmentAmout = input.nextDouble();
        System.out.println("Enter the interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        monthlyInterestRate = (monthlyInterestRate / 12)/100;
        System.out.println("Years        Future Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("%2d                %8.2f\n", i, futureInvestmentValue(investmentAmout, monthlyInterestRate, i));
        }
    }
    
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years*12));
        return futureInvestmentValue;
    }
}
