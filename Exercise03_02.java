package Chapter3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.Random;

public class Exercise03_02 {
  public static void main(String[] args) {
    Random randomNum = new Random();
    int max = 9;    
    int number1 = randomNum.nextInt(max);
    int number2 = randomNum.nextInt(max);
    int number3 = randomNum.nextInt(max);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + " + " + number3 + "? ");

    int answer = input.nextInt();

    System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " +
      (number1 + number2 + number3 == answer));
  }
}