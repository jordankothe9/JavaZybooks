package Chapter3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 *
 * @author jorda
 */
public class Exercise03_04 {
    public static void main(String[] args){
        Random randomNum = new Random();
        int month = randomNum.nextInt(11);
        //int month = 11;
        if (month == 0){
            System.out.println("The month is Januaray");
        }else if (month == 1){
            System.out.println("The month is Februray");
        }else if (month == 2){
            System.out.println("The month is March");
        }else if (month == 3){
            System.out.println("The month is April");
        }else if (month == 4){
            System.out.println("The month is May");
        }else if (month == 5){
            System.out.println("The month is June");
        }else if (month == 6){
            System.out.println("The month is July");
        }else if (month == 7){
            System.out.println("The month is August");
        }else if (month == 8){
            System.out.println("The month is September");
        }else if (month == 9){
            System.out.println("The month is October");
        }else if (month == 10){
            System.out.println("The month is November");
        }else if (month == 11){
            System.out.println("The month is December");
        }
    }
}
