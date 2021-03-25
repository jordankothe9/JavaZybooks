/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_16 {
    public static void main(String[] args){
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + " has " + numberOfDaysInAYear(year) + " days");
        }
    }
    
    public static int numberOfDaysInAYear(int year){
        if(isLeapYear(year))
            return 366;
        else
            return 365;
    }
    
    public static boolean isLeapYear(int year){
        return (((year % 4 == 0) && (year % 100 != 0))||(year % 400 == 0));
    }
}
