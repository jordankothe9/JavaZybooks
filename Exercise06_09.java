/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_09 {
    public static void main(String[] args){
        System.out.println("Feet    Meters              Meters      Feet");
        System.out.println("---------------------------------------------");
        double meters = 20;
        for (double i = 1; i <= 10; i++) {
            System.out.printf("%4.1f    %6.3f                %2.1f   %7.3f\n", i, (feetToMeters(i)), meters, (metersToFeet(meters)));
            meters += 5;
        }
    }
    
    public static double feetToMeters(double feet){
        double meter = 0.305 * feet;
        return meter;
    }
    
    public static double metersToFeet(double meter){
        double feet = 3.279 * meter;
        return feet;
    }
}
