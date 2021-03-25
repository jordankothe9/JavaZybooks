package Chapter5;


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
public class Exercise05_08 {
    public static void main(String[] args){
        Scanner NumberInput = new Scanner(System.in);
        Scanner NameInput = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int iNumStudents = NumberInput.nextInt();
        String sName;
        double dScore;
        double dHighScore = 0;
        String sHighScore = "No data";
        
        
        for (int i = 0; i < iNumStudents; i++) {
            System.out.print("Enter a student name: ");
            sName = NameInput.next();
            System.out.print("Enter a student score: ");
            dScore = NumberInput.nextDouble();
            
            if (dScore > dHighScore){
                sHighScore = sName;
                dHighScore = dScore;
            }
        }
        System.out.println("");
        System.out.println("Top student is " + sHighScore + " with a score of " + dHighScore);
    }
}
