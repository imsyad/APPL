/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Commission extends Hourly{
    
    private double totalSales, commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double comRate){
        
        super(eName, eAddress, ePhone, socSecNumber, rate);
        commissionRate = comRate;
    }
    
    public void addSales(double totalSales){
        totalSales = 
    }
    
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
    }
}
