
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
public class Exercise08_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[][] a = new double[3][3];
        double[][] b = new double[a.length][a[0].length];
        
        System.out.println("Enter matrix1");
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = input.nextDouble();
            }
        }
        
        System.out.println("Enter matrix2");
        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                b[row][col] = input.nextDouble();
            }
        }
        
        double[][] c = addMatrix(a, b);
        System.out.printf(" %.1f %.1f %.1f      %.1f %.1f %.1f      %.1f %.1f %.1f \n", a[0][0], a[0][1], a[0][2], b[0][0], b[0][1], b[0][2], c[0][0], c[0][1], c[0][2]);
        System.out.printf(" %.1f %.1f %.1f  +   %.1f %.1f %.1f  =   %.1f %.1f %.1f \n", a[1][0], a[1][1], a[1][2], b[1][0], b[1][1], b[1][2], c[1][0], c[1][1], c[1][2]);
        System.out.printf(" %.1f %.1f %.1f      %.1f %.1f %.1f      %.1f %.1f %.1f \n", a[2][0], a[2][1], a[2][2], b[2][0], b[2][1], b[2][2], c[2][0], c[2][1], c[2][2]);
    }
    
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c = new double[a.length][a[0].length];
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < b.length; col++) {
                c[row][col] = a[row][col] + b[row][col];
            }
        }
        return c;
    }
}
