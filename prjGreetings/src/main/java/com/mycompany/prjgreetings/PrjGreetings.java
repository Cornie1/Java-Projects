/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjgreetings;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjGreetings {

    public static void main(String[] args) {
        String strName = "";
        
        strName = JOptionPane.showInputDialog(null, "Please Enter your Name: ");
        
                printDetails(strName);
                
                exitApplication(strName);
    }
    public static void printDetails(String strName){
        JOptionPane.showMessageDialog(null, "Hello " + strName + "\n");
    }
    
    public static void exitApplication(String strName){
    JOptionPane.showMessageDialog(null,"Thank you for using the programme" + strName);
    System.exit(0);
}
}
