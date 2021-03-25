/***************************************************************************
 * This program creates a deck of cards, shuffles them, picks the top four,
 * checks if they are from four different suites, and tries again if they aren't
 * different. Then it prints the natural English name of the cards.
 ***************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_24 {
    public static void main(String[] args) {
        int[] deck = createDeckOfCards();
        int[] topFourCardsArray = new int[4];
       
        
        while(!allSuites(topFourCardsArray)){ //shuffle until allSuites is true
            deck = shuffleDeck(deck);
            topFourCardsArray = topFour(deck);
        }
        
        printTopFour(topFourCardsArray);
    }
    
    //creates a deck of cards in order and puts them into an int array
    public static int[] createDeckOfCards(){
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
        
        /*for(int j : deck)
            System.out.println(j);
        */
        
        return deck;
    }
    
    //shuffles a deck of cards
    public static int[] shuffleDeck(int[] deck){
        for (int i = 0; i < 500; i++) {
            int indexOne = (int)(Math.random()*52);
            int indexTwo = (int)(Math.random()*52);
            
            if(indexOne != indexTwo) //make sure a swap will accually happen
                deck = swapNumbers(deck, indexOne, indexTwo);
        }
        /*
        for(int j : deck)
            System.out.println(j);
        */
        
        return deck;
    }
    
    //returns the top four cards in an array
    public static int[] topFour(int[] deck){
        int[] topfour = new int[4];
        java.lang.System.arraycopy(deck, 0, topfour, 0, 4);
        
        return topfour;
    }
    
    //returns true if all four suites are present in the first four cards
    public static boolean allSuites(int[] topfour){
        if(topfour.length != 4)
            System.out.println("Error: top four array in allSuites does not have exactly 4 elements");
        boolean[] includesSuites = new boolean[4];
        for (int i = 0; i < 4; i++) {
            int cardSuite = (int)topfour[i]/13;
            includesSuites[cardSuite] = true;
        }
        
        return(includesSuites[0] && includesSuites[1] && includesSuites[2] && includesSuites[3]);
    }
    
    //Takes an array as an input, the first and second int are the indexes to be swapped.
    public static int[] swapNumbers(int[] deck, int indexOne, int indexTwo){
        int temp = deck[indexOne];
        deck[indexOne] = deck[indexTwo];
        deck[indexTwo] = temp;
        
        return deck;
    }
    
    
    //switch case to name the top four cards and print the results
    public static void printTopFour(int[] topFour){
        String suite;
        String card;
        for(int i : topFour){
            switch(i/13){ //find the suite
                case 0: suite = "Diamonds";
                break;
                case 1: suite = "Clubs";
                break;
                case 2: suite = "Hearts";
                break;
                case 3: suite = "Spades";
                break;
                default: suite = "Error";
            }
            
            switch(i/4){
                case 0: card = "Ace";
                break;
                case 1: card = "2";
                break;
                case 2: card = "3";
                break;
                case 3: card = "4";
                break;
                case 4: card = "5";
                break;
                case 5: card = "6";
                break;
                case 6: card = "7";
                break;
                case 7: card = "8";
                break;
                case 8: card = "9";
                break;
                case 9: card = "10";
                break;
                case 10: card = "Jack";
                break;
                case 11: card = "Queen";
                break;
                case 12: card = "King";
                break;
                default: card = "Error";
            }
            
            System.out.println(card + " of " + suite);
        }
    }
}
