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
public class Exercise05_12 {
    public static void main(String[] args){
        int n = 0;
        while (Math.pow(n, 2) <= 12000){
            n++;
        }
        System.out.println("The smallest n value is " + n);
    }
}
