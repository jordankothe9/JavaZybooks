/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_10 {

    public static void main(String[] args) {
        int numberOfPrime = -1;
        for (int i = 1; i < 10000; i++) {
            if(isPrime(i)){
                numberOfPrime++;
            }
        }
        System.out.println("The number of prime numbers < 10000 " + numberOfPrime);
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // number is not a prime
            }
        }

        return true; // number is prime
    }
}

