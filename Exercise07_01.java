
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
public class Exercise07_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        double[] grades = new double[numStudents];
        double best = 0;
        System.out.print("Enter four scores seperated by spaces or returns: ");
        
        //assign grades
        //find the best grade
        for (int i = 0; i < numStudents; i++) {
            grades[i] = input.nextDouble();
            if (grades[i]>best)
                best=grades[i];
        }
        
        
        
        
        //assign letter grades
        char[] letterGrade = new char[numStudents];
        for (int i = 0; i < numStudents; i++) {
            if(grades[i]>=best-10)
                letterGrade[i] = 'A';
            else if(grades[i]>=best-20)
                letterGrade[i] = 'B';
            else if(grades[i]>=best-30)
                letterGrade[i] = 'C';
            else if(grades[i]>=best-40)
                letterGrade[i] = 'D';
            else
                letterGrade[i] = 'F';
        }
        
        //print everything
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + letterGrade[i]);            
        }
    }
}
