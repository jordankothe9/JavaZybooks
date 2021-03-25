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
public class Exercise02_06 {
    public static void main(String[] args){
        String nString;
        char char1, char2, char3, char4;
        int int1, int2, int3, int4, sumOfInts;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a three digit integer:");
        nString = input.next();
        char1 = nString.charAt(0);
        char2 = nString.charAt(1);
        char3 = nString.charAt(2);
        //char4 = nString.charAt(3);
        int1 = Character.getNumericValue(char1);
        int2 = Character.getNumericValue(char2);
        int3 = Character.getNumericValue(char3);
        //int4 = Character.getNumericValue(char4);
        sumOfInts = int1 + int2 + int3; // + int4;
        System.out.println("The sum of all digits is: " + sumOfInts);
       //uncomment to debug
       /*
        System.out.println(int1);
        System.out.println(int2);
        System.out.println(int3);
        System.out.println(int4);
*/
    }
}
