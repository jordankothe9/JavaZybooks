
import java.util.Scanner;

/***************************************************************************
 * Calculate GCD from a list of integers. The methods support an unknown 
 * number of inputs while the main method only intakes 5 integers
 ****************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();
        System.out.println("The GCD is " + gcd(n1, n2, n3, n4, n5));
    }
    
    //return the GCD of an unknow number of values
    public static int gcd(int... numbers){
        int gcd = 1;
        boolean isDivisor;
        
        for (int i = 2; i < min(numbers); i++) {
            isDivisor = true;
            for (int j: numbers){
                if(j % i !=0)
                    isDivisor = false;
            }
            if(isDivisor)
                gcd = i;
        }
        return gcd;
    }
    
    
    //take an unknow number of ints and return the smallest one
    public static int min(int... numbers){
        int min = numbers[0];
        for (int j : numbers){
            if(j < min)
                min = j;
        }
        return min;
    }
}
