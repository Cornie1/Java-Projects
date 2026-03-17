/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput1;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PrjUserInput1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        System.err.print("Enter the customer name");
        String strCustomer = scan.nextLine();
        
        System.err.print("Enter the Product Name");
        String strProduct = scan.nextLine();
        
        System.err.print("Enter the Address name");
        String strAddress = scan.nextLine();
        
        System.err.println("DELIVERY REPORT");
        System.err.println("-----------------------");
        System.err.println("Customer: \t " + strCustomer);
        System.err.println("Product: \t " + strProduct);
        System.err.println("Delivery Address: " + strAddress);
    }
}
