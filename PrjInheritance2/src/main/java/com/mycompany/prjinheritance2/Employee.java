/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance2;

/**
 *
 * @author lab_services_student
 */
public class Employee {
    private String strName;
    private double dblBaseSalary;
    
    public Employee(String strName, double dblBaseSalary){
        this.strName = strName;
        this.dblBaseSalary = dblBaseSalary;
    }
    
    public String getName(){
        return strName;
    }
    
    public double calculatePay(){
        return dblBaseSalary ;
    }
}
