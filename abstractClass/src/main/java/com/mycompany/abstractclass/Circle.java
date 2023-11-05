/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclass;

/**
 *
 * @author Dell-User
 */
public class Circle extends Shape {
    
            private double radius;
        public Circle(double radius)
        {
            this.radius = radius;
        }
        public double
            GetArea()
        {
            return Math.PI * radius;
        }
        public  double
            GetPerimeter()
        {
            return 2 * Math.PI * radius;
        }
    
}
