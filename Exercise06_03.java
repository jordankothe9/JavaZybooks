
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
public class Exercise06_03 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int iUserInput = input.nextInt();
        
        if(isPalindrome(iUserInput))
            System.out.println(iUserInput + " is a palindrome integer");
        else
            System.out.println(iUserInput + " is not a palindrome integar");
    }
    
    public static boolean isPalindrome(int number){
        if(number == reverse(number))
            return true;
        else
            return false;
    }
    
    public static int reverse(int number){
        int reverse = 0;
        while(number > 0){
            int lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
        return reverse;
    }
}
