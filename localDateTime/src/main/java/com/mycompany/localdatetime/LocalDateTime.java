/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.localdatetime;

/**
 *
 * @author Dell-User
 */
import java.time.*;
public class LocalDateTime {

    public static void main(String[] args) {
        
        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15,30);
        LocalTime time3 = LocalTime.of(6, 15,30,200);
       
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time2);
        
        
        //public static LocalTime of(int hour,int minute);
    }
}
