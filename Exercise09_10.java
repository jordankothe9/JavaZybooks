
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
public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A, B, and C in order, seperated by spaces: ");
        QuadraticEquation problem = new QuadraticEquation(input.nextDouble(), input.nextDouble(), input.nextDouble());
        
        if(problem.getDiscriminat() == 0){ //determines if there is one root
            if(Double.isNaN(problem.getRoot2())) //checks if getRoot2 is not a number and determines which root to print if there is one root
                System.out.println("There is one root: " + problem.getRoot1());
            else
                System.out.println("There is one root: " + problem.getRoot2());            
        }else if(problem.getDiscriminat() > 0) //determines if ther are two roots
            System.out.println("There are two roots: " + problem.getRoot1() + ", " + problem.getRoot2());
        else
            System.out.println("There are no roots");
    }
}

class QuadraticEquation{
    private double a, b, c;
    
    public QuadraticEquation(double A, double B, double C){
        a = A;
        b = B;
        c = C;
    }
    
    public double getA(){
        return a;
    }
    
    public double getB(){
        return b;
    }
    
    public double getC(){
        return c;
    }
    
    public double getDiscriminat(){
        return Math.pow(b, 2) - 4*a*c;
    }
    
    public double getRoot1(){
        if(getDiscriminat() >= 0)
            return (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
        else
            return 0;
    }
    
    public double getRoot2(){
        if(getDiscriminat() >= 0)
            return (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
        else
            return 0;
    }
}
