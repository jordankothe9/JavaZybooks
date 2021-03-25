/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_13 {
    public static void main(String[] args){
        System.out.println("   i                m(i)");
        double miTotal = 0;
        for (int i = 1; i <= 20; i++) {
            miTotal += mi(i);
            System.out.printf(" %3d                %3.4f\n", i, miTotal);
        }
    }
    
    public static double mi(int number){
        double mi = number/(number+1.0);
        return mi;
    }
}
