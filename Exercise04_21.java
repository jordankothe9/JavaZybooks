
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
public class Exercise04_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a SSN: ");
        String SSN = input.nextLine();
        
        if(checkSSN(SSN))
            System.out.println(SSN + " is a valid social security number");
        else
            System.out.println(SSN + " is an invalid social security number");
    }
    
    public static boolean checkSSN(String SSN){
        SSN.trim();
        
        
        if(SSN.charAt(3) == '-' && SSN.charAt(6) == '-'){
            for (int i = 0; i < SSN.length(); i++) {
                if(i == 3 | i == 6)
                    continue;
                if(!(Character.isDigit(SSN.charAt(i))))
                    return false;
            }
            return true;
        }else
            return false;
            
    }
}
