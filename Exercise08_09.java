
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
public class Exercise08_09 {
    public static void main(String[] args) {
        final int stillInPlay = -1;
        final int Draw = 0;
        final int Owin = 1;
        final int Xwin = 2;
        
        Scanner input = new Scanner(System.in);
        char[][] board = new char[3][3];
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        
        while(GameStatus(board) == -1){
            Xturn(board);
            if(GameStatus(board) != -1)
                break;
            Oturn(board);
        }
        
        printBoard(board);
        switch(GameStatus(board)){
            case Draw: System.out.println("Draw!");
            break;
            case Owin: System.out.println("O player won");
            break;
            case Xwin: System.out.println("X player won");
        }
        
    }
    
    public static void Xturn (char[][] board){
        printBoard(board);
        //inital input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row for player X: ");
        int row = input.nextInt();
        System.out.print("Enter a column for player X: ");
        int col = input.nextInt();
        
        //replace the selected spot with an X
        if(board[row][col] == ' ')
            board[row][col] = 'X';
        //input validation
        else{
            //repeats the error until the user enters a good spot
            while(board[row][col] != ' '){
                System.out.println("That space is already occupided! Try again");
                 System.out.print("Enter a row for player X: ");
                row = input.nextInt();
                System.out.print("Enter a column for player X: ");
                col = input.nextInt();
            }
            //use the fixed input to complete a move
            board[row][col] = 'X';
        }
        
    }
    
    public static void Oturn (char[][] board){
        printBoard(board);
        //inital input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row for player O: ");
        int row = input.nextInt();
        System.out.print("Enter a column for player O: ");
        int col = input.nextInt();
        
        //replace the selected spot with an X
        if(board[row][col] == ' ')
            board[row][col] = 'O';
        //input validation
        else{
            //repeats the error until the user enters a good spot
            while(board[row][col] != ' '){
                System.out.println("That space is already occupided! Try again");
                 System.out.print("Enter a row for player O: ");
                row = input.nextInt();
                System.out.print("Enter a column for player O: ");
                col = input.nextInt();
            }
            //use the fixed input to complete a move
            board[row][col] = 'O';
        }
        
    }
    
    //-1 means the game is still in play, 0 means draw, 1 means O's win, 2 means X's win
    public static int GameStatus (char[][] board){
        
        final int stillInPlay = -1;
        final int Draw = 0;
        final int Owin = 1;
        final int Xwin = 2;
        
        //check diagonal
        int diagonalResults = CheckDiagonal(board);
        if (diagonalResults != -1){
            return diagonalResults;
        }
        
        //check horizontal
        int horizontalResults = CheckHorizontal(board);
        if(horizontalResults != stillInPlay)
            return horizontalResults;
        
        //check vertial
        int vertialResults = CheckVertial(board);
        if(vertialResults != stillInPlay)
            return vertialResults;
        if(Draw(board))
            return Draw;
        else
            return stillInPlay;
    }
    
    //True if draw, false if not
    public static boolean Draw(char[][] board){
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == ' ')
                    return false;
            }
            
        }
        return true;
    }
    
    //no match = -1, O's win = 1, X's win = 2
    public static int CheckVertial(char[][] board){
        final int stillInPlay = -1;
        final int Draw = 0;
        final int Owin = 1;
        final int Xwin = 2;
        
        for (int i = 0; i < board[0].length; i++) {
            if(board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O')
                return Owin;
            else if(board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X')
                return Xwin;
        }
        return stillInPlay;
    }
    
    //no match = -1, O's win = 1, X's win = 2
    public static int CheckHorizontal(char[][] board){
        final int stillInPlay = -1;
        final int Draw = 0;
        final int Owin = 1;
        final int Xwin = 2;
        
        for (char[] board1 : board) {
            if (board1[0] == 'O' && board1[1] == 'O' && board1[2] == 'O') {
                return Owin;
            } else if (board1[0] == 'X' && board1[1] == 'X' && board1[2] == 'X') {
                return Xwin;
            }
        }
        return stillInPlay;
    }
    
    //no match = -1, O's win = 1, X's win = 2
    public static int CheckDiagonal(char[][] board){
        
        final int stillInPlay = -1;
        final int Draw = 0;
        final int Owin = 1;
        final int Xwin = 2;
        
        //Check if X's win
        //upper left to lower right
        if(board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
            return Xwin;
        //uppper right to lower left
        else if(board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X')
            return Xwin;
        
        //Check if O's win
        //upper left to lower right
        else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
            return Owin;
        //upper right to lower left
        else if(board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O')
            return Owin;
        //neither win:
        else
            return stillInPlay;
    }
    
    public static void printBoard(char[][] board){
        for (char[] board1 : board) {
            System.out.println("-------------");
            System.out.printf("| %c | %c | %c | \n", board1[0], board1[1], board1[2]);
        }
        System.out.println("-------------");
    }
}
