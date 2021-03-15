/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Executive extends Employee{
    private double bonus;
    
    public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
    }
    
    public void awardBonus(double execBonus){
        bonus = execBonus;
    }
    
    public double pay(){
        double payment = super.pay() + bonus;
        bonus = 0;
        return payment;
    }
}
