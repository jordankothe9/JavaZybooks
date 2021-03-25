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
public class Exercise05_07 {
    public static void main(String[] args){
        double dTuituion = 10000;
        double dIncreasePercent = .05;
        
        for (int i = 0; i < 10; i++) {
            dTuituion = dTuituion * dIncreasePercent + dTuituion;
            //System.out.println(dTuituion);
        }
        System.out.println("Tution in ten years is " + dTuituion);
        double dFourYearTuituion = dTuituion;
        for (int i = 0; i < 3; i++) {
            dTuituion = dTuituion * dIncreasePercent + dTuituion;
            dFourYearTuituion += dTuituion;
            //System.out.println(dTuituion);
            
        }
        System.out.println("The four-year tuition in ten years is " + dFourYearTuituion);
    }
}
