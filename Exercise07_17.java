
import java.util.Scanner;

/******************************************************************************
 * This program takes the name of students and their grades and sorts them by
 * their grade and displays the results. The method insertionSortPlusString
 * sorts the numbers and uses the string as their index, or a name in this case.
 ******************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int nStudents = input.nextInt();
        double[] grades = new double[nStudents];
        String[] names = new String[nStudents];
        
        //Loop that creates the 
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a student name: ");
            names[i] = input.next();
            System.out.print("Enter a student score: ");
            grades[i] = input.nextDouble();
        }
        
        insertionSortPlusString(grades, names);
        
        for (int i = grades.length-1; i >= 0; i--) {
            System.out.println(names[i] + " " + grades[i]);
        }
        
    }
    
    
    //Sorts 
    public static void insertionSortPlusString(double[] array, String[] names){
        for (int i = 1; i < array.length; i++) {
            double temp = array[i];
            String sTemp = names[i];
            
            //move elements to the right until temp find it's spot
            int j;
            for (j = i-1; j >= 0 && temp < array[j]; j--) {
                array[j+1] = array[j];
                names[j+1] = names[j];
            }
            
            //insert temp into it's spot
            array[j+1] = temp;
            names[j+1] = sTemp;
        }
    }
}
