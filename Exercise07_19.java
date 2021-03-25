
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
public class Exercise07_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the list size: ");
        int[] list = new int[input.nextInt()];
        System.out.print("Enter the contents of the list: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        
        //read the list back to the user
        System.out.println("The list has " + list.length + " integers ");
    }
    
    
    //determines if the list in in NON-DECREASING order
    public static boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1])
                return false;
        }
        return true;
    }
}
