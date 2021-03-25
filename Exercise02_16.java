package Chapter2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Exercise02_16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side: ");
        double hexagonSide = input.nextDouble();
        double area = (2.59807621135) * Math.pow(hexagonSide, 2);
        System.out.println("The area of the hexagon is: " + area);
    }
}
