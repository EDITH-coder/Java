/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.userinput;


/**
 *
 * @author Dell-User
 */

import java.util.Scanner;
import java.util.*;
public class UserInput {

    public static void main(String[] args) {
        
        String Name;
        int Marks;
        String Massage = "You have Passed";
        
        Scanner sr = new Scanner(System.in);
        System.out.println("Enter Your Name");
        Name = sr.nextLine();
        
        System.out.println("Enter Your Marks");
         Marks = Integer.parseInt(sr.nextLine());
         
        
        if(Marks >=50){
            System.out.println( Name + " You got "+ Marks +" And" +Massage);
            
        }else {
            System.out.println("You have failed");
        }
        

    }
}
