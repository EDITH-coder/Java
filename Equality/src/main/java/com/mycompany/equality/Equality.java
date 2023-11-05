/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equality;

/**
 *
 * @author Dell-User
 */
public class Equality {
    String name ="Mike";

    public static void main(String[] args) {
        
        Equality E1 = new Equality();
        E1.name = "Paul";
         Equality E2 = new Equality();
          Equality E3 = E1;  

        System.out.println(E1 ==E1);
        System.out.println(E1 ==E2);
        System.out.println(E1 ==E3);
        System.out.println(E1.equals(E2));
        System.out.println(E1.equals(E3));
        
        System.out.println("on the object E1 the name variable contains "+ E1.name);
        System.out.println("on the object E2 the name variable contains "+ E2.name);
        System.out.println("on the object E3 the name variable contains "+ E3.name);

        E3.name = "Steve";
System.out.println("on the object E3 the name variable contains "+ E3.name);



    }
}
