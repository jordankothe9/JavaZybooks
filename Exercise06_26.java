/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_26 {
    public static void main(String[] args){
        int count = 0;
        int numToTest = 2;
        int line = 1;
        while (count <= 100){
            if((isPrime(numToTest)) && (isPalindrome(numToTest))){
                count++;
                if(line % 10 != 0){
                    System.out.print(numToTest + " ");
                    line++;
                }else{
                    System.out.println(numToTest + " ");
                    line = 1;
                }
            }
        numToTest++;
        }
        
    }
    
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
    
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
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
