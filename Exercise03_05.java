package Chapter3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Exercise03_05 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day of the week (Sunday is 0): ");
        int currentDay = input.nextInt();
        System.out.print("Enter the number of days into the future to calculate: ");
        int daysToAdvance = input.nextInt();
        int futureDay = (currentDay + daysToAdvance) % 7;
        //System.out.println("DEBUG: " + futureDay);
        String sCurrentDay, sFutureDay;
        
        if(currentDay == 0)
            sCurrentDay = "Sunday";
        else if (currentDay == 1)
            sCurrentDay = "Monday";
        else if (currentDay == 2)
            sCurrentDay = "Tuesday";
        else if (currentDay == 3)
            sCurrentDay = "Wednesday";
        else if (currentDay == 4)
            sCurrentDay = "Thursday";
        else if (currentDay == 5)
            sCurrentDay = "Friday";
        else if (currentDay == 6)
            sCurrentDay = "Saturday";
        else{
            System.out.println("ERROR: The current day was not inputted correctly, The results will not be correct!");
            sCurrentDay = "ERROR";
        }
        
        if(futureDay == 0)
            sFutureDay = "Sunday";
        else if (futureDay == 1)
            sFutureDay = "Monday";
        else if (futureDay == 2)
            sFutureDay = "Tuesday";
        else if (futureDay == 3)
            sFutureDay = "Wednesday";
        else if (futureDay == 4)
            sFutureDay = "Thursday";
        else if (futureDay == 5)
            sFutureDay = "Friday";
        else if (futureDay == 6)
            sFutureDay = "Saturday";
        else{
            System.out.println("ERROR: The future day was not inputted correctly, The results will not be correct!");
            sFutureDay = "Error";
        }
        System.out.println("Today is " + sCurrentDay + " and the future day is " + sFutureDay);
        
    }
}
