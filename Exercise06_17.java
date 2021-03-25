
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
public class Exercise06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        printMatrix(input.nextInt());
    }
    
    public static void printMatrix(int n){
        
//vertical loop
        for (int i = 1; i <= n; i++) {
            //horizontal loop:
            for (int j = 1; j <= n; j++) {
                System.out.print((int)(Math.random()*2) + " ");
            }
            System.out.println("");
        }
    }
}
