/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses2;

/**
 *
 * @author keaga
 */
public class product {
    
   private String strName;
   private double dblPrice;
   
   
    public void setName( String prodName){
        
        strName=prodName;
    }
     
     public String getName(){
        return strName;
    }
     
      public void setPrice( double prodPrice){
        
        dblPrice=prodPrice;
    }
     
     public double getPrice(){
        return dblPrice;
    }
     
     
      
}
