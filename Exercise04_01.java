
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
public class Exercise04_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double R = input.nextDouble();
        System.out.println("The area of the pentagon is: " + getAreaOfPentagon(R));
        
    }
    
    public static double getAreaOfPentagon(double R){
        return (5*Math.pow(getSideLengthOfPentagon(R), 2))   /(4*Math.tan(Math.PI/5.0));
    }
    
    public static double getSideLengthOfPentagon(double R){
        return 2.0*R*Math.sin(Math.PI/5.0);
    }
}
