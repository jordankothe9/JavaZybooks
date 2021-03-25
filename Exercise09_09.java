/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise09_09 {
    public static void main(String[] args) {
        RegularPolygon shape1 = new RegularPolygon();
        RegularPolygon shape2 = new RegularPolygon(6, 4);
        RegularPolygon shape3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        System.out.println("shape1 perimeter: " + shape1.getPerimeter() + ", area: " + shape1.getArea());
        System.out.println("shape2 perimeter: " + shape2.getPerimeter() + ", area: " + shape2.getArea());
        System.out.println("shape3 perimeter: " + shape3.getPerimeter() + ", area: " + shape3.getArea());
    }
}
    
    class RegularPolygon{
        private int n; //number of sides, default 3
        private double side; //length of a side
        private double x;
        private double y; //x and y coord of the center of the polygon
        
        
        public RegularPolygon(){
            n = 3;
            side = 1;
            x = 0;
            y = 0;
        }
        
        public RegularPolygon(int numberOfSides, double lengthOfSide){
            if(numberOfSides>3)
                n = numberOfSides;
            if(lengthOfSide > 0)
                side = lengthOfSide;
        }
        
        public RegularPolygon(int numberOfSides, double lengthOfSide, double centerX, double centerY){
            if(numberOfSides>3)
                n = numberOfSides;
            if(lengthOfSide > 0)
                side = lengthOfSide;
            x = centerX;
            y = centerY;
        }
        
        public int getNumberOfSides(){
            return n;
        }
        
        public void setNumberOfSides(int numberOfSides){
            if(numberOfSides>3)
                n = numberOfSides;
        }
        
        public double getLengthOfSide(){
            return side;
        }
        
        public void setLengthOfSide(int LengthOfSide){
            if(LengthOfSide > 0)
                side = LengthOfSide;
        }
        
        public double[] getLocation(){
            double[] coords = {x, y};
            return coords;
        }
        
        public void setLocation(double newX, double newY){
            x = newX;
            y = newY;
        }
        
        public double getPerimeter(){
            return side * n;
        }
        
        public double getArea(){
            return (n * Math.pow(side, 2))/(4*Math.tan(Math.PI/n));
        }
    }
