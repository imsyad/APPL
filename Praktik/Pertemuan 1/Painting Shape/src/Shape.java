/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public abstract class Shape{
    private String shapeName;

    public Shape(String name){
        shapeName = name;
    }
    
    abstract double area();
    
    public String toString(){
        return shapeName;
    }
}