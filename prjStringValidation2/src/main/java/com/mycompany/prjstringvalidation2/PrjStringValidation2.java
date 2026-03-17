/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringvalidation2;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class PrjStringValidation2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String strName =scanner.nextLine();
        
        System.out.print("Enter your email: ");
        String strEmail =scanner.nextLine();
        
        System.out.print("Enter your Age: ");
        int intAge =scanner.nextInt();
        
        if (!isNameValid(strName)){
            System.out.println("Name Cannot be empty.");
        } else if (!isEmailValid(strEmail)){
            System.out.println("Email must have a @ symbol"); 
        } else if (!isAgeValid(intAge)){
            System.out.println("Age must be older than 18"); 
        } else {
            System.out.println("Welcome, "+ strName + "! Your are " + intAge + " years old.");
        }
    }
    public static boolean isNameValid(String strName) {
        String strTrimmedName = strName.trim();
        
        if (strTrimmedName.isEmpty()){
            return false;
        } 
        return true;
    }
    
    public static boolean isAgeValid(int intAge) {
        return intAge >= 18;
    }
    public static boolean isEmailValid(String strEmail) {
        return strEmail.contains("@") && strEmail.contains(".");
    }
}
