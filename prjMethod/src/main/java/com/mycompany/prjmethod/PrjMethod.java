/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethod;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class PrjMethod {

    public static void main(String[] args) {
        
        System.out.println("idk what to put here");
        
        calculateVAT();
        
        displayData();
    }
    
    private static void calculateVAT() {
        Scanner scan = new Scanner(System.in);
        
        final double dblVat = 0.15; 
        double dblPrice = 0.0, dblVatamount = 0.0, dblActualPrice = 0.0; 
        
        System.out.println("Plesae enter the Price:");
        dblPrice = scan.nextDouble();
        
        dblVatamount= (dblPrice*dblVat);
        dblActualPrice = (dblPrice+dblVatamount);
        
      
        System.err.println("DELIVERY REPORT");
        System.err.println("-----------------------");
        System.err.println("Price orignally: " + dblPrice);
        System.err.println("Vat Amount: " + dblVatamount);
        System.err.println("Amount Owed: \t " + dblActualPrice);
    }
    
    private static void displayData() {
        System.out.println("idk what to put here");
    }
}
