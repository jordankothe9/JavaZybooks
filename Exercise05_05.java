package Chapter5;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jorda
 */
public class Exercise05_05 {
    public static void main(String[] args){
        int iKilogramsLeftTable = 0;
        double dKilogramsRightTable = 0;
        int iRightTableLoopControl = 15;
        double dPoundsLeftTable = 0;
        int iPoundsRightTable = 0;
        System.out.println("Kilograms  Pounds    |    Pounds     Kilograms");
        for (int i = 1; i < 200; i += 2) {
            //left table logic
            iKilogramsLeftTable = i;
            dPoundsLeftTable = iKilogramsLeftTable * 2.2;
            
            //right table logic:
            iRightTableLoopControl += 5;
            iPoundsRightTable = iRightTableLoopControl;
            dKilogramsRightTable = iPoundsRightTable / 2.2;
            
            //output:
            System.out.printf("%-3d        %6.1f    |    %-3d           %6.1f \n", iKilogramsLeftTable, dPoundsLeftTable, iPoundsRightTable, dKilogramsRightTable);
        }
        
    }
}
