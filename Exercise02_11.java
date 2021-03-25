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
public class Exercise02_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();
        int currentYear = 0;
        
        double yearlypopgrowth, secinyear, yearlybirths, yearlydeaths, yearlyimm;
        int currentpop;
        //yearlyimm = number of immagrants every year
        //yearly* number of each stat in a year
        secinyear = 60 * 60 * 24 * 365;
        yearlybirths = secinyear / 7.0;
        yearlydeaths = secinyear / 13.0;
        yearlyimm = secinyear / 45.0;
        yearlypopgrowth = yearlybirths + yearlyimm - yearlydeaths;
        currentpop = 312032486;
        while (currentYear < years){
            currentpop = (int)(yearlypopgrowth + currentpop);
            currentYear = currentYear + 1;
        }
        System.out.println("The poplulation in " + years + " years is " + currentpop);
    }
    
    
}
