/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.strings;

/**
 *
 * @author Dell-User
 */
public class Strings {

    public static void main(String[] args) {
        
        String Name = "edith";
        String Surname = "mashapo";
        
        
        System.out.println(Name.substring(0, 1).toUpperCase()
                + Name.substring(1, 5).toLowerCase());
        
        System.out.println(Surname.substring(0, 1).toUpperCase()
                + Surname.substring(1, 7).toLowerCase());
    }
}
