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
public class Exercise02_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed in m/s: ");
        double v = input.nextDouble();
        //System.out.println("");
        System.out.print("Enter accleration in m/s^2: ");
        double a = input.nextDouble();
        //System.out.println("");
        
        double length = (Math.pow(v, 2))/(2*a);
        System.out.println("The minimum runway length for this airplane is: " + length + " meters.");
    }
}
