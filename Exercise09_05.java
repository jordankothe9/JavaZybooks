/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author jorda
 */
public class Exercise09_05 {
    public static void main(String[] args) {
        Calendar now = new GregorianCalendar();
        System.out.println("The current date is: " + (now.get(now.MONTH)+1) + "/" + now.get(now.DAY_OF_MONTH) + "/" + now.get(now.YEAR));
       
        Calendar specificDate = new GregorianCalendar();
        specificDate.setTimeInMillis(12345678765L);
        System.out.println("12345678765 in milliseconds since 1970 is: " + (specificDate.get(specificDate.MONTH)+1) + "/" + specificDate.get(specificDate.DAY_OF_MONTH) + "/" + specificDate.get(specificDate.YEAR));
        //System.out.println(now);
    }
}
