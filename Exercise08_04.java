/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise08_04 {
    public static void main(String[] args) {
        int[][] weeklyHours = { {2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9},};
        
        int[] totalHours = calculateHours(weeklyHours);
        
        int[] index = insertionSort(totalHours);
        
        for (int i = totalHours.length-1; i >= 0; i--) {
            System.out.println("Employee " + index[i] + ": " + totalHours[i]);
        }
    }
    
    public static int[] calculateHours(int[][] weeklyHours){
        int[] totalWeeklyHours = new int[weeklyHours.length];
        for (int EmployeeNumber = 0; EmployeeNumber < weeklyHours.length; EmployeeNumber++) {
            for (int Day = 0; Day < weeklyHours[EmployeeNumber].length; Day++) {
                totalWeeklyHours[EmployeeNumber] += weeklyHours[EmployeeNumber][Day];
            }
        }
        return totalWeeklyHours;
    }
    
    public static int[] insertionSort(int[] array){
        int[] index = new int[array.length];
        for (int i = 0; i < index.length; i++) {
            index[i] = i;
        }
        for (int i = 1; i < array.length; i++) {
            int tempIndex = index[i];
            int temp = array[i];
            
            //move elements to the right until temp find it's spot
            int j;
            for (j = i-1; j >= 0 && temp < array[j]; j--) {
                array[j+1] = array[j];
                index[j+1] = index[j];
            }
            
            //insert temp into it's spot
            array[j+1] = temp;
            index[j+1] = tempIndex;
        }
        return index;
    }
}
