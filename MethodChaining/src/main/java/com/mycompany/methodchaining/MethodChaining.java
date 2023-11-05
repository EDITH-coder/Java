/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methodchaining;

/**
 *
 * @author Dell-User
 */
public class MethodChaining {

    public static void main(String[] args) {
        
        String start= " Animal ";
        
        String Word = "We are so called \"Viking \" from North";
       
        String treammed = start.trim();
        System.out.println(treammed);
        String lowercase=  treammed.toLowerCase();
        System.out.println(lowercase);
        String results = lowercase.replace('a', 'A');
        System.out.println(results);
        
        System.out.println(Word);
        
        
    }
}
