/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author lab_services_student
 */
public class Person{
   
    private int intID;
    private String strName;
    
    public Person(int intID, String strName){
        this.intID = intID;
        this.strName = strName;
    }
    public int getintID(){
        return intID;
    }
    
    public String getstrName(){
        return strName;
    }
    
    public void display(){
        System.out.println(intID + "" + strName);
    }
    
    public final void dontchangeme(){
        System.out.println("I am a special method that cannot change");
    }
    
}
