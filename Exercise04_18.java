
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise04_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String major = input.nextLine();
        char firstletter = major.charAt(0);
        char secondletter = major.charAt(1);
        
        switch(firstletter){
            case 'M': System.out.print("Mathematics");
            break;
            case 'C': System.out.print("Computer Science");
            break;
            case 'I': System.out.print("Information Technology");
            break;
            default: System.out.print("Invalid input: Wrong Major Code");
        }
        
        System.out.print(" ");
        switch(secondletter){
            case '1': System.out.println("Freshman");
            break;
            case '2': System.out.println("Sophomore");
            break;
            case '3': System.out.println("Junior");
            break;
            case '4': System.out.println("Senior");
            break;
            default: System.out.println("Invalid input: wrong status code");
        }
    }
}
