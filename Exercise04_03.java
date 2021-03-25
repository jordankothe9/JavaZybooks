
import java.awt.geom.Point2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise04_03 {
    public static void main(String[] args) {
        final Point2D Charlotte = new Point2D.Double(35.2270869, -80.8431267);
        final Point2D Atlanta = new Point2D.Double(33.7489954, -84.3879824);
        final Point2D Savannah = new Point2D.Double(32.0835407, -81.0998342);
        final Point2D Orlando = new Point2D.Double(28.5383355, -81.3792365);
        
        double area = getAreaOfTriangleGPS(Charlotte, Atlanta, Savannah) + getAreaOfTriangleGPS(Orlando, Atlanta, Savannah);
        
        System.out.println("The area between the four cities is " + area + " km^2");
    }
    
    public static double getAreaOfTriangleGPS(Point2D pointA, Point2D pointB, Point2D pointC){
        double side1 = GreatCircleDistance(pointA, pointB);
        double side2 = GreatCircleDistance(pointB, pointC);
        double side3 = GreatCircleDistance(pointC, pointA);
        
        double s = (side1 + side2 + side3)/2.0;
        
        return Math.sqrt(s*(s-side1)*(s - side2)*(s - side3));
    }
    
    public static double GreatCircleDistance (Point2D pointA, Point2D pointB){
        double EarthRadius = 6371.01;
        
        return EarthRadius * Math.acos(Math.sin(pointA.getX()) * Math.sin(pointB.getX()) + Math.cos(pointA.getX()) * Math.cos(pointB.getX()) * Math.cos(pointA.getY()-pointB.getY()));
    }
    
}
