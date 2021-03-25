
import java.util.Scanner;

/**************************************************************************
 * main method gets the list, then uses the indexOfSmallestElements to find the
 * index of the smallest element. If less than one element is passed in the
 * the array it returns -1.
 ***************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] list = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }
        
        int index = indexOfSmallestElement(list);
        if(index < 0)
            System.out.println("Error");
        else
            System.out.println("The index of the minimal value is " + index);
        System.out.println("");
    }
    
    public static int indexOfSmallestElement(double[] array){
        double smallest = Integer.MAX_VALUE;
        int index = 0;
        int smallestIndex = 0;
        for(double i : array){
            
            if(i < smallest){
                smallest = i;
                smallestIndex = index;
            }
            index++;
        }
        if(smallest != Integer.MAX_VALUE)
            return smallestIndex;
        else
            return -1;
    }
}
