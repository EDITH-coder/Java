/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datetime;

/**
 *
 * @author Dell-User
 */
import java.util.*;
import java.time.*;

public class DateTime {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        
         System.out.println("***********************");
        //second example
        
        LocalDate date1 =   LocalDate.of(2015, Month.APRIL ,20);
        LocalDate date2 = LocalDate.of(2015,4,20);
        
        System.out.println(date1);
         System.out.println(date2);
    }
}
