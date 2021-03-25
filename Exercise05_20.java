package Chapter5;


public class Exercise05_20 {
//fix the for loop
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 1000; //don't use this
        final int NUMBER_OF_PRIMES_PER_LINE = 8; // Display 10 per line
        int count = 0; // Count the number of prime numbers

        System.out.println("The prime numbers from 2 to 1000 are \n");

        // Repeatedly find prime numbers
        for (int number = 2; number < NUMBER_OF_PRIMES; number++) {
            // Assume the number is prime
            boolean isPrime = true;

            // Test if number is prime
            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) { // If true, number is not prime
                    isPrime = false; // Set isPrime to false          
                    break; // Exit the for loop
                }
            }

            // Print the prime number and increase the count
            if (isPrime) {
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }
    }
}
