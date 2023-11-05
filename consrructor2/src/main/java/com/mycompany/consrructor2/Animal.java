/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.consrructor2;

/**
 *
 * @author Dell-User
 */
public class Animal {
    
    String name;
    int age;
    int height;
    
    Animal(int height){
       this.height= height;
    }
    
    Animal(int age, String name){
            this.name= name;
            this.age= age;
    }
    
}
