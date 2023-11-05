/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.luckynumberapp;

/**
 *
 * @author Dell-User
 */
import java.util.Scanner;
import java.util.*;
public class LuckyNumberApp {

    
    public static boolean ContainValue(int[] arr, int value){
        for(int i=0; i<arr.length; i++){
            if(arr[1] == value){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        
        int[] array = new int[6];
        Random ng = new Random();
        
        int currentIndex= 0;
        while(currentIndex < array.length){
            int randomNumber = ng.nextInt(45) + 1;
            if(!ContainValue(array, randomNumber)){
                array[currentIndex] = randomNumber;
                currentIndex++;
            }
            
            
        }
        for(int i=0; i< array.length; i++){
         System.out.println("Lotto Number's ["+i+"] =" + array[i]);
        }

    }
}
