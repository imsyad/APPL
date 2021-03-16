/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Rectangle extends Shape{
    private double width, length;
    
    public Rectangle(double w, double l){
        super ("Rectangle");
        width = w;
        length = l;
    }
    
    public double area(){
        return width*length;
    }
    
    public String toString(){
        return super.toString() + " of width " + width + " and length " + length;
    }
}
