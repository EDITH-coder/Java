/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timeperiod;

/**
 *
 * @author Dell-User
 */
import java.time.*;
public class TimePeriod {

    public static void main(String[] args) {
        
              
       Period annually = Period.ofYears(1);
       Period quarterly = Period.ofMonths(3);
       Period everyThreeWeeks = Period.ofWeeks(3);
       Period everyOtherDay = Period.ofDays(1);
       Period everyYearAndWeek = Period.of(1,0,7);
       
       System.out.println(annually );
        System.out.println(quarterly);
        System.out.println(everyThreeWeeks);
        System.out.println(everyOtherDay);
         System.out.println(everyYearAndWeek);
    }
}
