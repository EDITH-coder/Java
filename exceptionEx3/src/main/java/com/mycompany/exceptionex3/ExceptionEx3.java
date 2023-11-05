/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptionex3;

/**
 *
 * @author Dell-User
 */

import java.util.*;
public class ExceptionEx3 {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter a Number");
        int number= scanner.nextInt();
        
         try {
            checkOddEvenNumber(number);
            System.out.println(number + " is even.");
        } catch (IllegalArgumentException e) {
            System.out.println(number + " is odd.");
        }
    }
    
    
    
    public static void checkOddEvenNumber(int number) {
    if (number % 2 != 0) {
      throw new IllegalArgumentException(number + " is odd.");
    }
  }

}
