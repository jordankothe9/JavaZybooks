/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise06_08 {
    public static void main(String[] args){
        System.out.println("Celsius        Fahrenheit     |    Fahrenheit     Celsius");
        System.out.println("----------------------------------------------------------");
        double fahrenheit = 120;
        for (double celsius = 40; celsius > 30; celsius--) {
            System.out.printf("%-3.1f           %-5.1f          |    %-5.1f          %3.1f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsisus(fahrenheit));
            fahrenheit -= 10;
        }
    }
    
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * celsius + 32;
        return fahrenheit;
    }
    
    public static double fahrenheitToCelsisus(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit - 32);
        return celsius;
    }
}
