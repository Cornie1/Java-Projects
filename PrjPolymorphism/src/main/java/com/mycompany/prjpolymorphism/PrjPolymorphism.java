/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjpolymorphism;

/**
 *
 * @author lab_services_student
 */
public class PrjPolymorphism {

    public static void main(String[] args) {
        Pizza P = new Pizza();
        P.order();
        P.order("Chicken");
        P.order("Chicken", "Bacone");
        P.order(8);
        
        
    }
}
