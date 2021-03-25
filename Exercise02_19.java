package Chapter2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.geom.Point2D;
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Exercise02_19 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        Point2D pointA = new Point2D.Double(input.nextDouble(), input.nextDouble());
        Point2D pointB = new Point2D.Double(input.nextDouble(), input.nextDouble());
        Point2D pointC = new Point2D.Double(input.nextDouble(), input.nextDouble());
        
        System.out.println("The area of the triangle is " + getAreaOfTriangle(pointA, pointB, pointC));
    }
    
    public static double getAreaOfTriangle(Point2D pointA, Point2D pointB, Point2D pointC){
        double side1 = pointA.distance(pointB);
        double side2 = pointB.distance(pointC);
        double side3 = pointC.distance(pointA);
        
        double s = (side1 + side2 + side3)/2.0;
        
        return Math.sqrt(s*(s-side1)*(s - side2)*(s - side3));
    }
    
}
