/**************************************************************************
 *This program creates 100 random int between 0 and 9. for each int, the index
 * of a ten element array of the same number is increased by one. This effectivly
 * counts the number of occercense.
 ***************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_07 {
    public static void main(String[] args) {
        int[] count = new int[10];
        for (int i = 0; i < 100; i++)
            count[(int)(Math.random()*10)]++;
        for (int i = 0; i < 10; i++) {
            System.out.println("The number of " + i + "s that appeared is " + count[i]);
        }
    }
}
