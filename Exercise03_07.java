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
public class Exercise03_07 {
      public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive the amount 
    System.out.print(
      "Enter an amount in double, for example 11.56: ");
    double amount = input.nextDouble();

    int remainingAmount = (int)(amount * 100);

    // Find the number of one dollars
    int numberOfOneDollars = remainingAmount / 100;
    remainingAmount = remainingAmount % 100;

    // Find the number of quarters in the remaining amount
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount = remainingAmount % 25;

    // Find the number of dimes in the remaining amount
    int numberOfDimes = remainingAmount / 10;
    remainingAmount = remainingAmount % 10;

    // Find the number of nickels in the remaining amount
    int numberOfNickels = remainingAmount / 5;
    remainingAmount = remainingAmount % 5;

    // Find the number of pennies in the remaining amount
    int numberOfPennies = remainingAmount;

    // Display results
    System.out.println("Your amount " + amount + " consists of"); 
    if (numberOfOneDollars > 0)
        System.out.println(numberOfOneDollars + "   " + " dollars");
    if (numberOfQuarters > 0)
        System.out.println(numberOfQuarters + "    " + " quarters ");
    if (numberOfDimes > 0)
        System.out.println(numberOfDimes + "    " + " dimes"); 
    if (numberOfNickels > 0)
        System.out.println(numberOfNickels + "    " + " nickel");
    if (numberOfPennies > 0)
        System.out.println(numberOfPennies + "    " + " penny");
  }

}
