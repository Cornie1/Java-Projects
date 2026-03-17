/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance2;

/**
 *
 * @author lab_services_student
 */
public class OvertimeEmployee extends Employee{
    
    private int intOvertimeHours;
    private double dblOvertimeRate;
    
    public OvertimeEmployee(String strName, double dblBaseSalary, int intOvertimeHours, double dblOvertimeRate){
        super(strName,dblBaseSalary);
        this.intOvertimeHours = intOvertimeHours;
        this.dblOvertimeRate = dblOvertimeRate; 
    }
    @Override
    public double calculatePay(){
        return super.calculatePay() + (intOvertimeHours*dblOvertimeRate);
    }
}
