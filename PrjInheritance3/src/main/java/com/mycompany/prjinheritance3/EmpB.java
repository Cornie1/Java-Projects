/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author lab_services_student
 */
public class EmpB extends Person{
    
    private double dblSalary;
    
    public EmpB(int intID, String strName, double dblSalary){
        super(intID, strName);
        this.dblSalary = dblSalary;
    }
    public double getSalary(){
        return dblSalary;
    }
    
    @Override
    public void display(){
        System.out.println(getintID() + " " + getstrName() + " The salary for this employee is private ");
    }
}
