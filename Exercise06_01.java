
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
public class Exercise06_01 {
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++) {
            System.out.print(getPentagonalNumber(i) + " ");
            if(i%10 == 0){
                System.out.println("");
            }
        }
    }
    
    public static int getPentagonalNumber(int n){
        return n*(3*n-1)/2;
    }
}
