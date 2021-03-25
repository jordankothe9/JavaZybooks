
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
public class Exercise06_12 {
    public static void main(String[] args) {
        
        
        char ch1 = '1';
        char ch2 = 'z';
        int numberPerLine = 10;
        
        printChars(ch1, ch2, numberPerLine);
        
    }
    
    public static void printChars(char ch1, char ch2, int numberPerLine){
        int iCh1 = (int)ch1;
        int iCh2 = (int)ch2;
        int lineCTRL = 1;
        for (int i = ch1; i <= ch2; i++) {
            if(lineCTRL % numberPerLine != 0)
                System.out.print((char)i + " ");
            else
                System.out.println((char)i);
            lineCTRL++;
            
        }
    }
}
