/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palindrome;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       
       String number ,reversedNum ="";
       //ask the user to enter a number
        System.out.print("Enter a number: ");
        number = scanner.next();
        
        // Reverse the number 
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNum += number.charAt(i);
        }
        
        // Check if the number is equal to its reverse
        if (number.equals(reversedNum)) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
  
        
    }
}
