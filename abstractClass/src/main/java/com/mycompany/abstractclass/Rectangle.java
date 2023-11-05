/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractclass;

/**
 *
 * @author Dell-User
 */
public class Rectangle extends Shape {
    
        private double width;
    private double height;
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    public  double
        GetArea()
    {
        return width * height;
    }
    public  double
        GetPerimeter()
    {
        return 2 * (width + height);
    }
}
    

