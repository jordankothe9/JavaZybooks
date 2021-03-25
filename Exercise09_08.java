/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise09_08 {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        
        //assign fan1:
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        if(!fan1.getPowerStatus())
            fan1.togglePowerStatus();
        
        //assign fan2:
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        if(fan2.getPowerStatus())
            fan2.togglePowerStatus();
        
        System.out.println(fan1);
        System.out.println("");
        System.out.println(fan2);
    }
}

class Fan{
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    
    //constructors:
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }
    
    public void setSpeed(int newSpeed){
        if(newSpeed > 0 && newSpeed < 4)
            speed = newSpeed;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public boolean getPowerStatus(){
        return on;
    }
    
    public void togglePowerStatus(){
        if(on)
            on = false;
        else
            on = true;
    }
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double newRadius){
        if(newRadius>0)
            radius = newRadius;
    }
    
    public void setColor(String newColor){
        color = newColor;
    }
    
    public String getColor(){
        return color;
    }
    
    public String toString(){
        String sSpeed = "error";
        switch(speed){
            case 1: sSpeed = "slow";
            break;
            case 2: sSpeed = "medium";
            break;
            case 3: sSpeed = "fast";
        }
        
        if(on){
            return "The fan speed is: " + sSpeed + "\n" +
                    "The fan color is: " + color + "\n" +
                    "The fan radius is: " + radius;
        }else
            return "The fan is off\n" +
                    "The fan color is: " + color + "\n" +
                    "The fan radius is: " + radius;
    }
}