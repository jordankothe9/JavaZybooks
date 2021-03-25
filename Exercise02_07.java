package Chapter2;

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
public class Exercise02_07 {
    public static void main(String[] args_){
        System.out.print("Enter the number of minutes: ");
        Scanner input = new Scanner(System.in);
        int min, hours, days, years = 0;
        min = input.nextInt();
        hours = min/60;
        days = hours / 24;
        while (days > 365){
            years = years + 1;
            days = days - 365;
        }
        System.out.println(min + " minutes is aproximently equal to " + years + " years and " + days + " days");
    }
}
