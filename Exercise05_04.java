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
public class Exercise05_04 {
    public static void main(String[] args){
        int iMiles = 1;
        double dKilometers;
        System.out.println("Miles             Kilometers");
        for (int i = 1; i <= 10; i++) {
            iMiles = i;
            dKilometers = iMiles * 1.609;
            System.out.printf("%-3d               %-6.3f \n", iMiles, dKilometers);
        }
    }
}
