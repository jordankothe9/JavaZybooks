package Chapter5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise05_13 {
    public static void main(String[] args){
        int n = 0;
        while (Math.pow(n, 3) < 12000){
            n++;
        }
        n--;
        System.out.println("The value of N is: " + n);
        System.out.println("The value of N^3 is: " + Math.pow(n, 3));
    }
}
