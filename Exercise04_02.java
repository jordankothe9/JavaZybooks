
import java.awt.geom.Point2D;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise04_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point2D pointA = new Point2D.Double();
        Point2D pointB = new Point2D.Double();
        
        System.out.print("Enter the latitude and longitude of point A seperated by a space: ");
        pointA.setLocation(Math.toRadians(input.nextDouble()), Math.toRadians(input.nextDouble()));
        System.out.print("Enter the latitude and longitude of point B seperated by a space: ");
        pointB.setLocation(Math.toRadians(input.nextDouble()), Math.toRadians(input.nextDouble()));
        
        System.out.println("The distance bewtween two points is " + GreatCircleDistance(pointA, pointB) + " KM");
        
    }
    
    public static double GreatCircleDistance (Point2D pointA, Point2D pointB){
        double EarthRadius = 6371.01;
        
        return EarthRadius * Math.acos(Math.sin(pointA.getX()) * Math.sin(pointB.getX()) + Math.cos(pointA.getX()) * Math.cos(pointB.getX()) * Math.cos(pointA.getY()-pointB.getY()));
    }
}
