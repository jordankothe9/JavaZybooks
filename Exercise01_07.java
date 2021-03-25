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
public class Exercise01_07 {
    public static void main(String[] args){
        double pi, temp;
        temp = 1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0);
        pi = 4.0 * temp;
        System.out.println(pi);
        temp = 1.0 - (1.0/3.0) + (1.0/5.0) - (1.0/7.0) + (1.0/9.0) - (1.0/11.0) + (1.0/13.0);
        pi = 4 * temp;
        System.out.println(pi);
    }
}
