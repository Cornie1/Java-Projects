/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods5;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjMethods5 {

    public static final int intTicketPrice = 100;
    
    public static void main(String[] args){
        int intQuantity= 0;
        int intTotalCost = 0;
        
        intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of tickets"));
        
        intTotalCost = calculateTotal(intQuantity);
        
        JOptionPane.showMessageDialog(null,"Total Cost is R" + intTotalCost);
    }
    
    private static int calculateTotal(int intQuantity){
        int intTotal = intQuantity*intTicketPrice;
        return intTotal;
    }
}
