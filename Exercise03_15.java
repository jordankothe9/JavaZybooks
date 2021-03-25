package Chapter3;







/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jorda
 */
public class Exercise03_15 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random randomNum = new Random();
        int lotteryDigit1 = randomNum.nextInt(10);
        int lotteryDigit2 = randomNum.nextInt(10);
        int lotteryDigit3 = randomNum.nextInt(10);
        int score = 0;
        System.out.println("DEBUG " + lotteryDigit1 + lotteryDigit2 + lotteryDigit3);
        System.out.println("Enter three digits: ");
        int UserNum = input.nextInt();
        int guessDigit3 = UserNum % 10;
        UserNum = (UserNum - guessDigit3)/10;
        int guessDigit2 = UserNum % 10;
        UserNum = (UserNum - guessDigit2)/10;
        int guessDigit1 = UserNum % 10;
        UserNum = (UserNum - guessDigit1)/10;
        //System.out.println(iDigit1 + ", " + iDigit2 + ", " + iDigit3);
        if (lotteryDigit1 == guessDigit1 && lotteryDigit2 == guessDigit2 && lotteryDigit3 == guessDigit3){
            System.out.println("You guess the lottery number exactly! You win $10,000");
        }else if ((guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit3)
    || (guessDigit1 == lotteryDigit2
      && guessDigit1 == lotteryDigit3 && guessDigit3 == lotteryDigit1)
    || (guessDigit1 == lotteryDigit3
      && guessDigit2 == lotteryDigit1 && guessDigit3 == lotteryDigit2)
    || (guessDigit1 == lotteryDigit3
      && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit1)
    || (guessDigit1 == lotteryDigit1
      && guessDigit2 == lotteryDigit3 && guessDigit3 == lotteryDigit2))
   System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2
    || guessDigit1 == lotteryDigit3 || guessDigit2 == lotteryDigit1
    || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3
    || guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2
    || guessDigit3 == lotteryDigit3)
   System.out.println("Match one or two digits: you win $1,000");
        else
            System.out.println("No digits matched");
        
    }
}
