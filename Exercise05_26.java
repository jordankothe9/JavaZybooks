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
public class Exercise05_26 {
    public static void main(String[] args){
        double dE = 0.0;
        double value = 10000.0;
        
        for (int i = 1; i < value; i++) {
            double denominator = i;
            for (int j = i; j >=1; j--) {
                denominator *= j;
            }
            dE += 1 / denominator;
        }
        System.out.println("The e value for i = 10000: " + dE);
        
        dE = 0.0;
        value = 20000.0;
        
        for (int i = 1; i < value; i++) {
            double denominator = i;
            for (int j = i; j >=1; j--) {
                denominator *= j;
            }
            dE += 1 / denominator;
        }
        System.out.println("The e value for i = 20000: " + dE);
        
        dE = 0.0;
        value = 100000.0;
        
        for (int i = 1; i < value; i++) {
            double denominator = i;
            for (int j = i; j >=1; j--) {
                denominator *= j;
            }
            dE += 1 / denominator;
        }
        System.out.println("The e value for i = 100000: " + dE);
    }
}
