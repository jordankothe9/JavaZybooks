package Chapter5;



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
public class Exercise05_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iUserInput = 0;
        int iNumPositive = 0;
        int iNumNegative = 0;
        int total = 0;
        int count = 0;
        
        System.out.print("Enter an integer, the input ends if it is 0: ");
        while (true){
            iUserInput = input.nextInt();
            total += iUserInput;
            if (iUserInput > 0){
                iNumPositive++;
                count++;
            }
            else if (iUserInput < 0){
                iNumNegative++;
                count++;
            }   
            else
                break;
        }
        if (count != 0){
            System.out.println("The number of positives is " + iNumPositive);
            System.out.println("The number of negitives is " + iNumNegative);
            System.out.println("The total is " + total);
            int iCountOfInputs = iNumPositive + iNumNegative;
            System.out.println("The average is " + (double)total/iCountOfInputs);
        }else
            System.out.println("No numbers are entered except 0");
    }
}
