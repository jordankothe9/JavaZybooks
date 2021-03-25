package Chapter5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise05_25 {
    public static void main(String[] args){
        double sum = 0;
        double value = 10000.0;
        for (double d = 1; d <= (2*value-1); d+=2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 /d;
        }
        double pi = 4 * sum;
        System.out.println("PI value for i =  10000: " + pi);
        
        sum = 0;
        value = 20000.0;
        for (double d = 1; d <= (2*value -1); d+=2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 /d;
        }
        pi = 4*sum;
        System.out.println("PI value for i = 20000: " + pi);
        
        sum = 0;
        value = 100000.0;
        for (double d = 1; d <= (2*value -1); d+=2) {
            sum += 1 / d;
            d += 2;
            sum -= 1 /d;
        }
        pi = 4*sum;
        System.out.println("PI value for i = 20000: " + pi);
        
    }
    
    
}
