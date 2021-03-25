
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
public class Exercise07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[] appeared = new boolean[10];
        for (int i = 0; i < 10; i++) {
            appeared[input.nextInt()] = true;
        }
        int iDistinctInts = 0;
        for (int i = 0; i < 10; i++) {
            if(appeared[i])
                iDistinctInts++;
        }
        System.out.println("The number of distinct integers is " + iDistinctInts);
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < 10; i++) {
            if(appeared[i])
                System.out.print(i + " ");
        }
    }
}
