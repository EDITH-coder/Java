/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.evenorodd;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class EvenOrOdd {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        // ask the user to enter a number
        System.out.print("Enter a number: ");
        
        int number = scanner.nextInt();
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
    }
}
