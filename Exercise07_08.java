
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
public class Exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double values: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();
        System.out.println("The average value is " + average(array));
    }
    
    public static double average(double[] array){
        double sum = 0;
        for(double i : array){
            sum += i;
        }
        double average = sum/array.length;
        return average;
    }
    
    public static int average(int[] array){
        int sum = 0;
        for(int i : array)
            sum += i;
        int average = sum/array.length;
        return average;
    }
}
