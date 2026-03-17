/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration;

/**
 *
 * @author ajkil
 */
public class Login {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String phoneNumber;

    private boolean isLoggedIn = false;

    // Constructor
    public Login(String firstName, String lastName, String username, String password, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // 1. Username must contain underscore and be no more than 5 characters
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // 2. Password must meet complexity
    public boolean checkPasswordComplexity() {
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[^a-zA-Z0-9].*");
        return length && upper && digit && special;
    }

    // 3. Cell number must start with "+" and total length ≤ 10 characters (including code)
    public boolean checkCellPhoneNumber() {
        return phoneNumber.matches("\\+\\d{1,9}");
    }

    // 4. Register user and return appropriate message
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        } else if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        } else {
            return "Username and password successfully captured.";
        }
    }

    // 5. Login verification method
    public boolean loginUser(String inputUsername, String inputPassword) {
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            isLoggedIn = true;
            return true;
        } else {
            isLoggedIn = false;
            return false;
        }
    }

    // 6. Return login status message
    public String returnLoginStatus() {
        if (isLoggedIn) {
            return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}

