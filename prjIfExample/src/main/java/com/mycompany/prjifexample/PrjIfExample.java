/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjIfExample {

    public static void main(String[] args) {
        
        String strIdNumber ="";
        int intNumSold = 0;
        final int intHigh = 25;
        
        
        strIdNumber = JOptionPane.showInputDialog(null,"enter your id number");
        intNumSold = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number of items sold"));
        
        
        if (intNumSold > intHigh) {
           
            JOptionPane.showMessageDialog(null,"Congratz you are a high performa");
             
        }
        
    }
}
