/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods;

/**
 *
 * @author Dell-User
 */

import java.util.*;
public class Methods {

   
      static int sum;
      static int subtract;
     
     public static int AddNumber(int num1){
         
         sum = num1 + 2;
         
         return sum;
     }
    
    public static int SubtractNumber(int num3){
       
        subtract= num3 - 1;
        return subtract;
    }
    
    public static void main(String[] args) {
        
      System.out.println("The sum is " + AddNumber(2));
      System.out.println("The sum is " + SubtractNumber(3));
    }
   
    
    }

