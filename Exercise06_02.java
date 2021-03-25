
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
public class Exercise06_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int iUserInput = input.nextInt();
        System.out.println(sumDigits(iUserInput));
    }
    
    public static int sumDigits(int n){
        int sum = 0;
        do{
            sum += n % 10;
            n /= 10;
        }while (n > 0);
        return sum;
    }
}
