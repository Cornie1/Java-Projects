/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjcalculatevat;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjCalculateVat {

    public static final double intVatPrice = 0.15;
    
    public static void main(String[] args){
        String strName ="";
        double dblPrice= 0.0;
        double dblQuantity = 0.0;
        double dblPriceOwed = 0;
        
        strName = JOptionPane.showInputDialog(null, "Enter Name of product");
        dblQuantity = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Quantity"));
        dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price amount"));
        
        
        dblPriceOwed = calculateTotal(dblPrice,dblQuantity);
        
        JOptionPane.showMessageDialog(null,"Name of product is " + strName +"\nThe Quantity is "+dblQuantity + "\nThe Amount Owed " + dblPriceOwed + "\n Orignal price: " + dblPrice*dblQuantity + "\nDiscounted amount" + dblQuantity*dblPrice*intVatPrice);
        
        
    }   
    private static double calculateTotal(double dblPrice, double dblQuanity) {
        double dblAmount = dblQuanity*dblPrice*intVatPrice;
        double dblTotalAmountOwed = dblQuanity*dblPrice+dblAmount;
        
        return dblTotalAmountOwed;
    }
    
}
