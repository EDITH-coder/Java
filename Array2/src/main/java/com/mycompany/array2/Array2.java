/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.array2;

/**
 *
 * @author Dell-User
 */
import java.util.Scanner;
public class Array2 {

    public static void main(String[] args) {
        
        Scanner MyScanner = new Scanner(System.in);
        System.out.println("Enter array Value");
        int Number = MyScanner.nextInt();
        
        int[] MyArray = new int[Number];
        // declare variables

    
    // while loop from 1 to 5
    for(int i = 0; i< Number; i++)  { 
        
        MyArray[i] = i+1;
         System.out.println("index "+ i +" The number is: " + MyArray[i]);
    }    
   
           }
}
