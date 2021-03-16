/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Icad
 */
public class Paint {
    private double coverage;
    
    public Paint(double c){
        coverage = c;
    }
    
    public double amount(Shape s){
        System.out.println("Computing amount for " + s);
        return 0;
    }
}
