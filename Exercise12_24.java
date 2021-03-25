
import java.io.FileNotFoundException;
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
public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        java.io.File listOfProfs = new java.io.File("Salary.txt");
        if(listOfProfs.exists()){
            System.out.println("File already exists");
            System.exit(0);
            //listOfProfs.delete();
        }
        
        java.io.PrintWriter output = new java.io.PrintWriter(listOfProfs);
        //Scanner input = new Scanner(listOfProfs);
        
        
        //output.print("hello file");
        
        String[] titles = {"assistant", "associate", "full"};
        
        for (int i = 1; i <= 1000; i++) {
            int randomnumber = (int)(Math.random()*3);
            
            output.print("FirstName" + i + " LastName" + i + " ");
            output.println(titles[randomnumber] + " " + randomSalary(randomnumber));
        }
        
        output.close();
    }
    
    public static double randomSalary(int rank){
        if(rank == 0){
            return 50000+Math.random()*30000;
        }else if(rank == 1){
            return 60000 + Math.random()*50000;
        }else if(rank == 2){
            return 75000 + Math.random()*55000;
        }else
            return -1;
    }
}
