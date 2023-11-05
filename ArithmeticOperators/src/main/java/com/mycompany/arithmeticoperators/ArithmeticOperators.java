/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arithmeticoperators;

/**
 *
 * @author Dell-User
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int a=10,b=5;
        
        int sum= a+ b;
        int different = a-b;
        int product = a * b;
        int quotient = a / b;
        int reminder = a % b;
        
        
        System.out.println("The Sum of " + a + " and " + b + " is " + sum);
        System.out.println("The different of " + a + " and " + b + " is " + different);
        System.out.println("The product of " + a + " and " + b + " is " + product);
        System.out.println("The quotient of " + a + " and " + b + " is " + quotient);
        System.out.println("The reminder of " + a + " and " + b + " is " + reminder);
    }
}
