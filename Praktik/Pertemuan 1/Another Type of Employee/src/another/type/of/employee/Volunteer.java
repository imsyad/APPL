package another.type.of.employee;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Volunteer extends StaffMember{
    
    public Volunteer(String eName, String eAddress, String ePhone){
        super(eName, eAddress, ePhone);
    }
    
    public double pay(){
        return 0.0;
    }
}
