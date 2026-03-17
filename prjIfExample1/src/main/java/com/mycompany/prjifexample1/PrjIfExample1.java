/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjIfExample1 {

    public static void main(String[] args) {
        
        String strEmployeeName="";
        String strTownName="";
        final String strFinal = "You can Carpool";
        final String strFinal2 = "You cannot Carpool";
        
        strEmployeeName = JOptionPane.showInputDialog(null,"Enter your employee name");
        strTownName = JOptionPane.showInputDialog(null,"Enter the town you live in");
        
        if (strTownName.toLowerCase().equals("woodstock") ||  strTownName.toLowerCase().equals("wonderlake")){
           
            JOptionPane.showMessageDialog(null,strFinal);
             
        }
        
        
        /*if (strTownName.toLowerCase().equals("woodstock")) {
           
            JOptionPane.showMessageDialog(null,strFinal);
             
        }
        else{
            JOptionPane.showMessageDialog(null,strFinal2);
        }
*/
        
        /*
        nested if statement
        */
        /*if (strTownName.toLowerCase().equals("woodstock")) {
           
            JOptionPane.showMessageDialog(null,strFinal);
             
        }
        else if (strTownName.toLowerCase().equals("wonderlake")){
            
            JOptionPane.showMessageDialog(null,strFinal);
        }
        else{
            JOptionPane.showMessageDialog(null,strFinal2);
        }
*/
    }
}
