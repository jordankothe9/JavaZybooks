/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise09_01 {

    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle(4, 40);
        Rectangle shape2 = new Rectangle(3.5, 35.9);
        
        System.out.println("Shape 1: \n" + shape1);
        System.out.println("");
        System.out.println("Shape 2: \n" + shape2);
        
    }
}

class Rectangle {

    double width;
    double height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getWidth(){
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2*(width + height);
    }
    
    public String toString(){
        return "Width: " + width + "\n" +
                "Height: " + height + "\n" + 
                "Area: " + this.getArea() + "\n" + 
                "Perimeter: " + this.getPerimeter();
    }
}
