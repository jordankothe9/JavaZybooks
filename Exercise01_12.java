package Chapter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jorda
 */
public class Exercise01_12 {
    public static void main(String[] args){
        double mph, kph;
        int miles = 24;
        double hours = 1.0;
        double minutes = 40.0;
        int seconds = 35;
        minutes = minutes + seconds / 60.0;
        hours = hours + minutes / 60;
        mph = miles / hours;
        kph = mph * 1.6;
        System.out.println(kph);
        
    }
}
