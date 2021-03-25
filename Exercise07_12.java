
import java.util.Scanner;

/*****************************************************************************
 * program puts ten double numbers into an array and passes it to the reverse
 * method. The reverse method supports an unknown number of values. The main
 * method then prints the results.
 *****************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextDouble();
        }
        
        //reverse the array here:
        reverse(array);
        //output
        System.out.println("The reversal of the input is: ");
        for(double i : array)
            System.out.print(i + " ");
    }
    
    
    //reverses an array of unknown length
    public static void reverse(double[] numbers){
        int largerIndex = numbers.length - 1;
        int smallerIndex = 0;
        for (int i = 0; i < numbers.length/2; i++) {
                       
            double temp = numbers[smallerIndex];
            numbers[smallerIndex] = numbers[largerIndex];
            numbers[largerIndex] = temp;
            
            smallerIndex++;
            largerIndex--;
        }
    }
}
