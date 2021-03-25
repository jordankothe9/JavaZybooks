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
public class Exercise05_33 {
    public static void main(String[] args){
        for (int i = 1; i < 10000; i++) {
            if(isPerfectNumber(i))
                System.out.println(i + " is a perfect number");
        }
    }
    
    public static boolean isPerfectNumber(int number){
        int sum = 0;
        for (int k = 1; k < number; k++) {
            if (number % k == 0)
                sum+= k;
        }
        return (sum == number);
    }
}
