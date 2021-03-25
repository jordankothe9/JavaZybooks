
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
public class Exercise08_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        
        //create and populate the list of cities
        double[][] cities = new double[input.nextInt()][2];
        System.out.print("Enter the coordinates of the cities: ");
        for (int cityNumber = 0; cityNumber < cities.length; cityNumber++) {
            cities[cityNumber][0] = input.nextDouble();
            cities[cityNumber][1] = input.nextDouble();
        }
        
        double shortestDistance = Double.MAX_VALUE;
        int CentralCity = 0;
        double CurrentDistance;
        for (int fromCity = 0; fromCity < cities.length; fromCity++) {
            CurrentDistance = 0;
            for (int toCity = 0; toCity < cities.length; toCity++) {
                CurrentDistance += distance(cities[fromCity][0], 
                                            cities[fromCity][1], 
                                            cities[toCity][0], 
                                            cities[toCity][1]);
            }
            if(CurrentDistance < shortestDistance){
                shortestDistance = CurrentDistance;
                CentralCity = fromCity;
            }
        }
        
        System.out.println("The central city is at (" + cities[CentralCity][0] + ", " + cities[CentralCity][1] + ")");
        System.out.println("The total distance to all other cities is " + shortestDistance);
    }
    
    public static double distance (double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
