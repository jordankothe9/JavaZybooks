import java.util.Arrays;
import java.util.Scanner;
/*****************************************************************************
 * This program takes two lists, merges them into one list, sorts them, then
 * outputs them. The method merge both merges and sorts.
 *****************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input list1
        System.out.print("Enter list1 size and contents: ");
        int[] list1 = new int[input.nextInt()];
        //System.out.println("Enter the contents of the first array");
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }
        
        //input list2
        System.out.print("Enter list2 size and contents: ");
        int[] list2 = new int[input.nextInt()];
        //System.out.println("Enter the contents of the Second array");
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        
        //print the lists before loigc
        System.out.println("list1 is ");
        for(int i : list1)
            System.out.print(i + " ");
         System.out.println("list2 is ");
        for(int i : list2)
            System.out.print(i + " ");
        
        //merge the lists and sort
        int[] merged = merge(list1, list2);
        
        
        //output the sorted, merged lists
        System.out.println("The merged lists are ");
        for(int i : merged)
            System.out.print(i + " ");
    }
   
    //takes two lists of any size, combines them, then sorts them
    public static int[] merge(int[] list1, int[] list2){
        int[] merged = new int[list1.length + list2.length];
        System.arraycopy(list1, 0, merged, 0, list1.length);
        
        System.arraycopy(list2, 0, merged, list1.length, list2.length);
        
        Arrays.sort(merged);
        
        return merged;
    }
}
