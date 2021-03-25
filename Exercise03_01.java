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
public class Exercise03_01 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
                
        double answer, rootOne, rootTwo;
        answer = Math.pow(b, 2) - 4 * a * c;
        if(answer > 0){
            System.out.print("There are two real roots:");
            rootOne = (-b + Math.pow(answer, 0.5))/(2*a);
            rootTwo = (-b - Math.pow(answer, 0.5))/(2*a);
            System.out.print(rootOne + " and " + rootTwo);
        }else if (answer == 0){
            System.out.print("There is one real root: ");
            rootOne = (-b + Math.pow(answer, 0.5))/(2*a);
            System.out.println(rootOne);
        }else if (answer < 0){
            System.out.println("There are no real roots");
        }
    }
}
