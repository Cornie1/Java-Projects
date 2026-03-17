/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbillcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjBillCalculator {

    public static final double dblTIP = 0.10;
    
    public static void main(String[] args) {
        
        String strDishName = "";
        double dblPrice = 0.0;
        int intQuantity = 0;
        double dblSubTotal = 0.0;
        double dblFinalTotal = 0.0;
        double dblTipAmount = 0.0;
        strDishName = JOptionPane.showInputDialog(null,"Enter the dish name:");
        dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the price of " + strDishName + ":"));
        intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the quantity ordered;"));
        
        dblSubTotal = dblPrice * intQuantity;
        dblTipAmount = calculateTip(dblSubTotal);
        dblFinalTotal= calculateTotal(dblSubTotal,dblTipAmount);
        printInvoice(strDishName, dblFinalTotal, dblTipAmount, dblSubTotal);
    }
    
    private static double calculateTip(double dblSubTotal){
        double dblTipAmount = dblSubTotal*dblTIP;
        return dblTipAmount;
    }
    private static double calculateTotal(double dblSubTotal, double dblTipAmount) {
        double dblFinalTotal = dblSubTotal + dblTipAmount;
        return dblFinalTotal;
    }
    
    private static void printInvoice(String strDishName, double dblFinalTotal, double dblTipAmount, double dblSubTotal){
        JOptionPane.showMessageDialog(null, "Dish: " + strDishName + "\n" +
                                            "Subtotal: R" + dblSubTotal + "\n" +
                                            "TIP: R" + dblTipAmount + "\n" +
                                            "Final Total: R" + dblFinalTotal);
    }
}
