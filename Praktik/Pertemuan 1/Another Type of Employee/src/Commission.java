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
    
    public Commission(String eName, String eAddress, String ePhone, 
            String socSecNumber, double rate, double comRate){
        
        //call parent's constructor
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        //set commission rate
        commissionRate = comRate;
        totalSales = 0;
    }
    
    public void addSales(double totalSales){
        this.totalSales += totalSales;
    }
    
    @Override
    public double pay(){
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return payment;
    }
    
    @Override
    public String toString(){
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
