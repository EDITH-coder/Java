/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.reversearray;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class ReverseArray {

    public static void main(String[] args) {
        
        String[] arrayNames = {"Alice", "Bob","Charlie","David","Eve"};
        String[] Names = new String[arrayNames.length];
        
        for(int i =0; i<= arrayNames.length; i++){
            Names[i] = arrayNames[arrayNames.length-1 -1];
        }
        
        System.out.println(Arrays.toString(Names));
       
    }
}
