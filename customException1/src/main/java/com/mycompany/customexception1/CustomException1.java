/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.customexception1;

/**
 *
 * @author Dell-User
 */
public class CustomException1 {

    public static void main(String[] args) {
        
          try {
            int age = 16; 

            // Validate age using the custom exception
            validateAge(age);

            // If age is valid, print a success message
            System.out.println("Age is valid: " + age);
        } catch (invalidAgeException e) {
            // Handle the custom exception
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Method to validate age and throw custom exception if invalid
    public static void validateAge(int age) throws invalidAgeException {
        if (age < 18 || age > 65) {
            throw new invalidAgeException("Age must be between 18 and 65.");
        }
    }
        
        
      
    
}
