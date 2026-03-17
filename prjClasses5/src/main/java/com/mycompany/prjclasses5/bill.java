/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses5;

/**
 *
 * @author lab_services_student
 */
public class bill {
    private String strCustomersName;
    private double dblMinutesTalked;
    private double dblCostPerMinutes;

    public bill(String strCustomers,double dblMinutes, double dblCost){
    
    
        strCustomersName = strCustomers;
        dblMinutesTalked = dblMinutes;
        dblCostPerMinutes = dblCost;
    }
    public String getCustomers()
    {
        return strCustomersName;
    }
    public double getTotalDue()
    {
        return(dblMinutesTalked * dblCostPerMinutes);
    }
}
