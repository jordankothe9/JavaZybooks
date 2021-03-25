
import java.util.Scanner;

/*************************************************************************
 *This program takes an unknown amount of numbers and returns an array with
 * no duplicate values. The test program only takes 10 and displays the new
 * array and the number of distinct ints
 ***************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        int[] list2 = eliminateDuplicates(list);
        
        
        //output
        System.out.println("The number of distinct integers is " + list2.length);
        System.out.print("The distinct integers are ");
        for(int i : list2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static int[] eliminateDuplicates(int[] list){
        int[] workspace = new int[list.length];
        int nOutput = 0;
        
        //Create a scratch list that stores all the unquie values and count unquie values
        for (int i = 0; i < list.length; i++) {
            int num = list[i];
            if(inList(workspace, num)){
            } else {
                workspace[nOutput] = num;
                nOutput++;
            }
            
        }
        
        //trim the trailing zeros
        int[] Output = new int[nOutput];
        System.arraycopy(workspace, 0, Output, 0, Output.length);
        return Output;
        
    }
    
    public static boolean inList(int[] array, int search){
        for (int i = 0; i < array.length; i++) {
            if(search == array[i])
                return true;
        }
        return false;
    }
}
