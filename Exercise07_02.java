
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
public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] iTenInts = new int[10];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a digit: ");
            iTenInts[index] = input.nextInt();
            index++;
        }
        System.out.print("The reversal of the input is ");
        for (int i = iTenInts.length-1; i >= 0;  i--) {
            System.out.print(iTenInts[i] + " ");
        }
    }
}
