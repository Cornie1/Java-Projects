/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui7;

/**
 *
 * @author keaga
 */
public class ShippingCalculator {
    
        private double dblWeight;
        private String strShippingType;
       
    public ShippingCalculator (double dblWeight, String strShippingType){
    this.dblWeight = dblWeight;
    this.strShippingType = strShippingType;
}
    
    
 public double calculate(){
     double dblCost = 0;
     
     if (strShippingType.equals("Standard")){
         dblCost = dblWeight *5;
     } 
     else if (strShippingType.equals("Express")){
         dblCost = dblWeight * 10;  
     }
     else if (strShippingType.equals("Overnight")){
         dblCost = dblWeight * 20;  
     }
     return dblCost;  
}
    public String getSummary(){
        return "Shipping Type: " + strShippingType + "\n" + "Weight: " + dblWeight +
                "kg\n" + "Total Cost: R " + calculate() + "\n";
    }
}

        
    


   

 


