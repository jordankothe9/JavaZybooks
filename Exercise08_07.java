
import javafx.geometry.Point3D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise08_07 {
    public static void main(String[] args) {
        double[][] points = {{-1, 0, 3}, {-1, -1, -1}, {4, 1, 1}, {2, 0.5, 9}, {3.5, 2, -1}, {3, 1.5, 3}, {-1.5, 4, 2}, {5.5, 4, -0.5}};
        
        double shortestdistance = Double.MAX_VALUE;
        int smallestdistanceIndex1 = -1;
        int smallestdistanceIndex2 = -1;
        
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if(i != j)
                    if(distance3D(points[i], points[j]) < shortestdistance){
                        shortestdistance = distance3D(points[i], points[j]);
                        smallestdistanceIndex1 = i;
                        smallestdistanceIndex2 = j;
                    }
            }
        }
        
        System.out.println("The closest two points are (" 
                + points[smallestdistanceIndex1][0] + ", " + points[smallestdistanceIndex1][1] + ", " + points[smallestdistanceIndex1][2] + 
                ") and (" + points[smallestdistanceIndex2][0] + ", " + points[smallestdistanceIndex2][1] + ", " + points[smallestdistanceIndex2][2] + ")");
            
            
    }
    
    public static double distance3D (double[] pointA, double[] pointB){
        return Math.sqrt((pointB[0] - pointA[0])*(pointB[0] - pointA[0])
                        + (pointB[1] - pointA[1])*(pointB[1] - pointA[1])
                        + (pointB[2] - pointA[2])*(pointB[2] - pointA[2]));
    }
}

//        0 1 2
// pointA x y z
// pointB x y z

