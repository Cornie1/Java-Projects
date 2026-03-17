/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses4;

import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class PrjClasses4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Num1: ");
        int intNumberone = scan.nextInt();
        
        System.out.print("Enter Num2: ");
        int intNumbertwo = scan.nextInt();
        
        
        calculations c = new calculations(intNumberone, intNumbertwo);
        
        System.out.println("Addition: " + c.getAddition());
        System.out.println("Subtraction: " + c.getSubtraction());
        System.out.println("Division: " + c.getDivision());
        System.out.println("Multiplied: " + c.getMultiplication());
        
        
        
    }
    
    
}
