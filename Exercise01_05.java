package Chapter1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author jorda
 */
public class Exercise01_05 {
    public static void main(String[] args){
        double denom, numor, total; //denom: result of botton of fration, numor: result
        //of top of fraction. total is numor/denom
        
        numor = 9.5 * 4.5 - 2.5 * 3;
        denom = 45.5 - 3.5;
        /*System.out.println(numor);
        System.out.println(denom);
*/
        total = numor / denom;
        System.out.println(total);
    }
}
