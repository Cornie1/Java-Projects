/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses5;

import java.util.FormattableFlags;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjClasses5 {

    public static void main(String[] args) {      
        String strCustomersName= "";
        double dblMinutesTalked =0;
        double dblCostPerMinutes = 0;
        strCustomersName = JOptionPane.showInputDialog(null, "Please Enter your Name: ");
        dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Cost of minutes: "));
        dblCostPerMinutes = Double.parseDouble(JOptionPane.showInputDialog(null, "Please Enter Amount of minutes: "));
       
        
        bill b = new bill(strCustomersName, dblMinutesTalked, dblCostPerMinutes);
        
        JOptionPane.showMessageDialog(null, "Your Name: " + b.getCustomers() + "\n" +
                                            "CostPerMinute: " + dblCostPerMinutes + "\n" +
                                            "MinutesTalked: " + dblMinutesTalked + "\n"+
                                            "TotalAmountDue: " + b.getTotalDue() + "\n");
    }
     
}
