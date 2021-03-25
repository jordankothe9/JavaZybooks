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
public class Exercise05_03 {
    public static void main(String[] args){
        int iKilograms = 1;
        double dPounds;
        System.out.println("Kilograms         Pounds");
        for (int i = 1; i < 200; i += 2) {
            iKilograms = i;
            dPounds = iKilograms * 2.2;
            System.out.printf("%-3d               %6.1f \n", iKilograms, dPounds);
        }
    }
}
