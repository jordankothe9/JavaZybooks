
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
public class Exercise07_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] occerances = new int[100];
        System.out.println("Enter integers between 1 and 100:");
        while(true){
            int lastestInput = input.nextInt();
            if(lastestInput < 1 || lastestInput > 100)
                break;
            occerances[lastestInput-1]++;
            
        }
        
        for(int i = 0; i < occerances.length; i++){
            if (occerances[i] >= 1){
                System.out.println(i+1 + " occurs " + occerances[i] + " times");
        }
    }
}
}
