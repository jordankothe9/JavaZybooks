
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
public class Exercise08_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of columns of the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];
        System.out.print("Enter the array: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        
        int[] largestIndex = locateLargest(array);
        System.out.println("The location of the largest element is at (" + largestIndex[0] + ", " + largestIndex[1] + ")");
    }
    
    public static int[] locateLargest(double[][] array){
        double largest = array[0][0];
        int[] largestIndex = {0, 0};
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if(array[row][col] > largest){
                    largest = array[row][col];
                    largestIndex[0] = row;
                    largestIndex[1] = col;
                }
            }
        }
        
        return largestIndex;
    }
}
