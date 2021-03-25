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
public class Exercise02_14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double pounds = input.nextDouble();
        System.out.println("Enter your Height in inches: ");
        double inches = input.nextDouble();
        double kilograms = pounds * 0.45359237;
        double meters = inches * 0.0254;
        double sqrOfMeters = Math.pow(meters, 2);
        double BMI = kilograms/sqrOfMeters;
        System.out.println("BMI is: " + BMI);
    }
}
