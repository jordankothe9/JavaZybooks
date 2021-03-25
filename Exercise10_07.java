
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
public class Exercise10_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account[] ATM = new Account[10];
        for (int id = 0; id < ATM.length; id++) {
            ATM[id] = new Account(id, 100, 0);
        }
        
        while(true){
            System.out.print("Enter an id: ");
            int UserID = input.nextInt();
            while(UserID < 0 | UserID > 9){
                System.out.print("Wrong user ID, Try again:");
                UserID = input.nextInt();
            }
            boolean MainMenuLoop = true;

            while(MainMenuLoop){        
                System.out.print("Main menu\n"
                        + "1: Check balance\n"
                        + "2: withdraw\n"
                        + "3: deposit\n"
                        + "4: exit\n"
                        + "Enter a choice: ");
                switch(input.nextInt()){
                    case 1: System.out.println("The balance is " + ATM[UserID].getBalance());
                    break;
                    case 2: System.out.print("Enter an amount to withdraw: ");
                    ATM[UserID].withdraw(input.nextDouble());
                    break;
                    case 3: System.out.println("Enter an amount to deposit: ");
                    ATM[UserID].deposit(input.nextDouble());
                    break;
                    case 4: MainMenuLoop = false;
                    break;
                    default: System.out.println("Incorrect input");
                }
            }
        }
    }
}

//set exercise09_07 for the account class