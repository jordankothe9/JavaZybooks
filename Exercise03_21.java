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
public class Exercise03_21 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = input.nextInt();
        System.out.println("Enter a month: ");
        int m = input.nextInt();
        System.out.println("Enter the day of the month: ");
        int q = input.nextInt();
        
        if (m == 1)
        {
            m = 13;
            year--;
        }
        if (m == 2)
        {
            m = 14;
            year--;
        }
        int j = (int)(year/100.0);
        int k = year % 100;
        int h = q + 13*(m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
        h = h%7;
        switch (h)
        {
            case 0 : System.out.println("Saturday"); break;
            case 1 : System.out.println("Sunday"); break; 
            case 2 : System.out.println("Monday"); break;
            case 3 : System.out.println("Tuesday"); break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
        }
    }
}
