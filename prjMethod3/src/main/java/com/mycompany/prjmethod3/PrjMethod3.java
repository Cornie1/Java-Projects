/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethod3;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjMethod3 {

    public static void main(String[] args) {
        
        String strName = "", strDOB="", strCellNumber="", strIDNumber="";
        
        strName = JOptionPane.showInputDialog(null, "Please Enter your Name: ");
        
        strDOB = JOptionPane.showInputDialog(null, "Please Enter your Date Of Birth: ");
        
        strCellNumber = JOptionPane.showInputDialog(null, "Please Enter your Cell Number: ");
        
        strIDNumber = JOptionPane.showInputDialog(null, "Please Enter your ID Number: ");
        
        printDetails(strName, strDOB, strCellNumber, strIDNumber);
        
        exitApplication();
    }
private static void printDetails(String strName,String strDOB,String strCellNumber,String strIDNumber){
    JOptionPane.showMessageDialog(null, "NAME: " + strName + "\n" +
                                        "Date of Birth: " + strDOB + "\n" +
                                        "Cell Number: " + strCellNumber + "\n" +
                                        "ID Number: " + strIDNumber);
                                       
}

private static void exitApplication(){
    JOptionPane.showMessageDialog(null,"Thank you for using the programme");
    System.exit(0);
}
}
