/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample2;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjIfExample2 {

    public static void main(String[] args) {
        final int intPass = 60;
        int intTest2 = 0;
        int intTest1 = 0;
        double dblAverage = 0.0;
        
        
        intTest1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Test score for test1"));
        intTest2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Test score for test2"));
        
        dblAverage=intTest1+intTest2/2;
        if (dblAverage>=intPass ) {
           
            JOptionPane.showMessageDialog(null,"Congratz you are a high performa");
             
        }
        else{
            JOptionPane.showMessageDialog(null,"You Faileds");
        }
    }
}
