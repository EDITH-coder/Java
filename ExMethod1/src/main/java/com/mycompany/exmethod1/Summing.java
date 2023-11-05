/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exmethod1;

/**
 *
 * @author Dell-User
 */
class Summing {
    
     public int Sum(int num1, int num2){
       
       int add= num1 + num2;
       return add;
    }
    
    public int Sum(int num1, int num2, int num3){
       
       int add= num1 + num2 + num3;
       return add;
    }
    
    public int Sum(){
        
              int[] ArrNumbers = {5,10,20,25,30,35};
              int add = 0;
              for(int i= 0; i<=ArrNumbers.length-1;i++){
                  add += ArrNumbers[i];
              }
              return add;
    }
    
}
