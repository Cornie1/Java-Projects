/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpolymorphism;

/**
 *
 * @author lab_services_student
 */
public class Pizza {
    
    public void order(String strToppingA){
        System.out.println("Topping on the pizza" + strToppingA);
    }
    
    public void order(String strToppingA, String strToppingB){
        System.out.println("Topping on the pizza" + strToppingA + "And" + strToppingB);
    }
    
    public void order(){
        System.out.println("Plain Pizza" );
    }
    
    public void order(int intQty){
        System.out.println(intQty + "Plain Pizza's" );
    }
    
}
