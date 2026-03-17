/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpart1;

/**
 *
 * @author ajkil
 */
public class Validator {
    public static boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    public static boolean checkPasswordComplexity(String password) {
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");
        return length && upper && digit && special;
    }

    public static boolean checkCellPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\+\\d{1,9}");
    }
}
