
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
public class Exercise07_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] scores = new int[100];
        int i = 0;
        int sum = 0;
        int lastEnteredNumber = 1;
        while(lastEnteredNumber >= 0){
            System.out.println("Enter a new Score: ");
            scores[i] = input.nextInt();
            sum += scores[i];
            lastEnteredNumber = scores[i];
            i++;
            
        }
        scores[i-1] = 0;
        double average = (double)sum/(double)i;
        System.out.println("The average is " + average);
        
        int stop = i;
        i = 0;
        int aboveAverage = 0;
        int belowAverage = 0;
        while(i <= stop-2){
            if(scores[i] >= average)
                aboveAverage++;
            else
                belowAverage++;
            i++;
        }
        
        System.out.println("The number of scores above or equal to the average is " + aboveAverage);
        System.out.println("The number of scores below the average is " + belowAverage);
    }
}
