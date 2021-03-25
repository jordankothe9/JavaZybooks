
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
public class Exercise08_25 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 3 by 3 matrix row by row: ");

        double[][] m = new double[3][3];
        for (int col = 0; col < m.length; col++) {
            for (int row = 0; row < m[col].length; row++) {
                m[col][row] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(m)) {
            System.out.println("It is a Markov matrix");
        } else {
            System.out.println("It is not a Markov matrix");
        }
    }

    public static boolean isMarkovMatrix(double[][] m) {
        return isElementsPositive(m) && isEachColumnSum1(m);
    }

    public static boolean isElementsPositive(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isEachColumnSum1(double[][] m) {
        for (int col = 0; col < m.length; col++) {
            double sum = 0;
            for (int row = 0; row < m.length; row++) {
                sum += m[row][col];
            }
            if (sum != 1) {
                return false;
            }
        }
        return true;
    }

}
