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
public class Exercise06_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers sperated by spaces or enters: ");
        double iUserNum1 = input.nextDouble();
        double iUserNum2 = input.nextDouble();
        double iUserNum3 = input.nextDouble();
        displaySortedNumbers(iUserNum1, iUserNum2, iUserNum3);
    }
    
    public static void displaySortedNumbers(double num1, double num2, double num3){
        double temp;
        
        if(num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }
}
