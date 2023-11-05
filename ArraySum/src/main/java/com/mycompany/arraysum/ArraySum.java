/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraysum;

/**
 *
 * @author Dell-User
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {12, 45, 67, 23, 9, 56, 78, 88, 93};
        
          int maximum = array[9];
          for (int i = 1; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            }
        
        System.out.println("Maximum value in the array: " + maximum);
        
        
       // int sum = 0; 
       //for (int i = 0; i < array.length; i++) {  
       //    sum = sum + array[i];  
       // }  
          
        //System.out.println("Sum of the array elements: " + sum);
       //  System.out.println("Sum of the array elements: " + sum);
    }
    
     
}
