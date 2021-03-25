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
public class Exercise03_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month in the year (ex: 1 for Jan): ");
        int month = input.nextInt();
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        String sMonth = "";
        int daysInMonth = 0;
        switch(month){
            case 1: sMonth = "January";
            daysInMonth = 31;
            break;
            case 2: sMonth = "February";
            daysInMonth = 28;
            break;
            case 3: sMonth = "March";
            daysInMonth = 31;
            break;
            case 4: sMonth = "April";
            daysInMonth = 30;
            break;
            case 5: sMonth = "May";
            daysInMonth = 31;
            break;
            case 6: sMonth = "June";
            daysInMonth = 30;
            break;
            case 7: sMonth = "July";
            daysInMonth = 31;
            break;
            case 8: sMonth = "August";
            daysInMonth = 31;
            break;
            case 9: sMonth = "September";
            daysInMonth = 30;
            break;
            case 10: sMonth = "October";
            daysInMonth = 31;
            break;
            case 11: sMonth = "November";
            daysInMonth = 30;
            break;
            case 12: sMonth = "December";
            daysInMonth = 31;
            break;
            
        }
        if (month == 2 && year%4 == 0) //leap year
            daysInMonth = 29;
        System.out.println(sMonth + " " + year + " has " + daysInMonth + " days.");
    }
}
