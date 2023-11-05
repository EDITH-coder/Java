/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays2;

/**
 *
 * @author Dell-User
 */
public class Arrays2 {

    public static void main(String[] args) {
        //this program calculate the sum and the average of array elements
        //declare and initialize array
       int[] Numbers = new int[]{13,25,32,45,57};
       
       int sum= 0;
       int average;
       
       for(int i = 0; i<Numbers.length; i++){
           sum+=Numbers[i];
          
       }
        System.out.println("The sum of Numbers is: "+ sum);
        
        average=sum/Numbers.length;
        System.out.println("The average of Numbers is: "+ average);
    }
}
