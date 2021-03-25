
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
public class Exercise06_04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iUserInput = input.nextInt();
        System.out.println(reverse2(iUserInput));
        
    }
    
    public static void reverse(int number){
        while(number > 0){
            System.out.print((number % 10));
            number /= 10;
        }
        System.out.println("");
    }
    
    public static int reverse2(int number){
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
