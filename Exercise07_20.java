
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
public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten ints to sort: ");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        
        selectionSort(array);
        
        System.out.println("The output is: ");
        for(double i : array)
            System.out.print(i + ", ");
    }
    
    public static void selectionSort(double[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            //find smallest in list i .. length-1
            double max = array[i];
            int maxIndex = i;
            for (int j = i-1; j >= 0; j--) {
                if(array[j] > max){
                    max = array[j];
                    maxIndex = j;
                }
            }
            
            //swap list[i] with list[currentmMinIndex] if necessary
            if(maxIndex != i){
                array[maxIndex] = array[i];
                array[i] = max;
            }
        }
    }
}
