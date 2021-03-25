
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
public class Exercise08_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3 by 4 matrix row by row: ");
        double[][] array = new double[3][4];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        
        for (int col = 0; col < array[0].length; col++) {
            System.out.println("Sum of the elements at column " + col + " is " + sumColumn(array, col));
        }
    }

    public static double sumColumn(double[][] m, int columnIndex) {
        double total = 0;
        for (int row = 0; row < m.length; row++) {
            total += m[row][columnIndex];
        }
        return total;
    }
}
