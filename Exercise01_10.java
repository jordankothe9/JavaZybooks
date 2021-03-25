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
public class Exercise01_10 {
    public static void main(String[] args){
        double km, min, hours, mph, miles; //km-kilometers, min-minutes, sec-seconds
        km = 14;
        min = 45.5;
        hours = min / 60;
        miles = km / 1.6;
        mph = miles / hours;
        System.out.println(mph);
    }
}
