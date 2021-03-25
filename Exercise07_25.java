
import java.util.Scanner;

/****************************************************************************
 * This test program takes in A B and C and passes it to the method 
 * solveQuadratic. It also passes an empty array of roots. The method returns
 * the number of roots and edits the root array to include the two roots (if 
 * there are no roots NaN is used)
 ****************************************************************************/

/**
 *
 * @author jorda
 */
public class Exercise07_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A B and C sperated by spaces: ");
        double[] eqn = {input.nextDouble(), input.nextDouble(), input.nextDouble()};
        double[] roots = new double[2];
        int nOfRoots = solveQuadratic(eqn, roots);
        
        
        //determine how to display the information based on the number of roots
        switch(nOfRoots){
            case 2: System.out.print("There are two roots: " + roots[0] + " and " + roots[1]);
            break;
            case 1: if(Double.isNaN(roots[0]))
                        System.out.print("There is one root: " + roots[1]);
                    else
                        System.out.println("There is one root: " + roots[0]);
            break;
            case 0:
                System.out.println("There are no roots");
        }
    }
    
    public static int solveQuadratic(double[] eqn, double[] roots){
             
               
        //positive root
        roots[0] = (-eqn[1] + Math.sqrt(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        
        //negitive root
        roots[1] = (-eqn[1] - Math.sqrt(Math.pow(eqn[1], 2) - (4 * eqn[0] * eqn[2]))) / (2 * eqn[0]);
        
    //determine which value is a number
        int nOfRoots = 2;
        if(Double.isNaN(roots[0]))
            nOfRoots--;
        if(Double.isNaN(roots[1]))
            nOfRoots--;
        
        return nOfRoots;
    }
}
