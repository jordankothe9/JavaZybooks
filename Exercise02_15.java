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
public class Exercise02_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();
        
        double temp = Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2);
        double result = Math.pow(temp, .5);
        
        System.out.println("The distance between the two points is" + result);
        
    }
}
