
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
public class Exercise09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array: ");
        double[][] array = new double[input.nextInt()][input.nextInt()];
        
        
        //double for loop
        System.out.println("Enter the array: ");
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        
        System.out.println(LocationLargest(array));
    }
    
    public static Location LocationLargest(double[][] array){
        Location arrayLocation = new Location();
        
        
        //double for loop to iterate through the two dementional array
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                
                //what to do if the a larger value is found
                if(array[row][col] > arrayLocation.getMaxValue()){
                    arrayLocation.setMaxValue(array[row][col]);
                    arrayLocation.setColumn(col);
                    arrayLocation.setRow(row);
                }
            }
        }
        return arrayLocation;
    }
}

class Location{
    int row;
    int column;
    double maxValue;
    
    public Location(){
        row = -1;
        column = -1;
        maxValue = 0;
    }
    
    public Location(int Row, int Column, double MaxValue){
        row = Row;
        column = Column;
        maxValue = MaxValue;
    }
    
    public int getRow(){
        return row;
    }
    
    public void setRow(int newRow){
        row = newRow;
    }
    
    public int getColumn(){
        return column;
    }
    
    public void setColumn(int newColumn){
        column = newColumn;
    }
    
    public double getMaxValue(){
        return maxValue;
    }
    
    public void setMaxValue(double newMaxValue){
        maxValue = newMaxValue;
    }
    
    public String toString(){
        return "The location of the largest element is " + getMaxValue() + " at (" + getRow() + ", " + getColumn() + ")";
    }
    
    
    
}
