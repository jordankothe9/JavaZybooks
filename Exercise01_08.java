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
public class Exercise01_08 {
    public static void main(String[] args){
        double pi = 3.14159265359;
        double radius = 5.5;
        double perimeter, area;
        perimeter = 2 * radius * pi;
        area = radius * radius * pi;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
