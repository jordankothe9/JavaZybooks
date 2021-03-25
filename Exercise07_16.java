
import java.util.Arrays;

/******************************************************************************
 * This program creates an array of 100,000 ints and tests the speed of search
 * algorithms . The values of each array element is between 0 and 1,000. After
 * search is preformed the time in MS is displayed on the screen
 ******************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_16 {
    public static void main(String[] args) {
        int[] array = create100000ints();
        insertionSort(array);
        int key = array[(int)(Math.random()*100000)];
        
        long startTimeLinear = System.nanoTime();
        linearSearch(array, key);
        long endTimeLinear = System.nanoTime();
        double LinearTime = endTimeLinear - startTimeLinear;
        
        long startTimeBinary = System.nanoTime();
        Arrays.binarySearch(array, key);
        long endTimeBinary = System.nanoTime();
        double BinaryTime = endTimeBinary - startTimeBinary;
        
        BinaryTime /= 1000000.0;
        LinearTime /= 1000000.0;
        
        System.out.println("LinearTime: " + LinearTime + " ms");
        System.out.println("BinaryTime: " + BinaryTime + " ms");
    }
    
    public static int[] create100000ints (){
        int[] array = new int[100000];
        for(int i = 0; i < array.length; i++)
            array[i] = (int)(Math.random()*1000);
        return array;
    }
    
    public static int linearSearch(int[] list, int key){
        for (int i = 0; i < list.length; i++) {
            if(key==list[i])
                return i;
        }
        return -1;
    }
    
    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            
            //move elements to the right until temp find it's spot
            int j;
            for (j = i-1; j >= 0 && temp < array[j]; j--) {
                array[j+1] = array[j];
            }
            
            //insert temp into it's spot
            array[j+1] = temp;
        }
    }
}
