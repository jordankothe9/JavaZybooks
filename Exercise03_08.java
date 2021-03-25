package Chapter3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author jorda
 */
public class Exercise03_08 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iThreeDigitNumber = input.nextInt();
        int iFirst, iSecond, iThird;
        
        //Seperate the digits
        iThird = iThreeDigitNumber % 10;
        iThreeDigitNumber /= 10;
        iSecond = iThreeDigitNumber % 10;
        iThreeDigitNumber /= 10;
        iFirst = iThreeDigitNumber % 10;
        
        //assign to array:
        //int[] digitArray = new int[3];
        int[] digitArray = {iFirst,iSecond,iThird};
        
        //bubble sort:
        boolean swapped = true;
        int iLenList = 3;
        int temp;
        while (iLenList > 0 && swapped){
            swapped = false;
            for (int i = 0; i<3; i++){
                if (digitArray[i] > digitArray[i+1]){
                    swapped = true;
                    temp = digitArray[i];
                    digitArray[i] = digitArray[i+1];
                    digitArray[i+1] = temp;
                }
                iLenList -= 1;
            }
            
        }
        
        //debug
        System.out.println(Arrays.toString(digitArray));
    }
}
