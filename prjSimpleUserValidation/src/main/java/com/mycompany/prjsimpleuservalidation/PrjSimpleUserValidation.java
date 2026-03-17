/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjsimpleuservalidation;

import java.util.Scanner;

public class PrjSimpleUserValidation {

    public static void main(String[] args) {
              
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String strName =scanner.nextLine();
        
        System.out.print("Enter your Age: ");
        int intAge =scanner.nextInt();
        
        if (!isNameValid(strName)){
            System.out.println("Name Cannot be empty.");
        } else if (!isAgeValid(intAge)){
            System.out.println("Age must be between 13 and 120");
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
        return intAge >= 13 && intAge <=120;
    }
}
