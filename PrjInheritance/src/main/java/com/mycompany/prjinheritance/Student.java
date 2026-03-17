/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance;

/**
 *
 * @author lab_services_student
 */
public class Student {
    
    protected String strName;
    
    public Student(String strName) {
        this.strName = strName;
    }
    
    public Student() {
    }
    public void attendclass(){
        System.out.println(strName = "is attending class.");
    }
    public void submitassignment(){
        System.out.println(strName = "submitted assignement");
    }
    
    public String getName(){
        return strName;
    }
}

