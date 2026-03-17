/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjexample3;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PrjExample3 {

    public static void main(String[] args) {
        double dblCharge = 30;
        double dblNoCharacters = 0.0;
        String strCustomerName = "";
        String strColourofCharacters= "";
        String strWoodType = "";
        
        strCustomerName = JOptionPane.showInputDialog(null,"Please enter your name");
        strWoodType = JOptionPane.showInputDialog(null,"Please enter the wood type");
        dblNoCharacters = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number of characters you want"));
        strColourofCharacters = JOptionPane.showInputDialog(null,"Please enter the colour of the characters");
        
        /*if (strWoodType.toLowerCase().equals("oak")) {
            
            dblCharge += 15;
           
        }
        if (strColourofCharacters.toLowerCase().equals("gold")) {
           dblCharge += 12;
           
             
        }
        if (dblNoCharacters>6) {
           dblCharge += (dblNoCharacters - 6)*3;
           
             
        }
        */
        
        /*if (strWoodType.toLowerCase().equals("oak")) {
            dblCharge += 15;
            
        }
        else if(dblNoCharacters==5){
            dblCharge += (dblNoCharacters-6)*3;
        }
        else if(strColourofCharacters.toLowerCase().equals("black")){
            dblCharge += 12;
        }
        else if(strColourofCharacters.toLowerCase().equals("white")){
            dblCharge += 12;
        }
        */
        if (strWoodType.toLowerCase().equals("oak")) {
            if(dblNoCharacters==5){
                if(strColourofCharacters.toLowerCase().equals("black")){
                    if(strColourofCharacters.toLowerCase().equals("white")){
                        
                        JOptionPane.showInputDialog(null,"Your sign meets the specifications");
                    }
                }
                
            }
        }
        
        System.err.println("REPORT");
        System.err.println("-----------------------");
        System.err.println("Customer name: " + strCustomerName);
        System.err.println("Wood type: " + strWoodType);
        System.err.println("Amount of characters: \t " + dblNoCharacters);
        System.err.println("Colour of characters: \t " + strColourofCharacters);
        System.err.println("Amount Owed: \t " + dblCharge);
    }
}
