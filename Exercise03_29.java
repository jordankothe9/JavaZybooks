package Chapter3;

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
//SUMMERY: This program determines if two circle overlap given position and radius
public class Exercise03_29 {
    public static void main(String[] args){
        //inputs:
        Scanner input = new Scanner(System.in);
        //circle one
        System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double dRadius1 = input.nextDouble();
        //circle two
        System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double dRadius2 = input.nextDouble();
        
        //Distance between Two points:
        double temp1 = Math.pow(x2-x1, 2) + Math.pow(y2 - y1, 2);
        double dDistance = Math.pow(temp1, .5);
        
        //Compair radius to distance:
        if(dDistance <= dRadius1 - dRadius2){
            System.out.println("circle2 is inside circle1");
        }else if (dDistance <= dRadius1 + dRadius2){
            System.out.println("circle2 overlaps circle1");
        }else
            System.out.println("circle2 does not overlap circle1");
    }
}
