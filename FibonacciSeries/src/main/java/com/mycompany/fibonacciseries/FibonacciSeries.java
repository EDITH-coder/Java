/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonacciseries;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class FibonacciSeries {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
         //ask the user to enter a number
        System.out.print("Enter a number: ");
       int number = scanner.nextInt();
       
        // declare and initialize the first two terms 
      int  firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci Series till " + number + " terms:");

    for (int i = 1; i <= number; ++i) {
      System.out.print(firstTerm + ", ");

      // compute the next term
      int nextTerm = firstTerm + secondTerm;
      firstTerm = secondTerm;
      secondTerm = nextTerm;
    }
    }
}
