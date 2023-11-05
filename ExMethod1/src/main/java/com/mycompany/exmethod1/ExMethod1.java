/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exmethod1;

/**
 *
 * @author Dell-User
 */
public class ExMethod1 {

    public static void main(String[] args) {
        Summing obj = new Summing();
             
        System.out.println("The sum of These two values 5 and 10 is: " + obj.Sum(5, 10));
        System.out.println("The sum of These three values 5, 10 and 20 is: " + obj.Sum(5, 10,20));
        System.out.println("The sum of these values 5,10,20,25,30,and 35 that are contained in an array is: " + obj.Sum());
    }
}
