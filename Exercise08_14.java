
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
public class Exercise08_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of a square matrix: ");
        int length = input.nextInt();
        int[][] matrix = new int[length][length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println("");
        }
        
        int n = CheckCol(matrix);
        if (n > -1) {
            System.out.println("All " + matrix[0][n] + "'s on column " + n);
        } else {
            System.out.println("No same numbers on a column");
        }
        
        n = checkRow(matrix);
        if (n > -1) {
            System.out.println("All " + matrix[n][0] + "'s on column " + n);
        } else {
            System.out.println("No same numbers on a column");
        }
        
        n = majorDiagonal(matrix);
        if (n > -1) {
            System.out.println("All " + n + "'s on a major diagonal");
        } else {
            System.out.println("No same numbers on a major diagonal");
        }
        
        n = SubDiagonal(matrix);
        if(n > -1){
            System.out.println("All " + n + "'s on a sub-diagonal");
        } else {
            System.out.println("No same numbers on the sub-diagonal");
        }

    }

    //returns the column index of a column with all the same number. -1 if no match
    public static int CheckCol(int[][] matrix) {
        int count = 0;
        for (int col = 0; col < matrix[0].length; col++) {
            count = 0;
            for (int row = 0; row < matrix.length; row++) {
                count += matrix[row][col];
            }
            if (count == matrix[0].length || count == 0) {
                return col;
            }
        }
        return -1;
    }

    //returns the row index of the first row that has all the same number
    public static int checkRow(int[][] matrix) {
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            count = 0;
            for (int col = 0; col < matrix[row].length; col++) {
                count += matrix[row][col];
            }
            if (count == matrix.length || count == 0) {
                return row;
            }
        }
        return -1;
    }

    public static int majorDiagonal(int[][] matrix) {
        boolean majorDiagonal = true;
        int upperLeft = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != upperLeft) {
                majorDiagonal = false;
            }
        }
        if (majorDiagonal) {
            return upperLeft;
        }

        int upperRight = matrix[0][matrix.length - 1];
        boolean majorDiagonal2 = true;
        int colIndex = matrix.length - 1;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][colIndex] != upperRight) {
                majorDiagonal2 = false;
            }

            colIndex--;
        }

        if (majorDiagonal2) {
            return upperRight;
        } else {
            return -1;
        }

    }

    public static int SubDiagonal(int[][] m) {
        int[] count = new int[2]; 
        
        count[0] = 0;
        count[1] = 0;
        for (int i = 0, j = m.length - 1; i < m.length; i++, j--) {
            count[m[i][j]]++;
            if (count[0] == m.length) {
                return 0;
            }
            if (count[1] == m.length) {
                return 1;
            }
        }
        return -1;
    }
}
