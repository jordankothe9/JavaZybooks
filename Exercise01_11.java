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
public class Exercise01_11 {
    public static void main(String[] args){
        double yearlypopgrowth, secinyear, yearlybirths, yearlydeaths, yearlyimm;
        int currentpop;
        //yearlyimm = number of immagrants every year
        //yearly* number of each stat in a year
        secinyear = 60 * 60 * 24 * 365;
        yearlybirths = secinyear / 7.0;
        yearlydeaths = secinyear / 13.0;
        yearlyimm = secinyear / 45.0;
        yearlypopgrowth = yearlybirths + yearlyimm - yearlydeaths;
        currentpop = 312032486;
        currentpop = (int)(yearlypopgrowth + currentpop);
        System.out.println(currentpop);
        currentpop = (int)(yearlypopgrowth + currentpop);
        System.out.println(currentpop);
        currentpop = (int)(yearlypopgrowth + currentpop);
        System.out.println(currentpop);
        currentpop = (int)(yearlypopgrowth + currentpop);
        System.out.println(currentpop);
        currentpop = (int)(yearlypopgrowth + currentpop);
        System.out.println(currentpop);
    }
}
