package Chapter2;


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
public class Exercise02_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double total, subtotal, tip, gratRate, gratRatePercent;
        System.out.print("Enter the subtotal in dollars:");
        subtotal = input.nextDouble();
        System.out.println("");
        System.out.print("Enter the Gratuity rate in Percent");
        gratRatePercent = input.nextDouble();
        
        gratRate = gratRatePercent / 100;
        tip = subtotal * gratRate;
        total = tip + subtotal;
        System.out.println("The tip is: " + tip);
        System.out.println("The total is: " + total);
    }
}
