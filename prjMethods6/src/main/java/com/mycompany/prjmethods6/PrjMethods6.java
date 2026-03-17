/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods6;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjMethods6 {

    public static final double dblVat = 0.15;
    
    public static void main(String[] args){
        String strProduct ="";
        double dblPrice= 0.0;
        int intQuantity = 0;
        double dblTotal = 0.0;
        double dblVatAmount = 0.0;
        double dblFinalTotal = 0.0;
        
        strProduct = JOptionPane.showInputDialog(null, "Enter Name of product");
        dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price amount for "+ strProduct));
        intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Quantity"));
        
        dblTotal = dblPrice*intQuantity;
        dblVatAmount = calculateVat(dblTotal);
        dblFinalTotal = calculateFinal(dblTotal, dblVatAmount);
        printInvoice(strProduct, dblFinalTotal, dblVatAmount, dblTotal);
        
    }
    private static double calculateVat(double dblTotal) {
        double dblVatAmount = dblTotal*dblVat;
        return dblVatAmount;
    }
    
    private static double calculateFinal(double dblTotal, double dblVatAmount) {
        double dblFinalTotal = dblTotal + dblVatAmount;
        return dblFinalTotal;
    }
    
    private static void printInvoice(String strProduct, double dblFinalTotal, double dblVatAmount, double dblTotal){
        JOptionPane.showMessageDialog(null, "Product: " + strProduct + "\n" +
                                            "EX VAT R: " + dblTotal + "\n" +
                                            "Vat Amount: " + dblVatAmount + "\n" +
                                            "Total Including Vat R:" + dblFinalTotal);
    }
}
