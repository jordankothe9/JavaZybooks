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
public class Exercise02_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double degreesF, degreesC;
        System.out.println("Enter the Temperature in Celsius:");
        degreesC = input.nextDouble();
        degreesF = (9.0/5.0) * degreesC + 32.0;
        System.out.print(degreesF + "Degrees Fahrenheit is " + degreesC + " Degrees Celsius");
        
    }
}
