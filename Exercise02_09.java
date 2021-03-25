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
public class Exercise02_09 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting velocity:");
        double startVelocity = input.nextDouble();
        System.out.println("");
        System.out.print("Enter the ending velocity");
        double endVelocity = input.nextDouble();
        System.out.println("");
        System.out.print("Enter the time span in seconds");
        double tSpan = input.nextDouble();
        System.out.println("");
        
        double averageAcceleration = (endVelocity - startVelocity)/tSpan;
        
        System.out.println("The average acceleration is: " + averageAcceleration);
        
    }
}
