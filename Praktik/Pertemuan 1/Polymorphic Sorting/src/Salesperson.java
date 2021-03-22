/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class Salesperson implements Comparable{
    
    private String firstName, lastName;
    private int totalSales;
    
    public Salesperson(String first, String last, int sales){
        
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    
    public String toString(){
        return lastName + ", " + firstName + ": \t" + totalSales;
    }
    
    public boolean equals(Object other){
        return (lastName.equals(((Salesperson)other).getLastName()) 
                && firstName.equals(((Salesperson)other).getFirstName()));
    }
    
    public int compareTo(Object other){
        int result;
         
        if(((Salesperson) other).totalSales > this.totalSales)
            result = 1;
        else if (((Salesperson) other).totalSales < this.totalSales)
            result = -1;
        else
            result =  ((Salesperson) other).firstName.compareTo(this.firstName);
        
        return result;
    }
    
    public String getFirstName(){
        
        return firstName;
    }
    
    public String getLastName(){
        
        return lastName;
    }

    public int getSales(){
        
        return totalSales;
    }
}
