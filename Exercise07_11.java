
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
public class Exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers and hit enter: ");
        double[] UserInputArray = new double[10];
        
        for (int index = 0; index < UserInputArray.length; index++)
            UserInputArray[index] = input.nextDouble();
       
        System.out.println("The mean is " + mean(UserInputArray));
        System.out.println("The standard deviation is " + deviation(UserInputArray));
    }
    
    public static double deviation (double[] array){
        double deviation = 0;
        double mean = mean(array);
        for (double i: array){
            deviation += Math.pow(i - mean, 2);
        }
        return Math.sqrt(deviation / (array.length - 1));
    }
    
    public static double mean(double[] array){
        double mean = 0;
        for (double i: array){
            mean += i;
        }
        return mean / array.length;
    }
}
