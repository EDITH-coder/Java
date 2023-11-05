/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays1;

/**
 *
 * @author Dell-User
 */
public class Arrays1 {

    public static void main(String[] args) {
        
        int [] MyArray = new int[42];
        MyArray[0]= 1;
        MyArray[20] = 60;
        
        String[] name = {"Edith", "Bonolo","Lethabo","Ditheto", "Rebotile","Retshepile"};
         System.out.println(" The Length of an array is: "+ name.length);
        for(int i=0; i<name.length; i++){
           
            System.out.println("in index " + i + " The Name is: "+name[i]);
        }
        
    }
}
