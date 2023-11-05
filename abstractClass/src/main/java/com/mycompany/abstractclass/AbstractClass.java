/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractclass;

/**
 *
 * @author Dell-User
 */
import java.util.*;
public class AbstractClass {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
                    //ask the user to enter height, width and radius
            System.out.println("Enter Height");
           double width= scanner.nextDouble();
            System.out.println("Enter Width");
            double height = scanner.nextDouble();
            System.out.println("Enter radius");
            double radius = scanner.nextDouble();

            // created an object for Rectangle class
            Rectangle myRec = new Rectangle(width, height);
            //create an object for circle class
            Circle myCirc = new Circle(radius);

            // print the area and perimeter of a Rectangle
            System.out.println(" The area of a rectangle is: " + myRec.GetArea());
            System.out.println(" The perimeter of a rectangle is: " + myRec.GetPerimeter());

            // print the area and perimeter of a circle
           System.out.println(" The area of a circle is: " + myCirc.GetArea());
            System.out.println(" The perimeter of a circle is: " + myCirc.GetPerimeter());

       
    }
}
