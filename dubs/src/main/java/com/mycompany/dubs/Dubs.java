/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dubs;

import javax.swing.JOptionPane;

/**
 *
 * @author keaga
 */
public class Dubs{

    public static void main(String[] args) {
        
        
        String strProductName = "";
        double dblProductAmount = 0.0;
        double dblProductPrice = 0.0;
        double dblPriceOwed = 0;
        
       strProductName= JOptionPane.showInputDialog(null,"Product Name: " );
       dblProductAmount= Double.parseDouble(JOptionPane.showInputDialog(null,"Product Quantity: " ));
       dblProductPrice= Double.parseDouble(JOptionPane.showInputDialog(null,"Product Price: " ));
       
       dblPriceOwed = calculateTotal(dblProductPrice,dblProductAmount);
       
       JOptionPane.showMessageDialog(null, dblPriceOwed);
      
       
    }
    
     public static double calculateTotal(double dblProductPrice,  double dblProductAmount){
        
        double dblVat=dblProductAmount*dblProductPrice*0.15; 
        
        double dblDiscountTotal=dblProductPrice*dblProductAmount-dblVat;
        
        return dblDiscountTotal;
    
    
     }
    
}