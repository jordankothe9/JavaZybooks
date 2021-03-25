
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
public class Exercise09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, and f in order seperated by spaces:");
        LinearEquation UserProblem = new LinearEquation(input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble(), input.nextDouble());
        
        if(UserProblem.isSolvable())
            System.out.println("X is " + UserProblem.getX() + " and Y is " + UserProblem.getY());
        else
            System.out.println("This equation has no solution");
    }
}

class LinearEquation{
    private double a, b, c, d, e, f;
    
    //constructor
    LinearEquation(double A, double B, double C, double D, double E, double F){
        a = A;
        b = B;
        c = C;
        d = D;
        e = E;
        f = F;
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
    
    public double getD(){
        return d;
    }
    
    public double getE(){
        return e;
    }
    
    public double getF(){
        return f;
    }
    
    public boolean isSolvable(){
        return a*d - b*c != 0;            
    }
    
    public double getX(){
        return (e*d - b*f)/(a*d - b*c);
    }
    
    public double getY(){
        return (a*f - e*c)/(a*d - b*c);
    }
}
