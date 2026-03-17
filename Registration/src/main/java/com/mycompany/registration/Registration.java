/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Input*/
        System.out.print("Enter a username: ");
        String strUserName = scanner.nextLine();
        if (UsernameValidation(strUserName)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
        }

        
        System.out.print("Enter a password: ");
        String strPassword = scanner.nextLine();
        if (PasswordValidation(strPassword)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
    }
    /*Classes for Validations*/
    public static boolean UsernameValidation(String strUserName) {
        return strUserName.contains("_") && strUserName.length() <= 5;
    }

    public static boolean PasswordValidation(String strPassword) {
        boolean lengthCheck = strPassword.length() >= 8;
        boolean capitalCheck = strPassword.matches(".*[A-Z].*");
        boolean numberCheck = strPassword.matches(".*\\d.*");
        boolean specialCharCheck = strPassword.matches(".*[^a-zA-Z0-9].*");

        return lengthCheck && capitalCheck && numberCheck && specialCharCheck;
    }
}
